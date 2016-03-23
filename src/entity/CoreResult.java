package entity;

/**
 * Author:Young
 * Class Comment: 索引文章信息
 * Date: 2016年3月23日下午2:13:56
 */
public class CoreResult {
    private Integer id;

    private String journalname;

    private String extension;

    private String result;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJournalname() {
        return journalname;
    }

    public void setJournalname(String journalname) {
        this.journalname = journalname;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}