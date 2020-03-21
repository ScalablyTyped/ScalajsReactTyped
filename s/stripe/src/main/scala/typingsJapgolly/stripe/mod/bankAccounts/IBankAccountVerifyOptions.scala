package typingsJapgolly.stripe.mod.bankAccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccountVerifyOptions extends js.Object {
  /**
    * Two positive integers, in cents, equal to the values of the microdeposits sent to the bank account.
    */
  var amounts: js.Tuple2[Double, Double]
}

object IBankAccountVerifyOptions {
  @scala.inline
  def apply(amounts: js.Tuple2[Double, Double]): IBankAccountVerifyOptions = {
    val __obj = js.Dynamic.literal(amounts = amounts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBankAccountVerifyOptions]
  }
}

