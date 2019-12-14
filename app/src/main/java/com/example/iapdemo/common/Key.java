package com.example.iapdemo.common;

public class Key {
    private static final String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhkmI3qz3oiL9gKn/RIGP6YJ+AurTDBqRxCigbiapoVlmWsmk6PxZ4l/xNVSkLOKmx61+jUcCFwRJ2+juxPBcun4GlGhdEcftnDOOCARAHSGFpIo79hPuzQwheb67QDoeTXBph6Ovvi7g1JXu8w7rTDT+A0YAA0mu5fntb+4QDz99csAhJd7OtupnL8GK6SVkN9xg6wLK0KlRU6aPPKfHUvVhGbEq3Rq6qGSlKIjkvGa4XRBOuYgNaOZ+4877c2n8FS4k5z3CguMH8em+2uLpfXDRbBLI7gDGgUbJGKrea1q+1MqCIZpTnUMOWv/ukLBxBpi1LwqOVvErcTstsbTaiwIDAQAB";

    /**
     * get the publicKey of the application
     * During the encoding process, avoid storing the public key in clear text.
     * @return
     */
    public static String getPublicKey(){
        return publicKey;
    }
}
