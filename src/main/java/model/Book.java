package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
* to let lombok generate the default getter/setter automatically.*/
@Getter
@Setter
/*
* lombok generate an implementation of the toString() method.
*  By default, it'll print your class name, along with each field,
* in order, separated by commas*/
@ToString

@Document(collection = "Book")
/*
This annotation marks a class as being a domain object that we want to persist to the database:
Also allow the name of the collection to be chosen
*/
public class Book {
    @Id
    private int id;
    private String bookName;
    private String authorName;
}
