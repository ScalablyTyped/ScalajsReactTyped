package typingsJapgolly.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var text: String
  var time_zone: String
  var value: js.Date
}

object Time {
  @scala.inline
  def apply(text: String, time_zone: String, value: js.Date): Time = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], time_zone = time_zone.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Time]
  }
}

