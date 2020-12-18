package wz.dao;

import wz.vo.Item;

public interface ItemDao {

    // 插入商品信息
    int insertItem(Item item);

    // 验证货号
    int checkItemNo(String itemNo);

    // 验证条形码
    int checkBarcode(String barcode);
}
