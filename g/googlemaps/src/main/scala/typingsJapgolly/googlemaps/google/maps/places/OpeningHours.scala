package typingsJapgolly.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpeningHours extends js.Object {
  /**
    * @deprecated open_now is deprecated as of November 2019 and will be turned off in November 2020.
    *      Use the PlaceOpeningHours.isOpen function from a PlacesService.getDetails result instead.
    */
  var open_now: Boolean = js.native
  var periods: js.Array[OpeningPeriod] = js.native
  var weekday_text: js.Array[String] = js.native
  def isOpen(): Boolean = js.native
  def isOpen(date: js.Date): Boolean = js.native
}

