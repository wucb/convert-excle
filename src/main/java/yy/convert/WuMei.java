package yy.convert;

import yy.constant.CommonConstant;
import yy.service.WumeiService;
import yy.util.ExcelUtil;
import yy.util.PropertiesFile;

import java.util.List;

/**
 * 物美表格转换
 */
public class WuMei {
    public void doConvert() {
        //获取当前app的目录
        String filepath = PropertiesFile.getAppPath(PropertiesFile.class);
        String selfPath = filepath + CommonConstant.SELF_FILE;
        String wumeiPath = filepath + CommonConstant.WUMEI_FILE;
        String finalPath = filepath + CommonConstant.FINAL_FILE;

        WumeiService wumeiService = new WumeiService();
        wumeiService.convert(selfPath,wumeiPath,finalPath);



    }
}
