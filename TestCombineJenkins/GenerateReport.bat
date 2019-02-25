@echo off
title Command Executer
color 1b

echo Executer by: Tin Nguyen
echo Edited by: Phuc Doan
echo "\W/ /A\ \Y/ \V/ |E |R |L |E \Y/"
: execute
allure serve %~dp0\allure-results
set /p cmd=Command:
%cmd%
goto execute