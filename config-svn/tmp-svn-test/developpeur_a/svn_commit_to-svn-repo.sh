#!/bin/bash
. ../set-svn-env.sh
svn commit -m "yet another commit" ${SVN_PROJECT}/src/*
#svn commit --help
echo "fin"; read fin;
