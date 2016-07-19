package com.wtao.hello;

/**
 * д©б╪пео╒
 * @author wl
 *
 */
public class DirInfo {

	private String dirNum;
	private String fileNum;
	private long length;
	/**
	 * @param dirNum
	 * @param fileNum
	 * @param length
	 */
	public DirInfo(String dirNum, String fileNum, long length) {
		super();
		this.dirNum = dirNum;
		this.fileNum = fileNum;
		this.length = length;
	}
	/**
	 * @return the dirNum
	 */
	public String getDirNum() {
		return dirNum;
	}
	/**
	 * @param dirNum the dirNum to set
	 */
	public void setDirNum(String dirNum) {
		this.dirNum = dirNum;
	}
	/**
	 * @return the fileNum
	 */
	public String getFileNum() {
		return fileNum;
	}
	/**
	 * @param fileNum the fileNum to set
	 */
	public void setFileNum(String fileNum) {
		this.fileNum = fileNum;
	}
	/**
	 * @return the length
	 */
	public long getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(long length) {
		this.length = length;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DirInfo [" + (dirNum != null ? "dirNum=" + dirNum + ", " : "")
				+ (fileNum != null ? "fileNum=" + fileNum + ", " : "")
				+ "length=" + length + "]";
	}
	
	
}
