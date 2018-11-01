#!/usr/bin/env python
# coding: utf-8


#strings=["abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"] 
strings=["sds","sdst","sdss"]
answer=[]
n=1
strings.sort()
for i in range(len(strings)):
    for j in range(i+1,len(strings)):
        if(strings[i][n]>strings[j][n]):
            tmp = strings[i]
            strings[i]=strings[j]
            strings[j]=tmp
print(strings)


#문자열 내림차순으로 정렬
s = "bcdegfZAB"
string = []
answer=""
for i in range(len(s)):
    string.append(s[i])

string.sort()
for i in string:
    answer=i+answer
print(answer)

    
#서울에서 김서방 찾기
seoul=["Jane","Kim"]
for i in range(len(seoul)):
    if seoul[i]=="Kim":
        count = i
        break
    continue

answer = "김서방은 "+str(count)+"에 있다"
print(answer)


#문자열 기본
s="1234"
answer=False
try:
    new_s = int(s)
    if (len(s) == 4) | (len(s) == 6):
        answer=True
except:
    pass
print(answer)

