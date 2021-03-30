package peaksoft.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;

@Getter
@Setter
@ToString
public class Animal {

        @Qualifier("dog")
        private Dog dog;
        @Qualifier("cat")
        private Cat cat;

}
