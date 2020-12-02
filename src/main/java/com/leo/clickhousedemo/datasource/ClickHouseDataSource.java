package com.leo.clickhousedemo.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.leo.clickhousedemo.config.ClickHouseDataSourceConfig;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.lang.reflect.InvocationTargetException;

/**
 * @Deseription : TODO
 * @Author : xiangguang.wu
 * @Date : 2020/12/1
 **/
@Configuration
public class ClickHouseDataSource {
    @Resource
    private ClickHouseDataSourceConfig clickHouseDataSourceConfig;

    @Bean
    public DataSource getCkDataSource() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        DruidDataSource ckDataSource = new DruidDataSource();
        PropertyUtils.copyProperties(ckDataSource, clickHouseDataSourceConfig);
//        ckDataSource.setUrl(clickHouseDataSourceConfig.getUrl());
//        ckDataSource.setDriverClassName(clickHouseDataSourceConfig.getDriverClassName());
//        ckDataSource.setInitialSize(clickHouseDataSourceConfig.getInitialSize());
//        ckDataSource.setMinIdle(clickHouseDataSourceConfig.getMinIdle());
//        ckDataSource.setMaxActive(clickHouseDataSourceConfig.getMaxActive());
//        ckDataSource.setMaxWait(clickHouseDataSourceConfig.getMaxWait());
        return ckDataSource;
    }
}
