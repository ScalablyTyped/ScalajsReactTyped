package typingsJapgolly.baseui

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.baseui.dataTableMod.RowT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClearSelection extends js.Object {
  var event: ReactMouseEventFrom[HTMLButtonElement]
  var selection: js.Array[RowT]
  def clearSelection(): js.Any
}

object AnonClearSelection {
  @scala.inline
  def apply(
    clearSelection: CallbackTo[js.Any],
    event: ReactMouseEventFrom[HTMLButtonElement],
    selection: js.Array[RowT]
  ): AnonClearSelection = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.updateDynamic("clearSelection")(clearSelection.toJsFn)
    __obj.asInstanceOf[AnonClearSelection]
  }
}

