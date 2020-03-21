package typingsJapgolly.iabVpaid.iab.vpaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The vpaid view mode set on init or on resize */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.iabVpaid.iabVpaidStrings.normal
  - typingsJapgolly.iabVpaid.iabVpaidStrings.thumbnail
  - typingsJapgolly.iabVpaid.iabVpaidStrings.fullscreen
*/
trait ViewMode extends js.Object

object ViewMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fullscreen: typingsJapgolly.iabVpaid.iabVpaidStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def normal: typingsJapgolly.iabVpaid.iabVpaidStrings.normal = this.cast("normal")
  @scala.inline
  def thumbnail: typingsJapgolly.iabVpaid.iabVpaidStrings.thumbnail = this.cast("thumbnail")
}

