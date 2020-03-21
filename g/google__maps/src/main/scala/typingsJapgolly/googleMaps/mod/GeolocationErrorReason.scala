package typingsJapgolly.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleMaps.googleMapsStrings.dailyLimitExceeded
  - typingsJapgolly.googleMaps.googleMapsStrings.keyInvalid
  - typingsJapgolly.googleMaps.googleMapsStrings.userRateLimitExceeded
  - typingsJapgolly.googleMaps.googleMapsStrings.notFound
  - typingsJapgolly.googleMaps.googleMapsStrings.parseError
*/
trait GeolocationErrorReason extends js.Object

object GeolocationErrorReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dailyLimitExceeded: typingsJapgolly.googleMaps.googleMapsStrings.dailyLimitExceeded = this.cast("dailyLimitExceeded")
  @scala.inline
  def keyInvalid: typingsJapgolly.googleMaps.googleMapsStrings.keyInvalid = this.cast("keyInvalid")
  @scala.inline
  def notFound: typingsJapgolly.googleMaps.googleMapsStrings.notFound = this.cast("notFound")
  @scala.inline
  def parseError: typingsJapgolly.googleMaps.googleMapsStrings.parseError = this.cast("parseError")
  @scala.inline
  def userRateLimitExceeded: typingsJapgolly.googleMaps.googleMapsStrings.userRateLimitExceeded = this.cast("userRateLimitExceeded")
}

