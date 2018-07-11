package com.effective.java.ten.access.packageTwo;

import com.effective.java.ten.access.packageOne.Alpha;

/**
 * Alphasub can only access Alpha's public and protected member.
 */
public class AlphaSub extends Alpha {
    void accessAlphaMember() {
        protectedCall();
        publicCall();
        /**
         privateCall();
         packagePrivateCall();
         **/

        public_string = "public string";
        protected_string = "protected string";

        /**
         package_private_string = "package private string";
         private_string = "private string";
         **/
    }
}
