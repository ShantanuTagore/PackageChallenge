Package Challenge
===================
## Validations
- the package weight cannot be more than 100
- the things individually cannot weigh or cost more than 100
## Algorithm
1. Filter out the things which individually weigh more than package weight
2. Filter out the costliest thing and if there are multiple things then select the one which weighs less
	- add the thing to a list: costliestByCount
3. Now, we need to find a pair of things whose combined cost is more than any other pair and if there are multiple pairs with same cost then choose the one which weighs less
	- add the pair to the list: costliestByCount
4. Do the same exercise with 3, 4 and so on upto the number of given things for a package
5. From this list costliestByCount select the element for which the combined cost of things in the element is highest in the list
6. Pick the index number(s) of the thing(s) in the selected element from the previous step
    - add it to the list: outputList
7. Perform the steps 1 to 6 for each line read from the file
8. Convert the list into ```\n``` separated String and return it to the calling method.