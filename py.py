import os
import cv2
import numpy as np
import matplotlib.pyplot as plt
import matplotlib.image as mpimg



# Set the working directory to be the current one
os.chdir(os.path.dirname(os.path.abspath(__file__)))


img = mpimg.imread('lena.jpg')
plt.imshow(img)
plt.show()

# 2-나
Red = []
Green = []
Blue = []

for x in img:
    for y in x:
        Red.append(y[0])
        Green.append(y[1])
        Blue.append(y[2])

R_max = max(Red)
G_max = max(Green)
B_max = max(Blue)

R_avg = sum(Red) / len(Red)
G_avg = sum(Green) / len(Green)
B_avg = sum(Blue) / len(Blue)

print("Max Value")
print("R : ", R_max)
print("G : ", G_max)
print("B : ", B_max)

print("Avg Value")
print("R : ", R_avg)
print("G : ", G_avg)
print("B : ", B_avg)


# 2-다
for x in img:
    for y in x:
        swap = y[0]
        y[0] = y[2]
        y[2] = y[1]
        y[1] = swap

plt.imshow(img)
plt.show()