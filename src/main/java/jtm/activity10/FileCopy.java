package jtm.activity10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FilenameUtils;
import org.apache.maven.shared.utils.io.FileUtils;

public class FileCopy { /*
						 * TODO Implement method that takes path to file as a
						 * parameter And copies whole contents of the file to
						 * the same location but with a new file name:
						 * <old_file_name>_backup e.g. if file is data.txt copy
						 * should be named data.txt_backup
						 */
	public void copyFile(String filePath) throws IOException {
		File source = new File(filePath);
		File dest = new File(filePath + "_backup");
		FileUtils.copyFile(source, dest);// List<String> lns =
											// Files.readAllLines(Paths.get(filePath));
		// Files.write(Paths.get(filePath + "_backup"), lns);
	}
}