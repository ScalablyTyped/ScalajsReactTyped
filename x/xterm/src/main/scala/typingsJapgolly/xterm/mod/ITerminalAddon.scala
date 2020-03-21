package typingsJapgolly.xterm.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITerminalAddon extends IDisposable {
  /**
    * This is called when the addon is activated.
    */
  def activate(terminal: Terminal): Unit
}

object ITerminalAddon {
  @scala.inline
  def apply(activate: Terminal => Callback, dispose: Callback): ITerminalAddon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activate")(js.Any.fromFunction1((t0: typingsJapgolly.xterm.mod.Terminal) => activate(t0).runNow()))
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[ITerminalAddon]
  }
}

