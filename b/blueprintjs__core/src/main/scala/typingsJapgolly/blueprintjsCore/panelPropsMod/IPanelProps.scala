package typingsJapgolly.blueprintjsCore.panelPropsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelProps extends js.Object {
  /**
    * Call this method to programatically close this panel. If this is the only
    * panel on the stack then this method will do nothing.
    *
    * Remember that the panel header always contains a "back" button that
    * closes this panel on click (unless there is only one panel on the stack).
    */
  def closePanel(): Unit
  /**
    * Call this method to open a new panel on the top of the stack.
    */
  def openPanel[P](panel: IPanel[P]): Unit
}

object IPanelProps {
  @scala.inline
  def apply(closePanel: Callback, openPanel: IPanel[js.Any] => Callback): IPanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closePanel")(closePanel.toJsFn)
    __obj.updateDynamic("openPanel")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsCore.panelPropsMod.IPanel[js.Any]) => openPanel(t0).runNow()))
    __obj.asInstanceOf[IPanelProps]
  }
}

