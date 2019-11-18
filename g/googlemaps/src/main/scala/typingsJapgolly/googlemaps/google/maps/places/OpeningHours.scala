package typingsJapgolly.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpeningHours extends js.Object {
  var open_now: Boolean
  var periods: js.Array[OpeningPeriod]
  var weekday_text: js.Array[String]
}

object OpeningHours {
  @scala.inline
  def apply(open_now: Boolean, periods: js.Array[OpeningPeriod], weekday_text: js.Array[String]): OpeningHours = {
    val __obj = js.Dynamic.literal(open_now = open_now.asInstanceOf[js.Any], periods = periods.asInstanceOf[js.Any], weekday_text = weekday_text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpeningHours]
  }
}

