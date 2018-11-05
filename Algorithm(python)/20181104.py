#!/usr/bin/env python
# coding: utf-8

# In[32]:


#level2 더 맵게
scoville = [1,2,3,9,10,12]
k=12
answer=0
scoville.sort()
for element in scoville:
    if element >= k:
        rst1 = element
        break
idx= scoville.index(rst1) # 스코빌지수보다 처음으로 큰 수의 인덱스
k_small = scoville[:idx]
while k_small != [] or len(k_small)> 1:
    new =  k_small[0] + k_small[1]*2
    k_small.pop(0)
    k_small.pop(0)
    if new < k:
        k_small.append(new)
        k_small.sort()
    answer+=1
if len(k_small) == 1:
    answer = -1
print(k_small, answer)


# In[45]:


#전화번호 목록
#phone_book = ["12","123","1235","567","88"]
phone_book = ["12232332", "12", "222222"]
def solution(phone_book):
    answer=True
    for element in phone_book:
        for i in range(len(phone_book)):
            if element == phone_book[i]:
                continue
            if element == phone_book[i][:len(element)]:
                return False
    return (answer)


# In[50]:


#H-index
citations=[3,0,6,1,5]
answer = 0
citations.sort()
n = len(citations) + 1 
max_cit = max(citations)
for h in range(max_cit):
    count = 0 
    for element in citations:
        if element >= h:
            count += 1
    if count >= h:
        answer = h
print(answer)


# In[1]:


#스파이의 위장 not done
import math
clothes = [["yello_hat","headgear"],["blue_sunglasses","eyewear"],["green_turban","headgear"]]
alr_check = []
kind = []
count = []
for i in range(len(clothes)):
    kind.append(clothes[i][1])
print(kind)
for element in kind:
    if element not in alr_check:
        count.append(kind.count(element))
        alr_check.append(element)
print(count)


# In[3]:


#구명보트 not done
people=[70,40,40,20,80,50]
limit=170
answer=0
boat = []
while people != []:
    for element in people:
        print(element)
        if sum(boat) + element <= limit:
            boat.append(element)
            people.remove(element)
            print(boat, people)
    boat=[]
    answer+=1
print(answer)

