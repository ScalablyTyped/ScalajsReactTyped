package typingsJapgolly.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see {@link LatLngLiteral}. */
trait ReadonlyLatLngLiteral extends js.Object {
  /** @see {@link LatLngLiteral#lat} */
  val lat: Double
  /** @see {@link LatLngLiteral#lng} */
  val lng: Double
}

object ReadonlyLatLngLiteral {
  @scala.inline
  def apply(lat: Double, lng: Double): ReadonlyLatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadonlyLatLngLiteral]
  }
}

