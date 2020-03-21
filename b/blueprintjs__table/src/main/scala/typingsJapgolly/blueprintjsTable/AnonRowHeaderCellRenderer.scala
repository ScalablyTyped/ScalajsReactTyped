package typingsJapgolly.blueprintjsTable

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowHeaderCellRenderer extends js.Object {
  var rowHeaderCellRenderer: js.Function1[/* rowIndex */ Double, Element]
}

object AnonRowHeaderCellRenderer {
  @scala.inline
  def apply(rowHeaderCellRenderer: /* rowIndex */ Double => CallbackTo[Element]): AnonRowHeaderCellRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction1((t0: /* rowIndex */ scala.Double) => rowHeaderCellRenderer(t0).runNow()))
    __obj.asInstanceOf[AnonRowHeaderCellRenderer]
  }
}

