package typingsJapgolly.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakpointsChangeEvent extends js.Object {
  /**
  		 * Added breakpoints.
  		 */
  val added: js.Array[Breakpoint]
  /**
  		 * Changed breakpoints.
  		 */
  val changed: js.Array[Breakpoint]
  /**
  		 * Removed breakpoints.
  		 */
  val removed: js.Array[Breakpoint]
}

object BreakpointsChangeEvent {
  @scala.inline
  def apply(added: js.Array[Breakpoint], changed: js.Array[Breakpoint], removed: js.Array[Breakpoint]): BreakpointsChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BreakpointsChangeEvent]
  }
}

