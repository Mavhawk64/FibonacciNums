def getFibNums(iterations):
	mult = 1
	num1 = 0
	num2 = 1
	if iterations <= 0:
		mult = -1
	if iterations == 0:
		return 0
	print(0)
	if iterations == 1:
		return 1
	print(1)
	for i in range(1,mult * iterations):
		temp = num1 + mult * num2
		num1 = num2
		num2 = temp
		print(num2)
	return num2

check = 1000

print("Fibonacci #" + str(check) + ": " + str(getFibNums(check)))