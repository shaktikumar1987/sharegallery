#!/usr/bin/env groovy

powershell 'def call(String folderpath=\'tfcode\') {
  powershell 'write-host " this is  jenkins example ${$env:folderpath}"'
}

