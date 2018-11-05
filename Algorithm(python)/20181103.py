#!/usr/bin/env python
# coding: utf-8

# In[1]:


import math
#영어 끝말잇기
words=["tank","kick","know","wheel","land","dream","mother","robot","tank"]
#words=["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]
#words=["hello","one","even","never","now","world","draw","white"]
n = 3
def solution(n, words):
    word=[]
    newwords=[]
    for i in range(n):
        word.append([])
    for i in range(len(words)):
        new = words[i]
        word[i%n].insert(0,new)
    total = len(word[0])*n
    newwords.append(word[0].pop())
    for i in range(1,total):
        m = i%n
        new=word[m].pop()
        if(new in newwords):
            return([m+1, (len(newwords)//n)+1])
            break
        else:
            if new[0] != newwords[-1][-1] :
                return([m+1, (len(newwords)//n)+1])
                break
            else:
                newwords.append(new)
    return([0,0])       

solution(n, words)


# In[ ]:


#올바른 괄호 찾기
s="(()("
answer=True
string = []
for element in s:
    if element == "(":
         string.append(element)
    else:
        try:
            check = string.pop()
        except:
            answer=False
            break
if string == []:
    print(answer)
else:
    print(not answer)


# In[9]:


#프린터
priorities=[2,1,3,2]
prior=[]
location = 2
index=[]
print_idx = []
for i in range(len(priorities),0,-1):
    index.append(i-1)
    prior.append(priorities.pop())
while prior!=[]:
    check=prior.pop()
    idx = index.pop()
    max_e = check
    for element in prior:
        if check < element:
            max_e = element
    if max_e == check:
        priorities.append(check)
        print_idx.append(idx)
    else:
        prior.insert(0,check)
        index.insert(0,idx)
print(print_idx.index(location)+1)
print(priorities, print_idx)


# In[15]:


#level2 기능개발
progresses = [93,30,55,90]
speeds = [1,30,5,90]
answer=[]
day = []
for i in range(len(progresses)):
    count = 0
    while progresses[i] < 100:
        progresses[i] += speeds[i]
        count+=1
    day.insert(0,count)
print(day)

while day != []:
    check=day.pop()
    count=1
    for i in range(len(day),0,-1):
        if day[i-1] < check:
            day.pop()
            count+=1
        else:
            break
    answer.append(count)
print(answer)

