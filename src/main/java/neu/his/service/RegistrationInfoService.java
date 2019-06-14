package neu.his.service;

import neu.his.bean.RegistrationInfo;
import neu.his.bean.RegistrationLevel;
import neu.his.bean.ScheduleInfo;

import java.math.BigDecimal;
import java.util.List;

/**
 * 处理挂号信息
 * @author lsy
 * @version 1.8
 * @since 1.0
 */
public interface RegistrationInfoService {
    /**
     * 转换挂号来源
     * @param type 类型/名称
     * @return 名称/名称
     */
    String translateResource(String type);
    /**
     * 转换是否需要病历本
     * @param type 类型/名称
     * @return 名称/名称
     */
    String translateMedicalrecordbook(String type);
    /**
     * 转换是否看诊
     * @param type 类型/名称
     * @return 名称/名称
     */
    String translateIsSeen(String type);
    /**
     * 转换缴费状态
     * @param type 类型/名称
     * @return 名称/名称
     */
    String translatePaymentState(String type);
    /**
     * 转换挂号状态
     * @param type 类型/名称
     * @return 名称/名称
     */
    String translateRegistrationState(String type);
    /**
     * 转换是否诊断完毕
     * @param type 类型/名称
     * @return 名称/名称
     */
    String translateIsCompleted(String type);
    /**
     * 转换性别
     * @param type 类型/名称
     * @return 名称/名称
     */
    String translateSex(String type);

    /**
     * 列出所有挂号信息
     * @return 挂号信息列表
     */
    List<RegistrationInfo> findAll();

    /**
     * 计算应收金额
     * @param level_name 挂号级别名称
     * @param isNeed 是否需要病历本
     * @return 应收金额
     */
    Double calculateCost(String level_name,String isNeed);

    /**
     * 计算年龄
     * @param birthday 出生日期
     * @return 年龄
     */
    int age(String birthday);

    /**
     * 生成流水号
     * @return 流水号
     */
    String createSerialNumber();

    /**
     * 挂号
     * @param registrationInfo 挂号信息
     */
    void registration(RegistrationInfo registrationInfo);
}