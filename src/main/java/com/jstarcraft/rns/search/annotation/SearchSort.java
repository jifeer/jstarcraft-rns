package com.jstarcraft.rns.search.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 排序
 * 
 * <pre>
 * 注意:分词字段存储DocValues没有意义
 * </pre>
 * 
 * @author Birdy
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Deprecated
public @interface SearchSort {

}