package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "GetPaymentRefundResponse")
@js.native
class GetPaymentRefundResponse () extends js.Object {
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  /**
    * The requested `PaymentRefund`.
    */
  var refund: js.UndefOr[PaymentRefund] = js.native
}

