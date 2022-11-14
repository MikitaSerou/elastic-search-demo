package com.example.elasticsearchdemo.document;

import com.example.elasticsearchdemo.helper.ElasticIndexes;
import lombok.AccessLevel;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Data
@ToString
@Document(indexName = ElasticIndexes.PERSON_INDEX)
@Setting(settingPath = "static/es-settings.json")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person {

    @Id
    @Field(type = FieldType.Keyword)
    String id;

    @Field(type = FieldType.Text)
    String name;
}

