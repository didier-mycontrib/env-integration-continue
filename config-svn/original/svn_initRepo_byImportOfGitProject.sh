#!/bin/bash
. ./set-svn-env.sh


#svn -m "initial svn import" import p1 file:///home/formation/Bureau/tp/local-scm/svn/p1/trunk/p1
#svn -m "initial svn import" --username formation --password formation import p1 http://localhost/svn/p1/trunk/p1
#svn -m "initial svn import" import p1 http://localhost/svn/p1/trunk/p1

#svn -m "initial svn import" import p1/pom.xml.txt http://localhost/svn/p1/trunk/p1/pom.xml.txt
#svn -m "initial svn import" import p1/src http://localhost/svn/p1/trunk/p1/src
cd ${SVN_PROJECT}
svn -m "initial svn import" import pom.xml ${SVN_REPOSITORY_URL}/pom.xml
svn -m "initial svn import" import src ${SVN_REPOSITORY_URL}/src

#svn  import --help
echo "fin?"; read fin;
