l1 = []
num = int(input("Enter the number of elements to sort"))
for i in range(1,num+1):
    num1 = int(input("Enter the number to add in the list"))
    l1.append(num1)
l1.sort(reverse = False)
print(l1[-3])
