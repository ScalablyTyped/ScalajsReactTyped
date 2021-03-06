package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BalancePaymentDetails")
@js.native
class BalancePaymentDetails () extends js.Object {
  /**
    * ID for the account used to fund the payment.
    */
  var account_id: js.UndefOr[String] = js.native
  /**
    * The balance payment’s current state. Can be `COMPLETED` or `FAILED`.
    */
  var status: js.UndefOr[String] = js.native
}

