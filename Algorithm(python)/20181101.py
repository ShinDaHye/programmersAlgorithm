#!/usr/bin/env python
# coding: utf-8

# In[3]:


#level2 주식가격
prices = [498, 501, 470, 489]
answer = []
for i in range(len(prices)):
    count = 0
    for j in range(i,len(prices)):
        if(prices[i]>prices[j]):
            count = j - i
            break
    if count == 0:
        count = len(prices)-1 - i
    answer.append(count)        
print(answer)


# In[8]:


#level2 예상 대진표
n = 8
a = 4
b = 10
A = min(a,b)
B = max(a,b)
count = 1
while(A%2==0 or A+1 != B):
    if A == 0 or B == 0:
        break
    print (A,B , count)
    count += 1
    if A%2 != 0 and B%2 != 0:
        A = (A+1)//2
        B = (B+1)//2
    elif A%2 == 0 and B%2 != 0:
        A = A//2
        B = (B+1)//2
    elif A%2 !=0 and B%2 ==0:
        A = (A+1)//2
        B = B//2
    elif A%2 ==0 and B%2 ==0:
        A = A//2
        B = B//2
print(A,B, count)
    

