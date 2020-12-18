package wz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wz.dao.CatalogDao;
import wz.vo.Catalog;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private CatalogDao catalogDao;


    public List<Catalog> selectCatalogOne() {
        return catalogDao.selectCatalogOne();
    }

    public List<Catalog> selectCatalogTwoByPid(Integer pId) {
        return catalogDao.selectCatalogTwoByPid(pId);
    }
}
