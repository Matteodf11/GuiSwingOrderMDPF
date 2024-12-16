/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mdpf.guiswingorderlinuxmdpf;

import java.util.Date;

/**
 *
 * @author matdipfor
 */
public class Order {

    private String dateTime;
    private String takeaway;
    private String tableNumber;
    private String fullCustomerName;
    private String email;
    private String customerComments;
    private String grandTotal;
    private String paymentMethod;
    private String tipping;
    private String requestInvoice;

    public Order(String dateTime, String takeaway, String tableNumber, String fullCustomerName, String email, String customerComments, String grandTotal, String paymentMethod, String tipping, String requestInvoice) {
        this.dateTime = dateTime;
        this.takeaway = takeaway;
        this.tableNumber = tableNumber;
        this.fullCustomerName = fullCustomerName;
        this.email = email;
        this.customerComments = customerComments;
        this.grandTotal = grandTotal;
        this.paymentMethod = paymentMethod;
        this.tipping = tipping;
        this.requestInvoice = requestInvoice;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getTakeaway() {
        return takeaway;
    }

    public void setTakeaway(String takeaway) {
        this.takeaway = takeaway;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getFullCustomerName() {
        return fullCustomerName;
    }

    public void setFullCustomerName(String fullCustomerName) {
        this.fullCustomerName = fullCustomerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerComments() {
        return customerComments;
    }

    public void setCustomerComments(String customerComments) {
        this.customerComments = customerComments;
    }

    public String getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTipping() {
        return tipping;
    }

    public void setTipping(String tipping) {
        this.tipping = tipping;
    }

    public String getRequestInvoice() {
        return requestInvoice;
    }

    public void setRequestInvoice(String requestInvoice) {
        this.requestInvoice = requestInvoice;
    }

    @Override
    public String toString() {
        return "    DateTime: " + dateTime + "\n"
                + "    Takeaway/Restaurant: " + takeaway + "\n"
                + "    TableNumber: " + tableNumber + "\n"
                + "    CustomerName: " + fullCustomerName + "\n"
                + "    Email: " + email + "\n"
                + "    CustomerComments: " + customerComments + "\n"
                + "    GrandTotal: " + grandTotal + "\n"
                + "    PaymentMethod: " + paymentMethod + "\n"
                + "    Tipping: " + tipping + "\n"
                + "    RequestInvoice: " + requestInvoice + "\n";
    }

}
