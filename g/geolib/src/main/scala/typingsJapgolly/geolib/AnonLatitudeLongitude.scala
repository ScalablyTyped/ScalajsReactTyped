package typingsJapgolly.geolib

import typingsJapgolly.geolib.geolibNumbers.`0`
import typingsJapgolly.geolib.geolibNumbers.`1`
import typingsJapgolly.geolib.geolibStrings.lat
import typingsJapgolly.geolib.geolibStrings.latitude
import typingsJapgolly.geolib.geolibStrings.lng
import typingsJapgolly.geolib.geolibStrings.lon
import typingsJapgolly.geolib.geolibStrings.longitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLatitudeLongitude extends js.Object {
  var latitude: js.UndefOr[lat | typingsJapgolly.geolib.geolibStrings.latitude | `1`] = js.undefined
  var longitude: js.UndefOr[`0` | lng | lon | typingsJapgolly.geolib.geolibStrings.longitude] = js.undefined
}

object AnonLatitudeLongitude {
  @scala.inline
  def apply(latitude: lat | latitude | `1` = null, longitude: `0` | lng | lon | longitude = null): AnonLatitudeLongitude = {
    val __obj = js.Dynamic.literal()
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLatitudeLongitude]
  }
}

