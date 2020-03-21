package typingsJapgolly.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleMaps.googleMapsStrings.OK
  - typingsJapgolly.googleMaps.googleMapsStrings.ZERO_RESULTS
  - typingsJapgolly.googleMaps.googleMapsStrings.OVER_QUERY_LIMIT
  - typingsJapgolly.googleMaps.googleMapsStrings.REQUEST_DENIED
  - typingsJapgolly.googleMaps.googleMapsStrings.INVALID_REQUEST
  - typingsJapgolly.googleMaps.googleMapsStrings.UNKNOWN_ERROR
*/
trait ReverseGeocodingResponseStatus extends js.Object

object ReverseGeocodingResponseStatus {
  @scala.inline
  def INVALID_REQUEST: typingsJapgolly.googleMaps.googleMapsStrings.INVALID_REQUEST = this.cast("INVALID_REQUEST")
  @scala.inline
  def OK: typingsJapgolly.googleMaps.googleMapsStrings.OK = this.cast("OK")
  @scala.inline
  def OVER_QUERY_LIMIT: typingsJapgolly.googleMaps.googleMapsStrings.OVER_QUERY_LIMIT = this.cast("OVER_QUERY_LIMIT")
  @scala.inline
  def REQUEST_DENIED: typingsJapgolly.googleMaps.googleMapsStrings.REQUEST_DENIED = this.cast("REQUEST_DENIED")
  @scala.inline
  def UNKNOWN_ERROR: typingsJapgolly.googleMaps.googleMapsStrings.UNKNOWN_ERROR = this.cast("UNKNOWN_ERROR")
  @scala.inline
  def ZERO_RESULTS: typingsJapgolly.googleMaps.googleMapsStrings.ZERO_RESULTS = this.cast("ZERO_RESULTS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

