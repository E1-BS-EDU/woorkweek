package com.koko.workweek.kate.site.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.koko.workweek.kate.site.dto.SiteVo;

@Mapper
public interface SiteMapper {
	/*공지사항 목록 조회*/
	List<SiteVo> getSiteList();
}
