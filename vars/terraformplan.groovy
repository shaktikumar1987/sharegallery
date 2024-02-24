#!/usr/bin/env groovy

//powershell 'def call(String folderpath=\'tfcode\') {
  //powershell 'write-host " this is  jenkins example ${$env:folderpath}"'

//powershell '''
//$folderpath = "${ENV:folderpath}"
//Write-Host "This is jenkins Example, $folderpath."
//'''


//}


def call(String folderpath='tfcode') {
    powershell """
    write-host "This is Jenkins example, ${env:folderpath}"
    """
}
