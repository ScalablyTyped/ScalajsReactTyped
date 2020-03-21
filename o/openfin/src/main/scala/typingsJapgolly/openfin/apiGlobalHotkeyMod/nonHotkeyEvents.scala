package typingsJapgolly.openfin.apiGlobalHotkeyMod

import typingsJapgolly.openfin.openfinStrings.registered
import typingsJapgolly.openfin.openfinStrings.unregistered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openfin.openfinStrings.registered
  - typingsJapgolly.openfin.openfinStrings.unregistered
*/
trait nonHotkeyEvents extends js.Object

object nonHotkeyEvents {
  @scala.inline
  def REGISTERED: registered = this.cast("registered")
  @scala.inline
  def UNREGISTERED: unregistered = this.cast("unregistered")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

