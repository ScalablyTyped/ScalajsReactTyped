package typingsJapgolly.onfleetNodeOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApartment extends js.Object {
  var apartment: String
  var city: String
  var country: String
  var number: String
  var postalCode: String
  var state: String
  var street: String
}

object AnonApartment {
  @scala.inline
  def apply(
    apartment: String,
    city: String,
    country: String,
    number: String,
    postalCode: String,
    state: String,
    street: String
  ): AnonApartment = {
    val __obj = js.Dynamic.literal(apartment = apartment.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApartment]
  }
}

