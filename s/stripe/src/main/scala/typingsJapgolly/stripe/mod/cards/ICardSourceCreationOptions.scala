package typingsJapgolly.stripe.mod.cards

import typingsJapgolly.stripe.mod.IOptionsMetadata
import typingsJapgolly.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardSourceCreationOptions extends js.Object {
  var address_city: js.UndefOr[String] = js.undefined
  var address_country: js.UndefOr[String] = js.undefined
  var address_line1: js.UndefOr[String] = js.undefined
  var address_line2: js.UndefOr[String] = js.undefined
  var address_state: js.UndefOr[String] = js.undefined
  var address_zip: js.UndefOr[String] = js.undefined
  /**
    * Card security code. Required unless your account is registered in
    * Australia, Canada, or the United States. Highly recommended to always
    * include this value.
    */
  var cvc: js.UndefOr[String] = js.undefined
  /**
    * Two digit number representing the card's expiration month.
    */
  var exp_month: Double
  /**
    * Two or four digit number representing the card's expiration year.
    */
  var exp_year: Double
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  /**
    * Cardholder's full name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The card number, as a string without any separators.
    */
  var number: String
  /**
    * The type of payment source. Should be "card".
    */
  var `object`: card
}

object ICardSourceCreationOptions {
  @scala.inline
  def apply(
    exp_month: Double,
    exp_year: Double,
    number: String,
    `object`: card,
    address_city: String = null,
    address_country: String = null,
    address_line1: String = null,
    address_line2: String = null,
    address_state: String = null,
    address_zip: String = null,
    cvc: String = null,
    metadata: IOptionsMetadata = null,
    name: String = null
  ): ICardSourceCreationOptions = {
    val __obj = js.Dynamic.literal(exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (address_city != null) __obj.updateDynamic("address_city")(address_city.asInstanceOf[js.Any])
    if (address_country != null) __obj.updateDynamic("address_country")(address_country.asInstanceOf[js.Any])
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1.asInstanceOf[js.Any])
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2.asInstanceOf[js.Any])
    if (address_state != null) __obj.updateDynamic("address_state")(address_state.asInstanceOf[js.Any])
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip.asInstanceOf[js.Any])
    if (cvc != null) __obj.updateDynamic("cvc")(cvc.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardSourceCreationOptions]
  }
}

