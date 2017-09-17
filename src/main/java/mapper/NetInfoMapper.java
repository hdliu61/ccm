package mapper;

import java.util.List;
import pojo.NetInfo;

public interface NetInfoMapper {
    /**
     * 获取最新的一个网络信息
     * @param ip
     * @return
     */
    NetInfo selectLastedNetInfo(String ip);

    List<NetInfo> selectNewInfoByHour(String ip);

}