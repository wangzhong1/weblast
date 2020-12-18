package wz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wz.service.MeteringService;
import wz.vo.Metering;

import java.util.List;

@Controller
public class MeteringController {

    @Autowired
    private MeteringService meteringService;

    @RequestMapping("/selectMeterings")
    @ResponseBody
    public List<Metering> selectMeterings(){
        List<Metering> meterings = meteringService.selectMeterings();
        return meterings;
    }
}
