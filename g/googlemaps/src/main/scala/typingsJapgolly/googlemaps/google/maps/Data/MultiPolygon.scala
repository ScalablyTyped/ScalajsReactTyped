package typingsJapgolly.googlemaps.google.maps.Data

import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.MultiPolygon")
@js.native
class MultiPolygon protected () extends Geometry {
  def this(elements: js.Array[Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])]) = this()
  def getArray(): js.Array[Polygon] = js.native
  def getAt(n: Double): Polygon = js.native
  def getLength(): Double = js.native
}

