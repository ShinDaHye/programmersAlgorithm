#!/usr/bin/env python
# coding: utf-8

# In[5]:


#콜라츠 추측
n=626331
count = 0

while (n!=1)&(count<500):
    if n % 2==0:
        n /=2
    else:
        n = n*3+1
    count+=1
if count==500:
    count = -1
print(count)
    


# In[12]:


#제일 작은 수 제거하기
arr = [10]
min_val = min(arr)
arr.remove(min_val)
if len(arr) == 0:
    arr.append(-1)
print(arr)


# In[20]:


#정수 내림차순으로 배치하기
n=118372
answer = ""
str_n = str(n)
list_n = []
for i in str_n:
    list_n.append(i)
list_n.sort(reverse = True)
for element in list_n:
    answer += element
print (answer)


# In[24]:


#정수 제곱근 판별
import math
n  = 121
sqrt = math.sqrt(n)
if sqrt == int(sqrt):
    print(math.pow(sqrt+1,2))
else:
    print(-1)


# In[40]:


#완주하지 못한 선수
participant = ["leo","kiki","eden"]
completion = ["eden","kiki"]
participant.sort()
completion.sort()
for i in range(len(completion)):
    if participant[i] != completion[i]:
        print( participant[i])
print(participant[len(participant)-1])

