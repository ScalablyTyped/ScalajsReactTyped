package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnComponent extends _ColumnLookup {
  /** The delete function deletes the column, removing it from the table*/
  def delete(): js.Promise[Unit]
  /** The getCells function returns an array of CellComponent objects, one for each cell in the column.*/
  def getCells(): js.Array[CellComponent]
  /** The getDefinition function returns the column definition object for the column.*/
  def getDefinition(): ColumnDefinition
  /*The getElement function returns the DOM node for the colum*/
  def getElement(): HTMLElement
  /** The getField function returns the field name for the column.*/
  def getField(): String
  /** The getNextColumn function returns the Column Component for the next visible column in the table, if there is no next column it will return a value of false. */
  def getNextColumn(): ColumnComponent | `false`
  /** The getParentColumn function returns the ColumnComponent for the parent column of this column. if no parent exists, this function will return false */
  def getParentColumn(): ColumnComponent | `false`
  /** The getPrevColumn function returns the Column Component for the previous visible column in the table, if there is no previous column it will return a value of false. */
  def getPrevColumn(): ColumnComponent | `false`
  /** The getSubColumns function returns an array of ColumnComponent objects, one for each sub column of this column. */
  def getSubColumns(): js.Array[ColumnComponent]
  /** The getTable function returns the Tabulator object for the table containing the column */
  def getTable(): typingsJapgolly.tabulatorTables.Tabulator
  /** The getVisibility function returns a boolean to show if the column is visible, a value of true means it is visible.*/
  def getVisibility(): Boolean
  /** The headerFilterFocus function will place focus on the header filter element for this column if it exists. */
  def headerFilterFocus(): Unit
  /** The hide function hides the column if it is visible.*/
  def hide(): Unit
  /**You can move a column component next to another column using the move function */
  def move(toColumn: ColumnLookup, after: Boolean): Unit
  /** The reloadHeaderFilter function rebuilds the header filter element, updating any params passed into the editor used to generate the filter. */
  def reloadHeaderFilter(): Unit
  /** The scrollTo function will scroll the table to the column if it is visible. */
  def scrollTo(): js.Promise[Unit]
  /** The setHeaderFilterValue function set the value of the columns header filter element to the value provided in the first argument. */
  def setHeaderFilterValue(value: js.Any): Unit
  /** The show function shows the column if it is hidden.*/
  def show(): Unit
  /** The toggle function toggles the visibility of the column, switching between hidden and visible.*/
  def toggle(): Unit
  /** Update the definition of a column */
  def updateDefinition(definition: ColumnDefinition): js.Promise[Unit]
}

object ColumnComponent {
  @scala.inline
  def apply(
    delete: CallbackTo[js.Promise[Unit]],
    getCells: CallbackTo[js.Array[CellComponent]],
    getDefinition: CallbackTo[ColumnDefinition],
    getElement: CallbackTo[HTMLElement],
    getField: CallbackTo[String],
    getNextColumn: CallbackTo[ColumnComponent | `false`],
    getParentColumn: CallbackTo[ColumnComponent | `false`],
    getPrevColumn: CallbackTo[ColumnComponent | `false`],
    getSubColumns: CallbackTo[js.Array[ColumnComponent]],
    getTable: CallbackTo[typingsJapgolly.tabulatorTables.Tabulator],
    getVisibility: CallbackTo[Boolean],
    headerFilterFocus: Callback,
    hide: Callback,
    move: (ColumnLookup, Boolean) => Callback,
    reloadHeaderFilter: Callback,
    scrollTo: CallbackTo[js.Promise[Unit]],
    setHeaderFilterValue: js.Any => Callback,
    show: Callback,
    toggle: Callback,
    updateDefinition: ColumnDefinition => CallbackTo[js.Promise[Unit]]
  ): ColumnComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("getCells")(getCells.toJsFn)
    __obj.updateDynamic("getDefinition")(getDefinition.toJsFn)
    __obj.updateDynamic("getElement")(getElement.toJsFn)
    __obj.updateDynamic("getField")(getField.toJsFn)
    __obj.updateDynamic("getNextColumn")(getNextColumn.toJsFn)
    __obj.updateDynamic("getParentColumn")(getParentColumn.toJsFn)
    __obj.updateDynamic("getPrevColumn")(getPrevColumn.toJsFn)
    __obj.updateDynamic("getSubColumns")(getSubColumns.toJsFn)
    __obj.updateDynamic("getTable")(getTable.toJsFn)
    __obj.updateDynamic("getVisibility")(getVisibility.toJsFn)
    __obj.updateDynamic("headerFilterFocus")(headerFilterFocus.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("move")(js.Any.fromFunction2((t0: typingsJapgolly.tabulatorTables.Tabulator.ColumnLookup, t1: scala.Boolean) => move(t0, t1).runNow()))
    __obj.updateDynamic("reloadHeaderFilter")(reloadHeaderFilter.toJsFn)
    __obj.updateDynamic("scrollTo")(scrollTo.toJsFn)
    __obj.updateDynamic("setHeaderFilterValue")(js.Any.fromFunction1((t0: js.Any) => setHeaderFilterValue(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.updateDynamic("updateDefinition")(js.Any.fromFunction1((t0: typingsJapgolly.tabulatorTables.Tabulator.ColumnDefinition) => updateDefinition(t0).runNow()))
    __obj.asInstanceOf[ColumnComponent]
  }
}

