package jtm.activity09;

import java.util.Objects;

/*- TODO #1
 * Implement Comparable interface with Order class
 * Hint! Use generic type of comparable items in form: Comparable<Order>
 *
 * TODO #2 Override/implement necessary methods for Order class:
 * - public Order(String orderer, String itemName, Integer count) — constructor of the Order
 * - public int compareTo(Order order) — comparison implementation according to logic described below
 * - public boolean equals(Object object) — check equality of orders
 * - public int hashCode() — to be able to handle it in some hash... collection
 * - public String toString() — string in following form: "ItemName: OrdererName: Count"
 *
 * Hints:
 * 1. When comparing orders, compare their values in following order:
 *    - Item name
 *    - Customer name
 *    - Count of items
 * If item or customer is closer to start of alphabet, it is considered "smaller"
 *
 * 2. When implementing .equals() method, rely on compareTo() method, as for sane design
 * .equals() == true, if compareTo() == 0 (and vice versa).
 *
 * 3. Also Ensure that .hashCode() is the same, if .equals() == true for two orders.
 *
 */
public class Order implements Comparable<Order> {
	String customer; // Name of the customer
	String name; // Name of the requested item
	int count; // Count of the requested items

	@Override
	public int compareTo(Order o) {
		if (this.name.compareTo(o.name) < 0) {
			return -1;
		} else if (this.name.compareTo(o.name) > 0) {
			return 1;
		} else {
			if (this.customer.compareTo(o.customer) < 0) {
				return -1;
			} else if (this.customer.compareTo(o.customer) > 0) {
				return 1;
			} else {
				if (this.count < o.count) {
					return -1;
				} else if (this.count > o.count) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}		if (obj == null) {
			return false;
		}		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		Order o = (Order) obj;
		return this.compareTo(o) == 0;
		
//		When implementing .equals() method, rely on compareTo() method, as for sane design
//		 .equals() == true, if compareTo() == 0 (and vice versa).
	
	}

	public int hashCode() {
		return Objects.hash(this.customer, this.name, this.count);
//		3. Also Ensure that .hashCode() is the same, if .equals() == true for two orders.
		
	}

	public Order(String orderer, String itemName, Integer count) {
		this.customer = orderer;
		this.name = itemName;
		this.count = count;
	
	}

	public String toString() {
		return this.name + ": " + this.customer + ": " + this.count;
		// "ItemName: OrdererName: Count"
	}
}


