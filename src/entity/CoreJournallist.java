package entity;

import java.util.Date;

/**
 * Author:Young
 * Class Comment:SCI期刊信息
 * Date: 2016年3月23日下午2:15:13
 */
public class CoreJournallist {
    private Integer id;

    private String name;

    private String issn;

    private String frequency;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
