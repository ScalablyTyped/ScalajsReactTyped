package typingsJapgolly.xummApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xummApi.xummApiStrings.ALREADY_CANCELLED
  - typingsJapgolly.xummApi.xummApiStrings.ALREADY_RESOLVED
  - typingsJapgolly.xummApi.xummApiStrings.ALREADY_OPENED
  - typingsJapgolly.xummApi.xummApiStrings.ALREADY_EXPIRED
*/
trait XummCancelReason extends js.Object

object XummCancelReason {
  @scala.inline
  def ALREADY_CANCELLED: typingsJapgolly.xummApi.xummApiStrings.ALREADY_CANCELLED = this.cast("ALREADY_CANCELLED")
  @scala.inline
  def ALREADY_EXPIRED: typingsJapgolly.xummApi.xummApiStrings.ALREADY_EXPIRED = this.cast("ALREADY_EXPIRED")
  @scala.inline
  def ALREADY_OPENED: typingsJapgolly.xummApi.xummApiStrings.ALREADY_OPENED = this.cast("ALREADY_OPENED")
  @scala.inline
  def ALREADY_RESOLVED: typingsJapgolly.xummApi.xummApiStrings.ALREADY_RESOLVED = this.cast("ALREADY_RESOLVED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

