package typingsJapgolly.stripe

import typingsJapgolly.stripe.stripeStrings.document_address_mismatch
import typingsJapgolly.stripe.stripeStrings.document_dob_mismatch
import typingsJapgolly.stripe.stripeStrings.document_duplicate_type
import typingsJapgolly.stripe.stripeStrings.document_id_number_mismatch
import typingsJapgolly.stripe.stripeStrings.document_name_mismatch
import typingsJapgolly.stripe.stripeStrings.failed_keyed_identity
import typingsJapgolly.stripe.stripeStrings.failed_other
import typingsJapgolly.stripe.stripeStrings.pending
import typingsJapgolly.stripe.stripeStrings.unverified
import typingsJapgolly.stripe.stripeStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetails extends js.Object {
  /**
    * A user-displayable string describing the verification state for the person.
    * For example, this may say “Provided identity information could not be verified”.
    */
  var details: js.UndefOr[String] = js.undefined
  /**
    * One of document_address_mismatch, document_dob_mismatch, document_duplicate_type, document_id_number_mismatch,
    * document_name_mismatch, failed_keyed_identity, or failed_other.
    * A machine-readable code specifying the verification state for the person.
    */
  var details_code: js.UndefOr[
    document_address_mismatch | document_dob_mismatch | document_duplicate_type | document_id_number_mismatch | document_name_mismatch | failed_keyed_identity | failed_other
  ] = js.undefined
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: js.UndefOr[AnonBack] = js.undefined
  /**
    * The state of verification for the person. Possible values are unverified, pending, or verified.
    */
  var status: js.UndefOr[unverified | pending | verified] = js.undefined
}

object AnonDetails {
  @scala.inline
  def apply(
    details: String = null,
    details_code: document_address_mismatch | document_dob_mismatch | document_duplicate_type | document_id_number_mismatch | document_name_mismatch | failed_keyed_identity | failed_other = null,
    document: AnonBack = null,
    status: unverified | pending | verified = null
  ): AnonDetails = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (details_code != null) __obj.updateDynamic("details_code")(details_code.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetails]
  }
}

