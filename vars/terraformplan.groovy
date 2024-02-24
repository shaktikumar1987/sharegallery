#!/usr/bin/env groovy

package io.terraformbuild

class terraformClass {

    String folderpath
    static String stage = "init"
    static String stage = "validate"
    static String stage = "fmt"
    static String stage = "plan"
    String msg


    def tfinit(){

            this.msg = "This is my tf init code from folder ${folderpath}"


    }


}