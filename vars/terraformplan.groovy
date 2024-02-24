#!/usr/bin/env groovy

def call(String folderpath='tfcode') {

     echo "Hello, ${folderpath}."
   // powershell 'write-host " this is  jenkins example ${$env:folderpath}"'
    //powershell write-host "this is  jenkins example $($env:folderpath)"
    //powershell 'write-host " this is  jenkins example $($env:folderpath)"'

powershell '''
$folderpath = "${ENV:folderpath}"
Write-Host "This is jenkins Example, $folderpath."
'''
}
