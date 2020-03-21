package typingsJapgolly.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleMaps.googleMapsStrings.OK
  - typingsJapgolly.googleMaps.googleMapsStrings.INVALID_REQUEST
  - typingsJapgolly.googleMaps.googleMapsStrings.MAX_ELEMENTS_EXCEEDED
  - typingsJapgolly.googleMaps.googleMapsStrings.OVER_DAILY_LIMIT
  - typingsJapgolly.googleMaps.googleMapsStrings.OVER_QUERY_LIMIT
  - typingsJapgolly.googleMaps.googleMapsStrings.REQUEST_DENIED
  - typingsJapgolly.googleMaps.googleMapsStrings.UNKNOWN_ERROR
*/
trait DistanceMatrixResponseTopLevelStatus extends js.Object

object DistanceMatrixResponseTopLevelStatus {
  @scala.inline
  def INVALID_REQUEST: typingsJapgolly.googleMaps.googleMapsStrings.INVALID_REQUEST = this.cast("INVALID_REQUEST")
  @scala.inline
  def MAX_ELEMENTS_EXCEEDED: typingsJapgolly.googleMaps.googleMapsStrings.MAX_ELEMENTS_EXCEEDED = this.cast("MAX_ELEMENTS_EXCEEDED")
  @scala.inline
  def OK: typingsJapgolly.googleMaps.googleMapsStrings.OK = this.cast("OK")
  @scala.inline
  def OVER_DAILY_LIMIT: typingsJapgolly.googleMaps.googleMapsStrings.OVER_DAILY_LIMIT = this.cast("OVER_DAILY_LIMIT")
  @scala.inline
  def OVER_QUERY_LIMIT: typingsJapgolly.googleMaps.googleMapsStrings.OVER_QUERY_LIMIT = this.cast("OVER_QUERY_LIMIT")
  @scala.inline
  def REQUEST_DENIED: typingsJapgolly.googleMaps.googleMapsStrings.REQUEST_DENIED = this.cast("REQUEST_DENIED")
  @scala.inline
  def UNKNOWN_ERROR: typingsJapgolly.googleMaps.googleMapsStrings.UNKNOWN_ERROR = this.cast("UNKNOWN_ERROR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

