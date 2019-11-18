package typingsJapgolly.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googlemaps.googlemapsStrings.Point
  - typings.googlemaps.googlemapsStrings.LineString
  - typings.googlemaps.googlemapsStrings.Polygon
*/
trait DrawingMode extends js.Object

object DrawingMode {
  @scala.inline
  def LineString: typingsJapgolly.googlemaps.googlemapsStrings.LineString = this.cast("LineString")
  @scala.inline
  def Point: typingsJapgolly.googlemaps.googlemapsStrings.Point = this.cast("Point")
  @scala.inline
  def Polygon: typingsJapgolly.googlemaps.googlemapsStrings.Polygon = this.cast("Polygon")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

