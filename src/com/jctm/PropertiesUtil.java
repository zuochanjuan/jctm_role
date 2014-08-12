package com.jctm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * 对属性文件操作
 * @author 程程 
 *
 */
public class PropertiesUtil {
	
	/**
	 * 加载属性文件
	 * @param pathName 路径
	 * @return Properties
	 */
	public static Properties loadProperties(String pathName){
		try {
			Properties p = new  Properties(); 
			InputStream in = PropertiesUtil.class.getResourceAsStream(pathName); 
			//InputStream in = new FileInputStream(pathName); 			
			p.load(in);
			in.close();   
			return p;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	/**
	 * 从pathName属性文件中按key查询出value
	 * @param pathName 文件路径
	 * @param key 键
	 * @return value
	 */
	public static String getPropertyValue(String pathName,String key){
		Properties pro=loadProperties(pathName);
		if(pro!=null){
			return pro.getProperty(key).trim();
		}
		return null;
	}
	/**
     *更改属性文件的值，如果对应的属性不存在，则自动增加该属性

     *@parampropertiesFileNameproperties 文件名，如a.properties
     *@parampropertyName 属性名
     *@parampropertyValue 将属性名更改成该属性值

     *@return 是否操作成功
     */
    public static  boolean changeValueByPropertyName(String propertiesFileName,String propertyName,String propertyValue) {
        boolean writeOK=true;
        Properties p=new Properties();
        FileInputStream in;
        try {
            in = new FileInputStream(propertiesFileName);
            p.load(in);//
            in.close();
            p.setProperty(propertyName,propertyValue);//设置属性值，如不属性不存在新建
            //p.setProperty("testProperty","testPropertyValue");
            FileOutputStream out=new FileOutputStream(propertiesFileName);//输出流

            p.store(out,"Just Test");//设置属性头，如不想设置，请把后面一个用""替换掉

            out.flush();//清空缓存，写入磁盘

            out.close();//关闭输出流

        } catch (Exception e) {
            e.printStackTrace();
        }
        return writeOK;
    }
    
//    /**
//     *更改属性文件的值，如果对应的属性不存在，则自动增加该属性
//
//     *@parampropertiesFileNameproperties 文件名，如a.properties
//     *@map 属性map
//     *@return 是否操作成功
//     */
//    public static  boolean changeValueByPropertyName(String propertiesFileName,Map<String,String> map) {
//        boolean writeOK=true;
//        Properties p=new Properties();
//        FileInputStream in;
//        try {
//            in = new FileInputStream(propertiesFileName);
//            p.load(in);//
//            in.close();
//            FileOutputStream out=new FileOutputStream(propertiesFileName);//输出流
//
//            p.store(out,"Just Test");//设置属性头，如不想设置，请把后面一个用""替换掉
//            for (String str : map.keySet()) {
//            	 p.setProperty(str,map.get(str));//设置属性值，如不属性不存在新建
//			}
//           
//            //p.setProperty("testProperty","testPropertyValue");
//          
//
//            out.flush();//清空缓存，写入磁盘
//
//            out.close();//关闭输出流
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return writeOK;
//    }
}
