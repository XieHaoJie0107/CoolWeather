package xhj.zime.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by shisaiqun on 2018/7/26.
 */

public class Province extends DataSupport {
    private int id;
    private String pronvinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public String getPronvinceName() {
        return pronvinceName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPronvinceName(String pronvinceName) {
        this.pronvinceName = pronvinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
