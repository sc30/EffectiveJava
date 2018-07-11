package com.effective.java.ten.access.packageTwo;

import com.effective.java.ten.access.packageOne.Alpha;

/**
 * Gamma can only access Alpha's public member
 */
public class Gamma {
    void accessAlphaMember() {
        Alpha alpha = new Alpha();

        alpha.publicCall();
        /**
         alpha.protectedCall();
         alpha.privateCall();
         alpha.packagePrivateCall();
         **/

        alpha.public_string = "public string";

        /**
         alpha.protected_string = "protected string";
         alpha.package_private_string = "package private string";
         alpha.private_string = "private string";
         **/
    }
}
