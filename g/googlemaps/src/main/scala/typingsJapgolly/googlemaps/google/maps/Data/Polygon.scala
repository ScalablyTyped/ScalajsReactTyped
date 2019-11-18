package typingsJapgolly.googlemaps.google.maps.Data

import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.Polygon")
@js.native
class Polygon protected () extends Geometry {
  def this(elements: js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])]) = this()
  def getArray(): js.Array[LinearRing] = js.native
  def getAt(n: Double): LinearRing = js.native
  def getLength(): Double = js.native
}

