import java.time.temporal.TemporalAmount

class BankAccount(
    var accountholder: String,
    var balance: Double) {
    private val TransactionHistory =mutableSetOf<String>()

    fun deposit(amount: Double){
        balance = balance+amount;
        TransactionHistory.add("$accountholder and Deposit $amount")
    }


    fun withdrawal(amount: Double){
        if(balance<=amount){
            println("You don't have the fund to Withdrawal $$amount")
        }else{
            balance = balance-amount

            TransactionHistory.add("$accountholder Withdrawal amount $amount Remaining $balance")

        }
    }


    fun transactionHistory(){
        println("Transaction history For $accountholder")
        for(transaction in TransactionHistory){
            println(transaction)
        }
    }

}