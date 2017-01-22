package com.wtao.hello;

import java.io.File;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * 
 * @author wtao
 *
 */
public class FileInfo {

	private File file;
	private Long length;
	private String name;

	public FileInfo() {
	}
	
	public String getName() {
		return name;
	}

	public void setFile(String name) {
		this.name = name;
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
		return "FileInfo [file=" + file + ", length=" + length +",name="+name+ "]";
	}

}
