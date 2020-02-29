def countBits(n):
    a=bin(n)
    b=str(a)
    count=0
    for x in b:
        if (x=="1"):
            count=count+1
    return count
print(countBits(1234))
