import sys
print(f"System INFO:    {sys.platform}")
n=sys.argv[1]
print(f"Entered argument is {n}")
for i in range(1,int(n)+1):
    print(f"{i}"*i)
