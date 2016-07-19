package com.wtao.hello;

import java.io.File;

/**
 * 
 * @author wtao
 *
 */
public class FileInfo {

	private File file;
	private Long length;

	public FileInfo() {
	}

	public FileInfo(File file, Long length) {
		super();
		this.file = file;
		this.length = length;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "FileInfo [file=" + file + ", length=" + length + "]";
	}

}
