package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.mounted
  - typings.std.stdStrings.navigation
  - typings.std.stdStrings.requested
  - typings.std.stdStrings.unmounted
*/
trait VRDisplayEventReason extends js.Object

object VRDisplayEventReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mounted: typingsJapgolly.std.stdStrings.mounted = this.cast("mounted")
  @scala.inline
  def navigation: typingsJapgolly.std.stdStrings.navigation = this.cast("navigation")
  @scala.inline
  def requested: typingsJapgolly.std.stdStrings.requested = this.cast("requested")
  @scala.inline
  def unmounted: typingsJapgolly.std.stdStrings.unmounted = this.cast("unmounted")
}

