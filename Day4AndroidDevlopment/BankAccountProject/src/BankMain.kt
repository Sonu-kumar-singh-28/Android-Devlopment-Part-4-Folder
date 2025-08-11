fun main(){
    var sonusinghaccount = BankAccount("Sonu Singh Sengar", 123.0)
    println(sonusinghaccount.accountholder)

    sonusinghaccount.withdrawal(13.0)
    println(sonusinghaccount.transactionHistory())

    sonusinghaccount.deposit(23658.2)

    sonusinghaccount.deposit(3697.1)
    println("balance of the ${sonusinghaccount.accountholder} is ${sonusinghaccount.balance}")

    sonusinghaccount.withdrawal(256.3)
    println(sonusinghaccount.transactionHistory())
    println(sonusinghaccount.balance)
}