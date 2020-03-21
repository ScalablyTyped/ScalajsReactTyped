package typingsJapgolly.winrt.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICivicAddress extends js.Object {
  var city: String
  var country: String
  var postalCode: String
  var state: String
  var timestamp: js.Date
}

object ICivicAddress {
  @scala.inline
  def apply(city: String, country: String, postalCode: String, state: String, timestamp: js.Date): ICivicAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICivicAddress]
  }
}

