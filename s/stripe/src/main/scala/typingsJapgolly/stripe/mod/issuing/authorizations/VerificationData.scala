package typingsJapgolly.stripe.mod.issuing.authorizations

import typingsJapgolly.stripe.stripeStrings.`match`
import typingsJapgolly.stripe.stripeStrings.exempt
import typingsJapgolly.stripe.stripeStrings.failure
import typingsJapgolly.stripe.stripeStrings.mismatch
import typingsJapgolly.stripe.stripeStrings.none
import typingsJapgolly.stripe.stripeStrings.not_provided
import typingsJapgolly.stripe.stripeStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationData extends js.Object {
  /**
    * One of match, mismatch, or not_provided.
    */
  var address_line1_check: `match` | mismatch | not_provided
  /**
    * One of match, mismatch, or not_provided.
    */
  var address_zip_check: `match` | mismatch | not_provided
  /**
    * One of exempt, failure, none, or success.
    */
  var authentication: exempt | failure | none | success
  /**
    * One of match, mismatch, or not_provided.
    */
  var cvc_check: `match` | mismatch | not_provided
}

object VerificationData {
  @scala.inline
  def apply(
    address_line1_check: `match` | mismatch | not_provided,
    address_zip_check: `match` | mismatch | not_provided,
    authentication: exempt | failure | none | success,
    cvc_check: `match` | mismatch | not_provided
  ): VerificationData = {
    val __obj = js.Dynamic.literal(address_line1_check = address_line1_check.asInstanceOf[js.Any], address_zip_check = address_zip_check.asInstanceOf[js.Any], authentication = authentication.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerificationData]
  }
}

