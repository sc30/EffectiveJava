package com.effective.java.ten.access.packageOne;

/**
 * Beta can access Aplpha's public, protected and package-private member
 */
public class Beta {
    void accessAlphaMember() {
        Alpha alpha = new Alpha();

        alpha.publicCall();
        alpha.protectedCall();
        alpha.packagePrivateCall();
        /**
         alpha.privateCall();
         **/

        alpha.public_string = "public string";
        alpha.protected_string = "protected string";
        alpha.package_private_string = "package private string";

        /**
         alpha.private_string = "private string";
         **/
    }
}
