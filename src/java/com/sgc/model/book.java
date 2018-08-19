/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgc.model;

/**
 *
 * @author Saruga
 */
public class book {
    String bookId;
    String title;
    String author;
    String mainClassification;
    String subClassification;
    int yearOfPublishing;
    int lastPrintedYear;
    String isbnNo;
    int noOfPages;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMainClassification() {
        return mainClassification;
    }

    public void setMainClassification(String mainClassification) {
        this.mainClassification = mainClassification;
    }

    public String getSubClassification() {
        return subClassification;
    }

    public void setSubClassification(String subClassification) {
        this.subClassification = subClassification;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getLastPrintedYear() {
        return lastPrintedYear;
    }

    public void setLastPrintedYear(int lastPrintedYear) {
        this.lastPrintedYear = lastPrintedYear;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    
    }

   