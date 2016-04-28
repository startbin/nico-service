package com.asknico.demo.model.entities;


/**
 * 分页工具类
 * PageEx
 */
public class PageEx {

	private int pageSize; 				// 每页显示条目数 
	private int pageIndex; 			// 当前页
	/*private String fieldName;			// 字段名		实体字段名
	private String sortType;			// 排序类型：		ASC、DESC
*/	private String strID;				// 备用ID字段(多表查询可用)
	private String strName;			// 备用Name字段(多表查询可用)
	private String strRegion;			// 备用Region字段
	private Integer	intLevel;			// 备用HospitalLevel字段 

	public PageEx(){}

	// 分页
	public PageEx(int pageIndex,int pageSize) {
		this.pageIndex = (pageIndex - 1) * pageSize;
		this.pageSize = pageSize;
	}

	public PageEx(String strRegion) {
		this.strRegion = strRegion;
	}

	// 分页+名 (医院检索页)
	public PageEx(int pageIndex,int pageSize,String strName) {
		this.pageIndex = (pageIndex - 1) * pageSize;
		this.pageSize = pageSize;
		this.strName = strName;
	}

	// 分页、科室查询(分页+ID+名)
	public PageEx(int pageIndex,int pageSize,String strID,String strName) {
		this.pageIndex = (pageIndex - 1) * pageSize;
		this.pageSize = pageSize;
		this.strID = strID;
		this.strName = strName;
	}

	// 分页、科室查询(医生检索页)
	public PageEx(int pageIndex,int pageSize,String strName,String strRegion,Integer intLevel) {
		this.pageIndex = (pageIndex - 1) * pageSize;
		this.pageSize = pageSize;
		this.strName = strName;
		this.strRegion = strRegion;
		this.intLevel = intLevel;
	}

	// 分页、科室查询
	public PageEx(int pageIndex,int pageSize,String strID,String strName,String strRegion,Integer intLevel) {
		this.pageIndex = (pageIndex - 1) * pageSize;
		this.pageSize = pageSize;
		this.strID = strID;
		this.strName = strName;
		this.strRegion = strRegion;
		this.intLevel = intLevel;
	}

	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public String getStrID() {
		return strID;
	}
	public void setStrID(String strID) {
		this.strID = strID;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrRegion() {
		return strRegion;
	}
	public void setStrRegion(String strRegion) {
		this.strRegion = strRegion;
	}
	public Integer getIntLevel() {
		return intLevel;
	}
	public void setIntLevel(Integer intLevel) {
		this.intLevel = intLevel;
	}
}
