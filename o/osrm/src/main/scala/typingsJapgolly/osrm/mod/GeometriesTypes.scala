package typingsJapgolly.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.osrm.osrmStrings.polyline
  - typingsJapgolly.osrm.osrmStrings.geojson
  - typingsJapgolly.osrm.osrmStrings.polyline6
*/
trait GeometriesTypes extends js.Object

object GeometriesTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def geojson: typingsJapgolly.osrm.osrmStrings.geojson = this.cast("geojson")
  @scala.inline
  def polyline: typingsJapgolly.osrm.osrmStrings.polyline = this.cast("polyline")
  @scala.inline
  def polyline6: typingsJapgolly.osrm.osrmStrings.polyline6 = this.cast("polyline6")
}

