package typingsJapgolly.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailOnDuplicatePaymentMethod extends js.Object {
  var failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.undefined
  var makeDefault: js.UndefOr[Boolean] = js.undefined
  var verifyCard: js.UndefOr[Boolean] = js.undefined
}

object AnonFailOnDuplicatePaymentMethod {
  @scala.inline
  def apply(
    failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.undefined,
    makeDefault: js.UndefOr[Boolean] = js.undefined,
    verifyCard: js.UndefOr[Boolean] = js.undefined
  ): AnonFailOnDuplicatePaymentMethod = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failOnDuplicatePaymentMethod)) __obj.updateDynamic("failOnDuplicatePaymentMethod")(failOnDuplicatePaymentMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(makeDefault)) __obj.updateDynamic("makeDefault")(makeDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(verifyCard)) __obj.updateDynamic("verifyCard")(verifyCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailOnDuplicatePaymentMethod]
  }
}

