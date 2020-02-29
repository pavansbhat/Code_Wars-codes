def add_binary(a,b):
    sum=a+b
    a=bin(sum)
    f=a[2:]
    d=str(f)
    return d
print(add_binary(1,1))
