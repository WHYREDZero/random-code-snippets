#! /usr/bin/env python3
import os
import requests
dicto = {"title": "", "name": "", "date": "", "feedback": ""}
uri = "http://ip/feedback"
os.chdir("/home/usr/data/feedback")
filelist = os.listdir()
for afile in filelist:
    f = open(afile)
    dicto["title"] = f.readline().strip()
    dicto["name"] = f.readline().strip()
    dicto["date"] = f.readline().strip()
    dicto["feedback"] = f.readline().strip()
    f.close()
    response = requests.post(uri, data=dicto)
    print(response)
