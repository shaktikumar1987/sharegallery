#!/usr/bin/env groovy

def call(String folderpath='tfcode') {

    // echo "Hello, ${folderpath}."
    powershell 'write-host " this is  jenkins example ${ENV:folderpath}"'
}
