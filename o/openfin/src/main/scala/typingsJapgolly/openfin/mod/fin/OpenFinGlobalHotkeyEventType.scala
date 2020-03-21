package typingsJapgolly.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openfin.openfinStrings.registered
  - typingsJapgolly.openfin.openfinStrings.unregistered
*/
trait OpenFinGlobalHotkeyEventType extends js.Object

object OpenFinGlobalHotkeyEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def registered: typingsJapgolly.openfin.openfinStrings.registered = this.cast("registered")
  @scala.inline
  def unregistered: typingsJapgolly.openfin.openfinStrings.unregistered = this.cast("unregistered")
}

