package wz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wz.dao.ProductionAreaDao;
import wz.vo.ProductionArea;

import java.util.List;

@Service
public class ProductionAreaService {

    @Autowired
    private ProductionAreaDao productionAreaDao;

    public List<ProductionArea> selectProductionAreas() {
        return productionAreaDao.selectProductionAreas();
    }
}
