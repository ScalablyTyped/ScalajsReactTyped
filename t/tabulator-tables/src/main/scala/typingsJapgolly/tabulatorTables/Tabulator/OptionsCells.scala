package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsCells extends CellCallbacks {
  /** The validationFailed event is triggered when the value entered into a cell during an edit fails to pass validation. */
  var validationFailed: js.UndefOr[
    js.Function3[
      /* cell */ CellComponent, 
      /* value */ js.Any, 
      /* validators */ js.Array[StandardValidatorType | Validator], 
      Unit
    ]
  ] = js.undefined
}

object OptionsCells {
  @scala.inline
  def apply(
    cellClick: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellContext: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellDblClick: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellDblTap: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellEditCancelled: /* cell */ CellComponent => Callback = null,
    cellEdited: /* cell */ CellComponent => Callback = null,
    cellEditing: /* cell */ CellComponent => Callback = null,
    cellMouseEnter: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellMouseLeave: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellMouseMove: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellMouseOut: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellMouseOver: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellTap: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellTapHold: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    validationFailed: (/* cell */ CellComponent, /* value */ js.Any, /* validators */ js.Array[StandardValidatorType | Validator]) => Callback = null
  ): OptionsCells = {
    val __obj = js.Dynamic.literal()
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellClick(t0, t1).runNow()))
    if (cellContext != null) __obj.updateDynamic("cellContext")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellContext(t0, t1).runNow()))
    if (cellDblClick != null) __obj.updateDynamic("cellDblClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellDblClick(t0, t1).runNow()))
    if (cellDblTap != null) __obj.updateDynamic("cellDblTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellDblTap(t0, t1).runNow()))
    if (cellEditCancelled != null) __obj.updateDynamic("cellEditCancelled")(js.Any.fromFunction1((t0: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellEditCancelled(t0).runNow()))
    if (cellEdited != null) __obj.updateDynamic("cellEdited")(js.Any.fromFunction1((t0: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellEdited(t0).runNow()))
    if (cellEditing != null) __obj.updateDynamic("cellEditing")(js.Any.fromFunction1((t0: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellEditing(t0).runNow()))
    if (cellMouseEnter != null) __obj.updateDynamic("cellMouseEnter")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseEnter(t0, t1).runNow()))
    if (cellMouseLeave != null) __obj.updateDynamic("cellMouseLeave")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseLeave(t0, t1).runNow()))
    if (cellMouseMove != null) __obj.updateDynamic("cellMouseMove")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseMove(t0, t1).runNow()))
    if (cellMouseOut != null) __obj.updateDynamic("cellMouseOut")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseOut(t0, t1).runNow()))
    if (cellMouseOver != null) __obj.updateDynamic("cellMouseOver")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseOver(t0, t1).runNow()))
    if (cellTap != null) __obj.updateDynamic("cellTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellTap(t0, t1).runNow()))
    if (cellTapHold != null) __obj.updateDynamic("cellTapHold")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellTapHold(t0, t1).runNow()))
    if (validationFailed != null) __obj.updateDynamic("validationFailed")(js.Any.fromFunction3((t0: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent, t1: /* value */ js.Any, t2: /* validators */ js.Array[
  typingsJapgolly.tabulatorTables.Tabulator.StandardValidatorType | typingsJapgolly.tabulatorTables.Tabulator.Validator]) => validationFailed(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OptionsCells]
  }
}

