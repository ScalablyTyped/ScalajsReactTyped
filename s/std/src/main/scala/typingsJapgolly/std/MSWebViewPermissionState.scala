package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.allow
  - typingsJapgolly.std.stdStrings.defer
  - typingsJapgolly.std.stdStrings.deny
  - typingsJapgolly.std.stdStrings.unknown
*/
trait MSWebViewPermissionState extends js.Object

object MSWebViewPermissionState {
  @scala.inline
  def allow: typingsJapgolly.std.stdStrings.allow = this.cast("allow")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def defer: typingsJapgolly.std.stdStrings.defer = this.cast("defer")
  @scala.inline
  def deny: typingsJapgolly.std.stdStrings.deny = this.cast("deny")
  @scala.inline
  def unknown: typingsJapgolly.std.stdStrings.unknown = this.cast("unknown")
}

