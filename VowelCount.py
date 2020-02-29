def getCount(inputStr):
    num_vowels = 0
    for x in inputStr:
        if(x=="a" or x=="e" or x=="i" or x=="o" or x=="u"):
            
            num_vowels=num_vowels+1
    return num_vowels

print(getCount("bcaae"))
