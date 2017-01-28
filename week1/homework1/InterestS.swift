var price:Float = 1
var intrest:Float = 0.10
var time:Float = 100
var debt:Float = 0
var exponent:Float = 0
var compound:Float = 2

exponent = (1 + intrest/compound)

var hold:Float = compound ^^ time
debt = pow(exponent, hold)
debt = debt + price


print("You pay " + debt + " dollars")
