package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.geolocation
  - typingsJapgolly.std.stdStrings.media
  - typingsJapgolly.std.stdStrings.pointerlock
  - typingsJapgolly.std.stdStrings.unlimitedIndexedDBQuota
  - typingsJapgolly.std.stdStrings.webnotifications
*/
trait MSWebViewPermissionType extends js.Object

object MSWebViewPermissionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def geolocation: typingsJapgolly.std.stdStrings.geolocation = this.cast("geolocation")
  @scala.inline
  def media: typingsJapgolly.std.stdStrings.media = this.cast("media")
  @scala.inline
  def pointerlock: typingsJapgolly.std.stdStrings.pointerlock = this.cast("pointerlock")
  @scala.inline
  def unlimitedIndexedDBQuota: typingsJapgolly.std.stdStrings.unlimitedIndexedDBQuota = this.cast("unlimitedIndexedDBQuota")
  @scala.inline
  def webnotifications: typingsJapgolly.std.stdStrings.webnotifications = this.cast("webnotifications")
}

