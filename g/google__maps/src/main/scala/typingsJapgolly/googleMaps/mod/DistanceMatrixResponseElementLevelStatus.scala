package typingsJapgolly.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleMaps.googleMapsStrings.OK
  - typingsJapgolly.googleMaps.googleMapsStrings.NOT_FOUND
  - typingsJapgolly.googleMaps.googleMapsStrings.ZERO_RESULTS
  - typingsJapgolly.googleMaps.googleMapsStrings.MAX_ROUTE_LENGTH_EXCEEDED
*/
trait DistanceMatrixResponseElementLevelStatus extends js.Object

object DistanceMatrixResponseElementLevelStatus {
  @scala.inline
  def MAX_ROUTE_LENGTH_EXCEEDED: typingsJapgolly.googleMaps.googleMapsStrings.MAX_ROUTE_LENGTH_EXCEEDED = this.cast("MAX_ROUTE_LENGTH_EXCEEDED")
  @scala.inline
  def NOT_FOUND: typingsJapgolly.googleMaps.googleMapsStrings.NOT_FOUND = this.cast("NOT_FOUND")
  @scala.inline
  def OK: typingsJapgolly.googleMaps.googleMapsStrings.OK = this.cast("OK")
  @scala.inline
  def ZERO_RESULTS: typingsJapgolly.googleMaps.googleMapsStrings.ZERO_RESULTS = this.cast("ZERO_RESULTS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

