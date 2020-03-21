package typingsJapgolly.stripeV3

import typingsJapgolly.stripeV3.stripeV3Strings.de
import typingsJapgolly.stripeV3.stripeV3Strings.en
import typingsJapgolly.stripeV3.stripeV3Strings.es
import typingsJapgolly.stripeV3.stripeV3Strings.fr
import typingsJapgolly.stripeV3.stripeV3Strings.it
import typingsJapgolly.stripeV3.stripeV3Strings.nl
import typingsJapgolly.stripeV3.stripeV3Strings.pl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCountry extends js.Object {
  var country: String
  var preferred_language: js.UndefOr[de | en | es | it | fr | nl | pl] = js.undefined
}

object AnonCountry {
  @scala.inline
  def apply(country: String, preferred_language: de | en | es | it | fr | nl | pl = null): AnonCountry = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    if (preferred_language != null) __obj.updateDynamic("preferred_language")(preferred_language.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountry]
  }
}

