package typingsJapgolly.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVerificationAcmount extends js.Object {
  var makeDefault: js.UndefOr[Boolean] = js.undefined
  var verificationAcmount: js.UndefOr[String] = js.undefined
  var verificationMerchantAccountId: js.UndefOr[String] = js.undefined
  var verifyCard: js.UndefOr[Boolean] = js.undefined
}

object AnonVerificationAcmount {
  @scala.inline
  def apply(
    makeDefault: js.UndefOr[Boolean] = js.undefined,
    verificationAcmount: String = null,
    verificationMerchantAccountId: String = null,
    verifyCard: js.UndefOr[Boolean] = js.undefined
  ): AnonVerificationAcmount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(makeDefault)) __obj.updateDynamic("makeDefault")(makeDefault.asInstanceOf[js.Any])
    if (verificationAcmount != null) __obj.updateDynamic("verificationAcmount")(verificationAcmount.asInstanceOf[js.Any])
    if (verificationMerchantAccountId != null) __obj.updateDynamic("verificationMerchantAccountId")(verificationMerchantAccountId.asInstanceOf[js.Any])
    if (!js.isUndefined(verifyCard)) __obj.updateDynamic("verifyCard")(verifyCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVerificationAcmount]
  }
}

