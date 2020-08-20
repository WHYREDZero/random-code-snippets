"""import os
from PIL import Image
file_list = os.listdir()
for filename in file_list:
    im = Image.open(filename)
    im.rotate(90).resize((128,128)).save("/opt/icons/"+filename[:filename.index(".tiff")]+".jpg")"""
import os
from PIL import Image
file_list = os.listdir()
for filename in file_list:
    im = Image.open(filename)
    im.rotate(90).resize((128,128)).save("/opt/icons/"+filename+".jpg")
