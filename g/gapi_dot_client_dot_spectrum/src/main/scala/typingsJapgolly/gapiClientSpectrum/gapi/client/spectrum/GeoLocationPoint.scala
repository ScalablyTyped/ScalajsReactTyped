package typingsJapgolly.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoLocationPoint extends js.Object {
  /**
    * A required floating-point number that expresses the latitude in degrees using the WGS84 datum. For details on this encoding, see the National Imagery
    * and Mapping Agency's Technical Report TR8350.2.
    */
  var latitude: js.UndefOr[Double] = js.undefined
  /**
    * A required floating-point number that expresses the longitude in degrees using the WGS84 datum. For details on this encoding, see the National Imagery
    * and Mapping Agency's Technical Report TR8350.2.
    */
  var longitude: js.UndefOr[Double] = js.undefined
}

object GeoLocationPoint {
  @scala.inline
  def apply(latitude: Int | Double = null, longitude: Int | Double = null): GeoLocationPoint = {
    val __obj = js.Dynamic.literal()
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoLocationPoint]
  }
}

