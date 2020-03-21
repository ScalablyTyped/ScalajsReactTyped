package typingsJapgolly.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionStatusHistory extends js.Object {
  var amount: String
  var status: TransactionStatus
  var timestamp: js.Date
  var transactionsource: TransactionSource
  var user: String
}

object TransactionStatusHistory {
  @scala.inline
  def apply(
    amount: String,
    status: TransactionStatus,
    timestamp: js.Date,
    transactionsource: TransactionSource,
    user: String
  ): TransactionStatusHistory = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactionsource = transactionsource.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransactionStatusHistory]
  }
}

