package com.dao;

import com.entity.YangzhiquyuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YangzhiquyuLiuyanView;

/**
 * 养殖区域留言 Dao 接口
 *
 * @author 
 */
public interface YangzhiquyuLiuyanDao extends BaseMapper<YangzhiquyuLiuyanEntity> {

   List<YangzhiquyuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
