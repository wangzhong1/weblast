package wz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wz.dao.MeteringDao;
import wz.vo.Metering;

import java.util.List;

@Service
public class MeteringService {

    @Autowired
    private MeteringDao meteringDao;

    public List<Metering> selectMeterings() {
        return meteringDao.selectMeterings();
    }
}
