package wz.dao;

import wz.vo.Metering;

import java.util.List;

public interface MeteringDao {

    // 查询所有计量
    List<Metering> selectMeterings();
}
