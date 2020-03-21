package typingsJapgolly.stripe.mod.issuing.cardholders

import typingsJapgolly.stripe.AnonDay
import typingsJapgolly.stripe.AnonDocumentAnonFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardholderIndividual extends js.Object {
  /**
    * The date of birth of this cardholder.
    */
  var dob: AnonDay
  /**
    * The first name of this cardholder.
    */
  var first_name: String
  /**
    * The last name of this cardholder.
    */
  var last_name: String
  /**
    * Government-issued ID document for this cardholder.
    */
  var verification: js.UndefOr[AnonDocumentAnonFront] = js.undefined
}

object ICardholderIndividual {
  @scala.inline
  def apply(dob: AnonDay, first_name: String, last_name: String, verification: AnonDocumentAnonFront = null): ICardholderIndividual = {
    val __obj = js.Dynamic.literal(dob = dob.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
    if (verification != null) __obj.updateDynamic("verification")(verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholderIndividual]
  }
}

