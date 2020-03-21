package typingsJapgolly.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardParameters extends js.Object {
  var allowPrepaidCards: js.UndefOr[Boolean] = js.undefined
  var allowedAuthMethods: js.Array[AllowedAuthMethod]
  var allowedCardNetworks: js.Array[AllowedCardNetwork]
  var billingAddressParameters: js.UndefOr[BillingAddressParameters] = js.undefined
  var billingAddressRequired: js.UndefOr[Boolean] = js.undefined
}

object CardParameters {
  @scala.inline
  def apply(
    allowedAuthMethods: js.Array[AllowedAuthMethod],
    allowedCardNetworks: js.Array[AllowedCardNetwork],
    allowPrepaidCards: js.UndefOr[Boolean] = js.undefined,
    billingAddressParameters: BillingAddressParameters = null,
    billingAddressRequired: js.UndefOr[Boolean] = js.undefined
  ): CardParameters = {
    val __obj = js.Dynamic.literal(allowedAuthMethods = allowedAuthMethods.asInstanceOf[js.Any], allowedCardNetworks = allowedCardNetworks.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPrepaidCards)) __obj.updateDynamic("allowPrepaidCards")(allowPrepaidCards.asInstanceOf[js.Any])
    if (billingAddressParameters != null) __obj.updateDynamic("billingAddressParameters")(billingAddressParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(billingAddressRequired)) __obj.updateDynamic("billingAddressRequired")(billingAddressRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardParameters]
  }
}

