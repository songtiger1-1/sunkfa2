package com.fh.util;

import java.io.File;
import java.io.IOException;


public class FileUtil {
	
	public static void main(String[] args) {
		// 创建目录
	   String dirName = "d:/ss/topic/";
	   FileUtil.createDir(dirName);
	}
	
	/**
	* 创建目录
	* @param destDirName 目标目录名
	* @return 目录创建成功返回true，否则返回false
	*/
	public static boolean createDir(String destDirName) {
		File dir = new File(destDirName);
		if(dir.exists()) {
			return false;
		}
		if(!destDirName.endsWith(File.separator)){
			destDirName = destDirName + File.separator;
		}
		// 创建单个目录
		if(dir.mkdirs()) {
			return true;
		} else {
			return false;
		}
	}
	
	/**  
     *  删除文件  
     *  @param  filePathAndName  String  文件路径及名称  如c:/fqf.txt  
     *  @param  fileContent  String  
     *  @return  boolean  
     */  
   public static void delFile(String  filePathAndName)  {  
       try  {  
           String  filePath  =  filePathAndName;  
           filePath  =  filePath.toString();  
           java.io.File  myDelFile  =  new  java.io.File(filePath);  
           myDelFile.delete();  
 
       }  
       catch  (Exception  e)  {  
           System.out.println("删除文件操作出错");  
           e.printStackTrace();  
 
       }  
 
   }

}