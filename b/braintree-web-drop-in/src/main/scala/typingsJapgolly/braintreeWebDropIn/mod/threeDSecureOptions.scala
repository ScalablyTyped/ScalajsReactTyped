package typingsJapgolly.braintreeWebDropIn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait threeDSecureOptions extends js.Object {
  var amount: String
}

object threeDSecureOptions {
  @scala.inline
  def apply(amount: String): threeDSecureOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[threeDSecureOptions]
  }
}

