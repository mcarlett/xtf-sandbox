package org.example;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SystemUtils {

	public static List<String> listDirectory(String dir) throws IOException {

		List<String> innerFiles = new ArrayList<>();

		try (DirectoryStream<Path> paths = Files.newDirectoryStream(Paths.get(dir))) {
			paths.forEach(path -> {
				innerFiles.add(path.toAbsolutePath().normalize().toString());
			});
		}
		return innerFiles;
	}
}
