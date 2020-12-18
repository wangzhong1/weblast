package wz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wz.dao.ItemDao;
import wz.vo.Item;

@Service
public class ItemService {

    @Autowired
    private ItemDao itemDao;

    public int insertItem(Item item) {
        return itemDao.insertItem(item);
    }

    // 验证货号
    public int checkItemNo(String itemNo) {
        int flag = itemDao.checkItemNo(itemNo);
        if(flag != 0){
            flag = 1;
        }
        return flag;
    }

    // 验证条形码
    public int checkBarcode(String barcode) {
        int flag = itemDao.checkBarcode(barcode);
        if(flag != 0){
            flag = 1;
        }
        return flag;
    }
}
