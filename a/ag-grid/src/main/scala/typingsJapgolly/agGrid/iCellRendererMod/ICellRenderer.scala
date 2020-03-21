package typingsJapgolly.agGrid.iCellRendererMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellRenderer extends js.Object {
  /** Get the cell to refresh. Return true if successful. Return false if not (or you don't have refresh logic),
    * then the grid will refresh the cell for you. */
  def refresh(params: js.Any): Boolean
}

object ICellRenderer {
  @scala.inline
  def apply(refresh: js.Any => CallbackTo[Boolean]): ICellRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("refresh")(js.Any.fromFunction1((t0: js.Any) => refresh(t0).runNow()))
    __obj.asInstanceOf[ICellRenderer]
  }
}

