package wz.dao;

import wz.vo.Catalog;

import java.util.List;

public interface CatalogDao {

    // 查询一级栏目
    List<Catalog> selectCatalogOne();
    // 根据一级栏目查询二级栏目
    List<Catalog> selectCatalogTwoByPid(Integer pId);
}
