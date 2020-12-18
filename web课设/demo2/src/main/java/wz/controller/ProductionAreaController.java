package wz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wz.service.ProductionAreaService;
import wz.vo.ProductionArea;

import java.util.List;

@Controller
public class ProductionAreaController {

    @Autowired
    private ProductionAreaService productionAreaService;

    @RequestMapping("/selectProductionAreas")
    @ResponseBody
    public List<ProductionArea> selectProductionAreas(){
        List<ProductionArea> productionAreas = productionAreaService.selectProductionAreas();
        return productionAreas;
    }

}
