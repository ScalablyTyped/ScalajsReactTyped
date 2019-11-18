package typingsJapgolly.googlemaps.google.maps.Data

import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.Point")
@js.native
class Point protected () extends Geometry {
  def this(latLng: LatLng) = this()
  def this(latLng: LatLngLiteral) = this()
  def get(): LatLng = js.native
}

