package typingsJapgolly.uiGrid.mod.cellNav

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.uiGrid.AnonNavigate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellNavApi[TEntity] extends js.Object {
  // Events
  var on: AnonNavigate[TEntity]
  // Methods
  /**
    * Gets the currently selected rows and columns.  array is empty if no selection has occurred
    * @returns {Array<IRowCol>} an array containing the current selection
    */
  def getCurrentSelection(): js.Array[IRowCol[TEntity]]
  /**
    * Gets the current focused cell.  value is null if no selection has occurred
    * @returns {IRowCol} the current (or last if Grid does not have focus) focused row and column
    */
  def getFocusedCell(): IRowCol[TEntity]
  /**
    * Gets the index of the passed rowCol.  Returns -1 if the RowCol isn't selected
    * @param rowCol
    * @returns the index in the order in which the RowCol was selected
    */
  def rowColSelectIndex(rowCol: IRowCol[TEntity]): Double
  /**
    * Brings the specified row and column into view, and sets focus to that cell
    * @param {TEntity} rowEntity gridOptions.data[] array instance to make visible and set focus
    * @param {IColumnDef} colDef Column definition to make visible and set focus
    */
  def scrollToFocus(rowEntity: TEntity, colDef: IColumnDef): IPromise[_]
}

object ICellNavApi {
  @scala.inline
  def apply[TEntity](
    getCurrentSelection: CallbackTo[js.Array[IRowCol[TEntity]]],
    getFocusedCell: CallbackTo[IRowCol[TEntity]],
    on: AnonNavigate[TEntity],
    rowColSelectIndex: IRowCol[TEntity] => CallbackTo[Double],
    scrollToFocus: (TEntity, IColumnDef) => CallbackTo[IPromise[js.Any]]
  ): ICellNavApi[TEntity] = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.updateDynamic("getCurrentSelection")(getCurrentSelection.toJsFn)
    __obj.updateDynamic("getFocusedCell")(getFocusedCell.toJsFn)
    __obj.updateDynamic("rowColSelectIndex")(js.Any.fromFunction1((t0: typingsJapgolly.uiGrid.mod.cellNav.IRowCol[TEntity]) => rowColSelectIndex(t0).runNow()))
    __obj.updateDynamic("scrollToFocus")(js.Any.fromFunction2((t0: TEntity, t1: typingsJapgolly.uiGrid.mod.cellNav.IColumnDef) => scrollToFocus(t0, t1).runNow()))
    __obj.asInstanceOf[ICellNavApi[TEntity]]
  }
}

