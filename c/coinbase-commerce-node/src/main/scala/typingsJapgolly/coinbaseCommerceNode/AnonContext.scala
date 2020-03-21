package typingsJapgolly.coinbaseCommerceNode

import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.DELAYED
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.MANUAL
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.MULTIPLE
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.OTHER
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.OVERPAID
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNDERPAID
import typingsJapgolly.coinbaseCommerceNode.mod.PaymentStatus
import typingsJapgolly.coinbaseCommerceNode.mod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  /**
    * Timeline entry context.
    */
  var context: js.UndefOr[UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER] = js.undefined
  /**
    * Timeline entry status.
    */
  var status: PaymentStatus
  /**
    * Timeline entry timestamp.
    */
  var time: Timestamp
}

object AnonContext {
  @scala.inline
  def apply(
    status: PaymentStatus,
    time: Timestamp,
    context: UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER = null
  ): AnonContext = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

