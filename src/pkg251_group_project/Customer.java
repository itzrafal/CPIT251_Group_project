
package pkg251_group_project;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private int cancelNumber;
    private List<String> purchasedProducts;
    private List<String> enrolledVolunteer;
    private List<String> bookedEvents;
    private List<String> creditCardDetails;
    private List<String> favoriteEvents;
    private List<String> cart;

    public Customer(String customerId) {
        this.customerId = customerId;
        this.cancelNumber = 0;
        this.purchasedProducts = new ArrayList<>();
        this.enrolledVolunteer = new ArrayList<>();
        this.bookedEvents = new ArrayList<>();
        this.creditCardDetails = new ArrayList<>();
        this.favoriteEvents = new ArrayList<>();
        this.cart = new ArrayList<>();
    }

    // Methods
    public void cancelEnrollment(String event) {
        enrolledVolunteer.remove(event);
    }

    public void cancelBooking(String event) {
        bookedEvents.remove(event);
    }

    public void returnProduct(String product) {
        purchasedProducts.remove(product);
    }

    public void addCreditCard(String creditCard) {
        creditCardDetails.add(creditCard);
    }

    public void addToFavorite(String event) {
        favoriteEvents.add(event);
    }

    public void removeFromFavorite(String event) {
        favoriteEvents.remove(event);
    }

    public void addToCart(String product) {
        cart.add(product);
    }

    public void removeFromCart(String product) {
        cart.remove(product);
    }

    public void book(String event) {
        bookedEvents.add(event);
    }

    public void enroll(String volunteer) {
        enrolledVolunteer.add(volunteer);
    }

    public void purchase(String product) {
        purchasedProducts.add(product);
    }

    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getCancelNumber() {
        return cancelNumber;
    }

    public void setCancelNumber(int cancelNumber) {
        this.cancelNumber = cancelNumber;
    }

    public List<String> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(List<String> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public List<String> getEnrolledVolunteer() {
        return enrolledVolunteer;
    }

    public void setEnrolledVolunteer(List<String> enrolledVolunteer) {
        this.enrolledVolunteer = enrolledVolunteer;
    }

    public List<String> getBookedEvents() {
        return bookedEvents;
    }

    public void setBookedEvents(List<String> bookedEvents) {
        this.bookedEvents = bookedEvents;
    }

    public List<String> getCreditCardDetails() {
        return creditCardDetails;
    }

    public void setCreditCardDetails(List<String> creditCardDetails) {
        this.creditCardDetails = creditCardDetails;
    }

    public List<String> getFavoriteEvents() {
        return favoriteEvents;
    }

    public void setFavoriteEvents(List<String> favoriteEvents) {
        this.favoriteEvents = favoriteEvents;
    }

    public List<String> getCart() {
        return cart;
    }

    public void setCart(List<String> cart) {
        this.cart = cart;
    }
}