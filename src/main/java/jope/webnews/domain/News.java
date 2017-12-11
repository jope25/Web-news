
package jope.webnews.domain;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class News extends AbstractPersistable<Long> {

    private String title;
    private String lead;
    private String newsText;
    private LocalDateTime published;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn 
    private Picture picture;
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinColumn 
    private List<Writer> writers;
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinColumn 
    private List<Category> categories;
    
}
