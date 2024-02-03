numbers = [1, 2, 3, 4, 5]
k = 3
# [3,4,5,1,2]
start, end = 0, 0

def reverse(left, right, numbers) :
    while left < right:
        numbers[left], numbers[right] = numbers[right], numbers[left]
        print(numbers)
        left = left + 1
        right = right - 1

# reverse the whole array
start = 0
end = len(numbers) - 1
reverse(start, end, numbers)

# reverse the sub arrays now which impacts rotation eg. k
# reverse the first subarray
k = k % len(numbers)
start = 0
end = k - 1
reverse(start, end, numbers)

# reverse the second subarray
start = k
end = len(numbers) - 1
reverse(start, end, numbers)
