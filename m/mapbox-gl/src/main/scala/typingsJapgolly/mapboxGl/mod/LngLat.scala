package typingsJapgolly.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "LngLat")
@js.native
class LngLat protected () extends _LngLatLike {
  def this(lng: Double, lat: Double) = this()
  var lat: Double = js.native
  var lng: Double = js.native
  /** Return a LngLat as an array */
  def toArray(): js.Array[Double] = js.native
  def toBounds(radius: Double): LngLatBounds = js.native
  /** Return a new LngLat object whose longitude is wrapped to the range (-180, 180). */
  def wrap(): LngLat = js.native
}

/* static members */
@JSImport("mapbox-gl", "LngLat")
@js.native
object LngLat extends js.Object {
  def convert(input: LngLatLike): LngLat = js.native
}

