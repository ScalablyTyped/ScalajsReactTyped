package typingsJapgolly.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleMaps.googleMapsStrings.metric
  - typingsJapgolly.googleMaps.googleMapsStrings.imperial
*/
trait UnitSystem extends js.Object

object UnitSystem {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imperial: typingsJapgolly.googleMaps.googleMapsStrings.imperial = this.cast("imperial")
  @scala.inline
  def metric: typingsJapgolly.googleMaps.googleMapsStrings.metric = this.cast("metric")
}

