def xo(s):
    countx=0
    counto=0
    for p in s.lower():
      if(p==("x")):
          countx+=1
      if(p==("o")):
          counto+=1
    if(countx==counto):
        return True
    elif(countx!=counto):
        return False
print(xo("xo0"))
