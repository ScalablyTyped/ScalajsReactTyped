package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`false`
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.add
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.bottom
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.click
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.delete
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.highlight
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.insert
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.replace
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.top
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsRows extends js.Object {
  /** The position in the table for new rows to be added, "bottom" or "top" */
  var addRowPos: js.UndefOr[bottom | top] = js.undefined
  /** The dataTreeRowCollapsed callback is triggered when a row with child rows is collapsed to hide its children.*/
  var dataTreeRowCollapsed: js.UndefOr[js.Function2[/* row */ RowComponent, /* level */ Double, Unit]] = js.undefined
  /** The dataTreeRowExpanded callback is triggered when a row with child rows is expanded to reveal the children. */
  var dataTreeRowExpanded: js.UndefOr[js.Function2[/* row */ RowComponent, /* level */ Double, Unit]] = js.undefined
  /** To allow the user to move rows up and down the table, set the movableRows parameter in the options: */
  var movableRows: js.UndefOr[Boolean] = js.undefined
  /** Tabulator also allows you to move rows between tables. To enable this you should supply either a valid CSS selector string a DOM node for the table or the Tabuator object for the table to the movableRowsConnectedTables option. if you want to connect to multple tables then you can pass in an array of values to this option. */
  var movableRowsConnectedTables: js.UndefOr[String | (js.Array[HTMLElement | String]) | HTMLElement] = js.undefined
  /** The movableRowsReceived callback is triggered on a receiving table when a row has been successfuly received.*/
  var movableRowsReceived: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.undefined
  /** The movableRowsReceivedFailed callback is triggered on a receiving table when a row receiver has returned false.*/
  var movableRowsReceivedFailed: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.undefined
  /**  The movableRowsReceiver option should be set on the receiving tables, and sets the action that should be taken when the row is dropped into the table.
    There are several inbuilt receiver functions:
    insert - inserts row next to the row it was dropped on, if not dropped on a row it is added to the table (default)
    add - adds row to the table
    update - updates the row it is dropped on with the sent rows data
    replace - replaces the row it is dropped on with the sent row*/
  var movableRowsReceiver: js.UndefOr[
    insert | add | update | replace | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator, 
      _
    ])
  ] = js.undefined
  /** The movableRowsReceivingStart callback is triggered on a receiving table when a connection is established with a sending table. */
  var movableRowsReceivingStart: js.UndefOr[
    js.Function2[
      /* fromRow */ RowComponent, 
      /* toTable */ typingsJapgolly.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.undefined
  /** The movableRowsReceivingStop callback is triggered on a receiving table after a row has been dropped and any senders and receivers have been handled.*/
  var movableRowsReceivingStop: js.UndefOr[js.Function1[/* fromTable */ typingsJapgolly.tabulatorTables.Tabulator, Unit]] = js.undefined
  /** The movableRowsSender option should be set on the sending table, and sets the action that should be taken after the row has been successfuly dropped into the receiving table.
    There are several inbuilt sender functions:
    false - do nothing(default)
    delete - deletes the row from the table
    You can also pass a callback to the movableRowsSender option for custom sender functionality
    */
  var movableRowsSender: js.UndefOr[
    `false` | delete | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ typingsJapgolly.tabulatorTables.Tabulator, 
      _
    ])
  ] = js.undefined
  /** The movableRowsSendingStart callback is triggered on the sending table when a row is picked up from a sending table. */
  var movableRowsSendingStart: js.UndefOr[js.Function1[/* toTables */ js.Array[_], Unit]] = js.undefined
  /** The movableRowsSendingStop callback is triggered on the sending table after a row has been dropped and any senders and receivers have been handled. */
  var movableRowsSendingStop: js.UndefOr[js.Function1[/* toTables */ js.Array[_], Unit]] = js.undefined
  /** The movableRowsSent callback is triggered on the sending table when a row has been successfuly received by a receiving table. */
  var movableRowsSent: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ typingsJapgolly.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.undefined
  /** The movableRowsSentFailed callback is triggered on the sending table when a row has failed to be received by the receiving table.*/
  var movableRowsSentFailed: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ typingsJapgolly.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.undefined
  /** You can allow the user to manually resize rows by dragging the top or bottom border of a row. To enable this functionality, set the resizableRows property to true */
  var resizableRows: js.UndefOr[Boolean] = js.undefined
  /** The rowAdded callback is triggered when a row is added to the table by the addRow and updateOrAddRow functions. */
  var rowAdded: js.UndefOr[RowChangedCallback] = js.undefined
  /** The rowClick callback is triggered when a user clicks on a row. */
  var rowClick: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowContext callback is triggered when a user right clicks on a row.
    If you want to prevent the browsers context menu being triggered in this event you will need to include the preventDefault() function in your callback. */
  var rowContext: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowDblClick callback is triggered when a user double clicks on a row. */
  var rowDblClick: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowDblTap callback is triggered when a user taps on a row on a touch display twice in under 300ms. */
  var rowDblTap: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowDeleted callback is triggered when a row is deleted from the table by the deleteRow function. */
  var rowDeleted: js.UndefOr[RowChangedCallback] = js.undefined
  /** The rowDeselected event is triggered when a row is deselected, either by the user or programatically. */
  var rowDeselected: js.UndefOr[RowChangedCallback] = js.undefined
  /** Tabulator also allows you to define a row level formatter using the rowFormatter option. this lets you alter each row of the table based on the data it contains.
    The function accepts one argument, the RowComponent for the row being formatted. */
  var rowFormatter: js.UndefOr[js.Function1[/* row */ RowComponent, _]] = js.undefined
  /** The rowMouseEnter callback is triggered when the mouse pointer enters a row. */
  var rowMouseEnter: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowMouseLeave callback is triggered when the mouse pointer leaves a row. */
  var rowMouseLeave: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowMouseMove callback is triggered when the mouse pointer moves over a row. */
  var rowMouseMove: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowMouseOut callback is triggered when the mouse pointer leaves a row or any of its child elements. */
  var rowMouseOut: js.UndefOr[RowEventCallback] = js.undefined
  /**  The rowMouseOver callback is triggered when the mouse pointer enters a row or any of its child elements.*/
  var rowMouseOver: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowMoved callback will be triggered when a row has been successfuly moved. */
  var rowMoved: js.UndefOr[RowChangedCallback] = js.undefined
  /** The rowResized callback will be triggered when a row has been resized by the user. */
  var rowResized: js.UndefOr[RowChangedCallback] = js.undefined
  /** The rowSelected event is triggered when a row is selected, either by the user or programatically. */
  var rowSelected: js.UndefOr[RowChangedCallback] = js.undefined
  /** Whenever the number of selected rows changes, through selection or deselection, the rowSelectionChanged event is triggered. This passes an array of the data objects for each row in the order they were selected as the first argument, and an array of row components for each of the rows in order of selection as the second argument. */
  var rowSelectionChanged: js.UndefOr[js.Function2[/* data */ js.Array[_], /* rows */ js.Array[RowComponent], Unit]] = js.undefined
  /** The rowTap callback is triggered when a user taps on a row on a touch display. */
  var rowTap: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowTapHold callback is triggered when a user taps on a row on a touch display and holds their finger down for over 1 second. */
  var rowTapHold: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowUpdated callback is triggered when a row is updated by the updateRow, updateOrAddRow, updateData or updateOrAddData, functions. */
  var rowUpdated: js.UndefOr[RowChangedCallback] = js.undefined
  /** The default option for triggering a ScrollTo on a visible element can be set using the scrollToRowIfVisible option. It can take a boolean value:
    true - scroll to row, even if it is visible (default)
    false - scroll to row, unless it is currently visible, then don't move */
  var scrollToRowIfVisible: js.UndefOr[Boolean] = js.undefined
  /** * The default ScrollTo position can be set using the scrollToRowPosition option. It can take one of four possible values:
    top - position row with its top edge at the top of the table (default)
    center - position row with its top edge in the center of the table
    bottom - position row with its bottom edge at the bottom of the table
    nearest - position row on the edge of the table it is closest to
    */
  var scrollToRowPosition: js.UndefOr[ScrollToRowPostition] = js.undefined
  /** The selectable option can take one of a several values:
    false - selectable rows are disabled
    true - selectable rows are enabled, and you can select as many as you want
    integer - any integer value, this sets the maximum number of rows that can be selected (when the maximum number of selected rows is exeded, the first selected row will be deselected to allow the next row to be selected).
    "highlight" (default) - rows have the same hover stylings as selectable rows but do not change state when clicked. This is great for when you want to show that a row is clickable but don't want it to be selectable. */
  var selectable: js.UndefOr[Boolean | Double | highlight] = js.undefined
  /** You many want to exclude certain rows from being selected. The selectableCheck options allows you to pass a function to check if the current row should be selectable, returning true will allow row selection, false will result in nothing happening. The function should accept a RowComponent as its first argument. */
  var selectableCheck: js.UndefOr[js.Function1[/* row */ RowComponent, Boolean]] = js.undefined
  /** By default Tabulator will maintain selected rows when the table is filtered, sorted or paginated (but NOT when the setData function is used). If you want the selected rows to be cleared whenever the table view is updated then set the selectablePersistence option to false. */
  var selectablePersistence: js.UndefOr[Boolean] = js.undefined
  /** By default you can select a range of rows by holding down the shift key and click dragging over a number of rows to toggle the selected state state of all rows the cursor passes over.
    If you would prefere to select a range of row by clicking on the first row then holding down shift and clicking on the end row then you can acheive this by setting the selectableRangeMode to click */
  var selectableRangeMode: js.UndefOr[click] = js.undefined
  /** By default, row selection works on a rolling basis, if you set the selectable option to a numeric value then when you select past this number of rows, the first row to be selected will be deselected. If you want to disable this behaviour and instead prevent selection of new rows once the limit is reached you can set the selectableRollingSelection option to false. */
  var selectableRollingSelection: js.UndefOr[Boolean] = js.undefined
  /**  Allows you to specifcy the behaviour when the user tabs from the last editable cell on the last row of the table */
  var tabEndNewRow: js.UndefOr[Boolean | JSONRecord | (js.Function1[/* row */ RowComponent, _])] = js.undefined
}

object OptionsRows {
  @scala.inline
  def apply(
    addRowPos: bottom | top = null,
    dataTreeRowCollapsed: (/* row */ RowComponent, /* level */ Double) => Callback = null,
    dataTreeRowExpanded: (/* row */ RowComponent, /* level */ Double) => Callback = null,
    movableRows: js.UndefOr[Boolean] = js.undefined,
    movableRowsConnectedTables: String | (js.Array[HTMLElement | String]) | HTMLElement = null,
    movableRowsReceived: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator) => Callback = null,
    movableRowsReceivedFailed: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator) => Callback = null,
    movableRowsReceiver: insert | add | update | replace | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator, 
      _
    ]) = null,
    movableRowsReceivingStart: (/* fromRow */ RowComponent, /* toTable */ typingsJapgolly.tabulatorTables.Tabulator) => Callback = null,
    movableRowsReceivingStop: /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator => Callback = null,
    movableRowsSender: `false` | delete | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ typingsJapgolly.tabulatorTables.Tabulator, 
      _
    ]) = null,
    movableRowsSendingStart: /* toTables */ js.Array[js.Any] => Callback = null,
    movableRowsSendingStop: /* toTables */ js.Array[js.Any] => Callback = null,
    movableRowsSent: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ typingsJapgolly.tabulatorTables.Tabulator) => Callback = null,
    movableRowsSentFailed: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ typingsJapgolly.tabulatorTables.Tabulator) => Callback = null,
    resizableRows: js.UndefOr[Boolean] = js.undefined,
    rowAdded: /* row */ RowComponent => Callback = null,
    rowClick: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowContext: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowDblClick: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowDblTap: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowDeleted: /* row */ RowComponent => Callback = null,
    rowDeselected: /* row */ RowComponent => Callback = null,
    rowFormatter: /* row */ RowComponent => CallbackTo[js.Any] = null,
    rowMouseEnter: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowMouseLeave: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowMouseMove: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowMouseOut: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowMouseOver: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowMoved: /* row */ RowComponent => Callback = null,
    rowResized: /* row */ RowComponent => Callback = null,
    rowSelected: /* row */ RowComponent => Callback = null,
    rowSelectionChanged: (/* data */ js.Array[js.Any], /* rows */ js.Array[RowComponent]) => Callback = null,
    rowTap: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowTapHold: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowUpdated: /* row */ RowComponent => Callback = null,
    scrollToRowIfVisible: js.UndefOr[Boolean] = js.undefined,
    scrollToRowPosition: ScrollToRowPostition = null,
    selectable: Boolean | Double | highlight = null,
    selectableCheck: /* row */ RowComponent => CallbackTo[Boolean] = null,
    selectablePersistence: js.UndefOr[Boolean] = js.undefined,
    selectableRangeMode: click = null,
    selectableRollingSelection: js.UndefOr[Boolean] = js.undefined,
    tabEndNewRow: Boolean | JSONRecord | (js.Function1[/* row */ RowComponent, _]) = null
  ): OptionsRows = {
    val __obj = js.Dynamic.literal()
    if (addRowPos != null) __obj.updateDynamic("addRowPos")(addRowPos.asInstanceOf[js.Any])
    if (dataTreeRowCollapsed != null) __obj.updateDynamic("dataTreeRowCollapsed")(js.Any.fromFunction2((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* level */ scala.Double) => dataTreeRowCollapsed(t0, t1).runNow()))
    if (dataTreeRowExpanded != null) __obj.updateDynamic("dataTreeRowExpanded")(js.Any.fromFunction2((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* level */ scala.Double) => dataTreeRowExpanded(t0, t1).runNow()))
    if (!js.isUndefined(movableRows)) __obj.updateDynamic("movableRows")(movableRows.asInstanceOf[js.Any])
    if (movableRowsConnectedTables != null) __obj.updateDynamic("movableRowsConnectedTables")(movableRowsConnectedTables.asInstanceOf[js.Any])
    if (movableRowsReceived != null) __obj.updateDynamic("movableRowsReceived")(js.Any.fromFunction3((t0: /* fromRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* toRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t2: /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator) => movableRowsReceived(t0, t1, t2).runNow()))
    if (movableRowsReceivedFailed != null) __obj.updateDynamic("movableRowsReceivedFailed")(js.Any.fromFunction3((t0: /* fromRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* toRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t2: /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator) => movableRowsReceivedFailed(t0, t1, t2).runNow()))
    if (movableRowsReceiver != null) __obj.updateDynamic("movableRowsReceiver")(movableRowsReceiver.asInstanceOf[js.Any])
    if (movableRowsReceivingStart != null) __obj.updateDynamic("movableRowsReceivingStart")(js.Any.fromFunction2((t0: /* fromRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* toTable */ typingsJapgolly.tabulatorTables.Tabulator) => movableRowsReceivingStart(t0, t1).runNow()))
    if (movableRowsReceivingStop != null) __obj.updateDynamic("movableRowsReceivingStop")(js.Any.fromFunction1((t0: /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator) => movableRowsReceivingStop(t0).runNow()))
    if (movableRowsSender != null) __obj.updateDynamic("movableRowsSender")(movableRowsSender.asInstanceOf[js.Any])
    if (movableRowsSendingStart != null) __obj.updateDynamic("movableRowsSendingStart")(js.Any.fromFunction1((t0: /* toTables */ js.Array[js.Any]) => movableRowsSendingStart(t0).runNow()))
    if (movableRowsSendingStop != null) __obj.updateDynamic("movableRowsSendingStop")(js.Any.fromFunction1((t0: /* toTables */ js.Array[js.Any]) => movableRowsSendingStop(t0).runNow()))
    if (movableRowsSent != null) __obj.updateDynamic("movableRowsSent")(js.Any.fromFunction3((t0: /* fromRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* toRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t2: /* toTable */ typingsJapgolly.tabulatorTables.Tabulator) => movableRowsSent(t0, t1, t2).runNow()))
    if (movableRowsSentFailed != null) __obj.updateDynamic("movableRowsSentFailed")(js.Any.fromFunction3((t0: /* fromRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* toRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t2: /* toTable */ typingsJapgolly.tabulatorTables.Tabulator) => movableRowsSentFailed(t0, t1, t2).runNow()))
    if (!js.isUndefined(resizableRows)) __obj.updateDynamic("resizableRows")(resizableRows.asInstanceOf[js.Any])
    if (rowAdded != null) __obj.updateDynamic("rowAdded")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowAdded(t0).runNow()))
    if (rowClick != null) __obj.updateDynamic("rowClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowClick(t0, t1).runNow()))
    if (rowContext != null) __obj.updateDynamic("rowContext")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowContext(t0, t1).runNow()))
    if (rowDblClick != null) __obj.updateDynamic("rowDblClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowDblClick(t0, t1).runNow()))
    if (rowDblTap != null) __obj.updateDynamic("rowDblTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowDblTap(t0, t1).runNow()))
    if (rowDeleted != null) __obj.updateDynamic("rowDeleted")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowDeleted(t0).runNow()))
    if (rowDeselected != null) __obj.updateDynamic("rowDeselected")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowDeselected(t0).runNow()))
    if (rowFormatter != null) __obj.updateDynamic("rowFormatter")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowFormatter(t0).runNow()))
    if (rowMouseEnter != null) __obj.updateDynamic("rowMouseEnter")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowMouseEnter(t0, t1).runNow()))
    if (rowMouseLeave != null) __obj.updateDynamic("rowMouseLeave")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowMouseLeave(t0, t1).runNow()))
    if (rowMouseMove != null) __obj.updateDynamic("rowMouseMove")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowMouseMove(t0, t1).runNow()))
    if (rowMouseOut != null) __obj.updateDynamic("rowMouseOut")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowMouseOut(t0, t1).runNow()))
    if (rowMouseOver != null) __obj.updateDynamic("rowMouseOver")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowMouseOver(t0, t1).runNow()))
    if (rowMoved != null) __obj.updateDynamic("rowMoved")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowMoved(t0).runNow()))
    if (rowResized != null) __obj.updateDynamic("rowResized")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowResized(t0).runNow()))
    if (rowSelected != null) __obj.updateDynamic("rowSelected")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowSelected(t0).runNow()))
    if (rowSelectionChanged != null) __obj.updateDynamic("rowSelectionChanged")(js.Any.fromFunction2((t0: /* data */ js.Array[js.Any], t1: /* rows */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.RowComponent]) => rowSelectionChanged(t0, t1).runNow()))
    if (rowTap != null) __obj.updateDynamic("rowTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowTap(t0, t1).runNow()))
    if (rowTapHold != null) __obj.updateDynamic("rowTapHold")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowTapHold(t0, t1).runNow()))
    if (rowUpdated != null) __obj.updateDynamic("rowUpdated")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowUpdated(t0).runNow()))
    if (!js.isUndefined(scrollToRowIfVisible)) __obj.updateDynamic("scrollToRowIfVisible")(scrollToRowIfVisible.asInstanceOf[js.Any])
    if (scrollToRowPosition != null) __obj.updateDynamic("scrollToRowPosition")(scrollToRowPosition.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectableCheck != null) __obj.updateDynamic("selectableCheck")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => selectableCheck(t0).runNow()))
    if (!js.isUndefined(selectablePersistence)) __obj.updateDynamic("selectablePersistence")(selectablePersistence.asInstanceOf[js.Any])
    if (selectableRangeMode != null) __obj.updateDynamic("selectableRangeMode")(selectableRangeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableRollingSelection)) __obj.updateDynamic("selectableRollingSelection")(selectableRollingSelection.asInstanceOf[js.Any])
    if (tabEndNewRow != null) __obj.updateDynamic("tabEndNewRow")(tabEndNewRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsRows]
  }
}

