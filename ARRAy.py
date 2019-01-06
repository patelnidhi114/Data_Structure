'''
Created on 05-Jan-2019

@author: NIDHI
'''
#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the hourglassSum function below.
def hourglassSum(arr):
    n= 0
    row = 0
    flag = 0
    j = 0
    i=0
    column = 0
    sum1 = 0
    result = []
    while(n<((len(arr)-2)*(len(arr)-2))):
        
        for i in range(i,i+3):
            row += 1
            column = 0
            
            for j in range(j,j+3):
                column += 1
                #print(j)
                if row==2 and column !=2:
                    if column == 3:
                        j = j-2
                    continue
                sum1 = sum1 + arr[i][j]
                if column == 3:
                    j = j-2
                
                #print(n, i, j,sum1,len(result))
                
        result.append((sum1))
        #print(len(result))
        sum1 = 0
        row=0
        n += 1
        if n % math.sqrt((len(arr)-2)*(len(arr)-2)) == 0:
            flag = 0
            i = i-1
            j = 0
            
        else:
            flag = flag + 1
            j= flag
            i = i-2
            #print("yes")
            
    #print(max(result))        
    return max(result)

if __name__ == '__main__':
    #fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    hourglassSum(arr)

    #fptr.write(str(result) + '\n')

    #fptr.close()
