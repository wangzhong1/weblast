package wz.vo;

// 商品
public class Item {

    private Integer id;
    private String itemNo;
    private String barcode;
    private String chName;
    private Integer productionAreaId;
    private Integer meteringId;
    private Integer oneCatalogId;
    private Integer twoCatalogId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public Integer getProductionAreaId() {
        return productionAreaId;
    }

    public void setProductionAreaId(Integer productionAreaId) {
        this.productionAreaId = productionAreaId;
    }

    public Integer getMeteringId() {
        return meteringId;
    }

    public void setMeteringId(Integer meteringId) {
        this.meteringId = meteringId;
    }

    public Integer getOneCatalogId() {
        return oneCatalogId;
    }

    public void setOneCatalogId(Integer oneCatalogId) {
        this.oneCatalogId = oneCatalogId;
    }

    public Integer getTwoCatalogId() {
        return twoCatalogId;
    }

    public void setTwoCatalogId(Integer twoCatalogId) {
        this.twoCatalogId = twoCatalogId;
    }
}
