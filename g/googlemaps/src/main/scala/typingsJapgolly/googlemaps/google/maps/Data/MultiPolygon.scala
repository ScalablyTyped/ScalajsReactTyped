package typingsJapgolly.googlemaps.google.maps.Data

import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.MultiPolygon")
@js.native
class MultiPolygon protected () extends Geometry {
  def this(elements: js.Array[
        typingsJapgolly.googlemaps.google.maps.Data.Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])
      ]) = this()
  def getArray(): js.Array[typingsJapgolly.googlemaps.google.maps.Data.Polygon] = js.native
  def getAt(n: Double): typingsJapgolly.googlemaps.google.maps.Data.Polygon = js.native
  def getLength(): Double = js.native
}

