package wz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wz.service.CatalogService;
import wz.vo.Catalog;

import java.util.List;

@Controller
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @RequestMapping("/selectCatalogOne")
    @ResponseBody
    public List<Catalog> selectCatalogOne(){
        List<Catalog> catalogs = catalogService.selectCatalogOne();
        return catalogs;
    }

    @RequestMapping("/selectCatalogTwoByPid")
    @ResponseBody
    public List<Catalog> selectCatalogOne(Integer pId){
        List<Catalog> catalogs = catalogService.selectCatalogTwoByPid(pId);
        return catalogs;
    }

}
