package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellCallbacks extends js.Object {
  // Cell Events
  /** callback for when user clicks on a cell in this column  */
  var cellClick: js.UndefOr[CellEventCallback] = js.undefined
  /** callback for when user right clicks on a cell in this column */
  var cellContext: js.UndefOr[CellEventCallback] = js.undefined
  /**  callback for when user double clicks on a cell in this column */
  var cellDblClick: js.UndefOr[CellEventCallback] = js.undefined
  /**  callback for when user double taps on a cell in this column, triggered in touch displays when a user taps the same cell twice in under 300ms.  */
  var cellDblTap: js.UndefOr[CellEventCallback] = js.undefined
  /**  callback for when an edit on a cell in this column is aborted by the user  */
  var cellEditCancelled: js.UndefOr[CellEditEventCallback] = js.undefined
  /** callback for when a cell in this column has been edited by the user */
  var cellEdited: js.UndefOr[CellEditEventCallback] = js.undefined
  // Cell editing
  /** callback for when a cell in this column is being edited by the user */
  var cellEditing: js.UndefOr[CellEditEventCallback] = js.undefined
  /** callback for when the mouse pointer enters a cell */
  var cellMouseEnter: js.UndefOr[CellEventCallback] = js.undefined
  /**  callback for when the mouse pointer leaves a cell */
  var cellMouseLeave: js.UndefOr[CellEventCallback] = js.undefined
  /** callback for when the mouse pointer moves over a cell  */
  var cellMouseMove: js.UndefOr[CellEventCallback] = js.undefined
  /** callback for when the mouse pointer enters a cell or one of its child elements */
  var cellMouseOut: js.UndefOr[CellEventCallback] = js.undefined
  /**  callback for when the mouse pointer enters a cell or one of its child elements */
  var cellMouseOver: js.UndefOr[CellEventCallback] = js.undefined
  /** callback for when user taps on a cell in this column, triggered in touch displays.  */
  var cellTap: js.UndefOr[CellEventCallback] = js.undefined
  /**  callback for when user taps and holds on a cell in this column, triggered in touch displays when a user taps and holds the same cell for 1 second.*/
  var cellTapHold: js.UndefOr[CellEventCallback] = js.undefined
}

object CellCallbacks {
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
    cellTapHold: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null
  ): CellCallbacks = {
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
    __obj.asInstanceOf[CellCallbacks]
  }
}

