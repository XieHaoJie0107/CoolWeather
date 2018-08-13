package xhj.zime.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by shisaiqun on 2018/7/26.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}
