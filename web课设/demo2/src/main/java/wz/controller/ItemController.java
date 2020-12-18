package wz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wz.service.ItemService;
import wz.vo.Item;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    // 插入商品
    @RequestMapping("/insertItem")
    @ResponseBody
    public int insertItem(Item item){
        return itemService.insertItem(item);
    }

    // 验证货号唯一
    @RequestMapping("/checkItemNo")
    @ResponseBody
    public int checkItemNo(String itemNo){
        return itemService.checkItemNo(itemNo);
    }

    // 验证条形码唯一
    @RequestMapping("/checkBarcode")
    @ResponseBody
    public int checkBarcode(String barcode){
        return itemService.checkBarcode(barcode);
    }

}
