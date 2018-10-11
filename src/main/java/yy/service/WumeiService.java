package yy.service;

import yy.util.ExcelUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * 物美解析服务类
 */
public class WumeiService {

    /**
     * 执行转换
     *
     * @param selfPath
     * @param wumeiPath
     * @param finalPath
     */
    public void convert(String selfPath, String wumeiPath, String finalPath) {
        //处理文件1
        getSelfPathDate(selfPath);
        // 处理文件二 数据
        makeWumeiFile(wumeiPath);
        //合并到文件三
        makeMerge();
        //写入文件
        toLocalFile(finalPath);

    }

    private void toLocalFile(String finalPath) {
    }

    private void makeWumeiFile(String wumeiPath) {

    }

    private void makeMerge() {


    }

    private void getSelfPathDate(String selfPath) {
        List<List<String>> lists = readExcle(selfPath);

    }


    /**
     * 读取excle;
     *
     * @param path
     */
    public List<List<String>> readExcle(String path) {
        try {
            InputStream inputStream = new FileInputStream(new File(path));
            return new ExcelUtil(inputStream, "").read();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("读取文件出错，文件名：" + path);
        }
        return null;
    }
}
