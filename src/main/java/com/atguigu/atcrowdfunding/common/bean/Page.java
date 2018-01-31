package com.atguigu.atcrowdfunding.common.bean;

import java.util.List;

public class Page<T> {
	private Integer totalsize;
	private Integer totalno;
	private Integer pageno;
	private Integer pagesize;
	private List<T> datas;
	public Integer getTotalsize() {
		return totalsize;
	}
	/**
	 * 
	 * @param totalsize
	 * 在设置totalSize的时候重新计算了totalNo
	 */
	public void setTotalsize(Integer totalsize) {
		/*if ( totalsize % pagesize == 0 ) {
    		totalno = totalsize / pagesize;
    	} else {
    		totalno = totalsize / pagesize + 1;
    	}*/
		this.totalsize = totalsize;
	}
	public Integer getTotalno() {
		return totalno;
	}
	public void setTotalno(Integer totalno) {
		this.totalno = totalno;
	}
	public Integer getPageno() {
		return pageno;
	}
	public void setPageno(Integer pageno) {
		this.pageno = pageno;
	}
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
}
