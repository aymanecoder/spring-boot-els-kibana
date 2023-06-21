package com.example.elasticsearchproject.util;

import co.elastic.clients.elasticsearch._types.query_dsl.MatchAllQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import lombok.val;

import java.util.function.Supplier;

public class ElasticSearchUtil {

    public static Supplier<Query> supplier(){
        Supplier<Query> supplier = ()->Query.of(q->q.matchAll(matchAllQuery()));
        return supplier;
    }

    public static MatchAllQuery matchAllQuery(){
        val  matchAllQuery = new MatchAllQuery.Builder();
        return matchAllQuery.build();
    }

    public static Supplier<Query> supplierWithNameField(String fieldValue){
        Supplier<Query> supplier = ()->Query.of(q->q.match(matchQueryWithNameField(fieldValue)));
        return supplier;
    }
    public static MatchQuery matchQueryWithNameField(String fieldValue){
        val  matchQuery = new MatchQuery.Builder();
        return matchQuery.field("name").query(fieldValue).build();
    }

    public static MatchQuery matchQueryWithQuantityField(String fieldValue){
        val  matchQuery = new MatchQuery.Builder();
        return matchQuery.field("quantity").query(fieldValue).build();
    }
    public static Supplier<Query> supplierWithQuantityField(String fieldValue){
        Supplier<Query> supplier = ()->Query.of(q->q.match(matchQueryWithQuantityField(fieldValue)));
        return supplier;
    }
    public static MatchQuery matchQueryWithPriceField(String fieldValue){
        val  matchQuery = new MatchQuery.Builder();
        return matchQuery.field("price").query(fieldValue).build();
    }
    public static Supplier<Query> supplierWithPriceField(String fieldValue){
        Supplier<Query> supplier = ()->Query.of(q->q.match(matchQueryWithPriceField(fieldValue)));
        return supplier;
    }
    public static MatchQuery matchQueryWithCategoryField(String fieldValue){
        val  matchQuery = new MatchQuery.Builder();
        return matchQuery.field("category").query(fieldValue).build();
    }
    public static Supplier<Query> supplierWithCategoryField(String fieldValue){
        Supplier<Query> supplier = ()->Query.of(q->q.match(matchQueryWithCategoryField(fieldValue)));
        return supplier;
    }


}
