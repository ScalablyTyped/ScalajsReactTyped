package typingsJapgolly.reactVirtualized

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactVirtualized.esTableMod.TableCellDataGetter
import typingsJapgolly.reactVirtualized.esTableMod.TableCellDataGetterParams
import typingsJapgolly.reactVirtualized.esTableMod.TableCellProps
import typingsJapgolly.reactVirtualized.esTableMod.TableCellRenderer
import typingsJapgolly.reactVirtualized.esTableMod.TableHeaderProps
import typingsJapgolly.reactVirtualized.esTableMod.TableHeaderRenderer
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`0`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellRenderer extends js.Object {
  var cellDataGetter: TableCellDataGetter
  var cellRenderer: TableCellRenderer
  var flexGrow: `0`
  var flexShrink: `1`
  var headerRenderer: TableHeaderRenderer
}

object AnonCellRenderer {
  @scala.inline
  def apply(
    cellDataGetter: /* params */ TableCellDataGetterParams => CallbackTo[js.Any],
    cellRenderer: /* props */ TableCellProps => CallbackTo[Node],
    flexGrow: `0`,
    flexShrink: `1`,
    headerRenderer: /* props */ TableHeaderProps => CallbackTo[Node]
  ): AnonCellRenderer = {
    val __obj = js.Dynamic.literal(flexGrow = flexGrow.asInstanceOf[js.Any], flexShrink = flexShrink.asInstanceOf[js.Any])
    __obj.updateDynamic("cellDataGetter")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esTableMod.TableCellDataGetterParams) => cellDataGetter(t0).runNow()))
    __obj.updateDynamic("cellRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactVirtualized.esTableMod.TableCellProps) => cellRenderer(t0).runNow()))
    __obj.updateDynamic("headerRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactVirtualized.esTableMod.TableHeaderProps) => headerRenderer(t0).runNow()))
    __obj.asInstanceOf[AnonCellRenderer]
  }
}

