package model;

import javax.persistence.*;

/**
 * Created by 153262Y on 12/8/2016.
 */
@Entity
@Table(name = "books", schema = "test", catalog = "")
public class BooksEntity {
    private String id;
    private String surname;
    private String firstName;
    private String title;
    private Double price;
    private Short onSale;
    private Integer calendarYear;
    private String description;
    private Integer inventory;

    @Id
    @Column(name = "id", nullable = false, length = 8)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "surname", nullable = true, length = 24)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "first_name", nullable = true, length = 24)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 96)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "onSale", nullable = true)
    public Short getOnSale() {
        return onSale;
    }

    public void setOnSale(Short onSale) {
        this.onSale = onSale;
    }

    @Basic
    @Column(name = "calendar_year", nullable = true)
    public Integer getCalendarYear() {
        return calendarYear;
    }

    public void setCalendarYear(Integer calendarYear) {
        this.calendarYear = calendarYear;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 30)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "inventory", nullable = true)
    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BooksEntity that = (BooksEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (onSale != null ? !onSale.equals(that.onSale) : that.onSale != null) return false;
        if (calendarYear != null ? !calendarYear.equals(that.calendarYear) : that.calendarYear != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (inventory != null ? !inventory.equals(that.inventory) : that.inventory != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (onSale != null ? onSale.hashCode() : 0);
        result = 31 * result + (calendarYear != null ? calendarYear.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (inventory != null ? inventory.hashCode() : 0);
        return result;
    }
}
