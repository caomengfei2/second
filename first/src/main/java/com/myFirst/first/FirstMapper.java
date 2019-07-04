package com.myFirst.first;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface FirstMapper {

    @Select("select count(*) from app_biz")
    Integer getCount();
}
