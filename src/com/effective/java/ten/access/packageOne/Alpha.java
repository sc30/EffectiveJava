package com.effective.java.ten.access.packageOne;

/**
 * Alpha can access all its own member, private, public, protected, and package-private
 */
public class Alpha {
    private String private_string;
    public String public_string;
    String package_private_string;
    protected String protected_string;

    private void privateCall() {
    }

    public void publicCall() {
    }

    void packagePrivateCall() {
    }

    protected void protectedCall() {
    }
}
