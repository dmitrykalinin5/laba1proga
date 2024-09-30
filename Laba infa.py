fib = [1, 2]
for i in range(1, 10000): fib.append(fib[i] + fib[i-1])
number, massiv = input()[::-1], []
for i in range(len(number)):
    if number[i] == '1':
        massiv.append(fib[i])
print(sum(massiv))