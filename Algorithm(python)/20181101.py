#!/usr/bin/env python
# coding: utf-8

# In[5]:


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


# In[ ]:




