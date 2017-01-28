price = 1
time = 100
intrest = 0.1
compound = 4
debt = 0
debt = compound * time
debt = (1 + intrest/compound)**debt


puts "You will owe them " + debt.to_s + " dollars"
