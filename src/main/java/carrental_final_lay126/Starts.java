package carrental_final_lay126;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Starts_table")
public class Starts {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String carNo;
    private String comment;
    private String resvrNo;

    @PostUpdate
    public void onPostUpdate(){
        StarUpdated starUpdated = new StarUpdated();
        BeanUtils.copyProperties(this, starUpdated);
        starUpdated.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getResvrNo() {
        return resvrNo;
    }

    public void setResvrNo(String resvrNo) {
        this.resvrNo = resvrNo;
    }




}
