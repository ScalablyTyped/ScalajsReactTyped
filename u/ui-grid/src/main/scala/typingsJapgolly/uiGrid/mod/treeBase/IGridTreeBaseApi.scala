package typingsJapgolly.uiGrid.mod.treeBase

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.uiGrid.AnonRowCollapsed
import typingsJapgolly.uiGrid.mod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridTreeBaseApi[TEntity] extends js.Object {
  // Events
  var on: AnonRowCollapsed[TEntity]
  // Methods
  /**
    * Collapse all tree rows
    */
  def collapseAllRows(): Unit
  /**
    * collapse the specified row. When you expand the row again, all grandchildren will retain their state
    * @param {IGridRow} row The row to collapse
    */
  def collapseRow(row: IGridRowOf[TEntity]): Unit
  /**
    * collapse all children of the specified row. When you expand the row again, all grandchildren will be
    * collapsed
    * @param {IGridRow} row The row to collapse children of
    */
  def collapseRowChildren(row: IGridRowOf[TEntity]): Unit
  /**
    * Expands all tree rows
    */
  def expandAllRows(): Unit
  /**
    * Expand the immediate children of the specified row
    * @param {IGridRow} row The row to expand
    */
  def expandRow(row: IGridRowOf[TEntity]): Unit
  /**
    * Get the children of the specified row
    * @param {IGridRow} row The row you want the children of
    * @returns Array<IGridRow> Array of children rows
    */
  def getRowChildren(row: IGridRowOf[TEntity]): js.Array[IGridRowOf[TEntity]]
  /**
    * Get the tree state for this grid, used by the saveState feature Returned treeState as an object
    * ```{ expandedState: { uid: 'expanded', uid: 'collapsed' } }```
    * where expandedState is a hash of row uid and the current expanded state
    * @returns {ITreeState} tree state
    * NOTE this is an incomplete feature in uiGrid
    */
  def getTreeState(): ITreeState
  /**
    * Set the expanded states of the tree
    * @param {ITreeState} config The config you want to apply, in the format provided by getTreeState
    */
  def setTreeState(config: ITreeState): Unit
  /**
    * call expand if row is collapsed, and collapse if it is expanded
    * @param {IGridRow} row The row to toggle
    */
  def toggleRowTreeState(row: IGridRowOf[TEntity]): Unit
}

object IGridTreeBaseApi {
  @scala.inline
  def apply[TEntity](
    collapseAllRows: Callback,
    collapseRow: IGridRowOf[TEntity] => Callback,
    collapseRowChildren: IGridRowOf[TEntity] => Callback,
    expandAllRows: Callback,
    expandRow: IGridRowOf[TEntity] => Callback,
    getRowChildren: IGridRowOf[TEntity] => CallbackTo[js.Array[IGridRowOf[TEntity]]],
    getTreeState: CallbackTo[ITreeState],
    on: AnonRowCollapsed[TEntity],
    setTreeState: ITreeState => Callback,
    toggleRowTreeState: IGridRowOf[TEntity] => Callback
  ): IGridTreeBaseApi[TEntity] = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.updateDynamic("collapseAllRows")(collapseAllRows.toJsFn)
    __obj.updateDynamic("collapseRow")(js.Any.fromFunction1((t0: typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity]) => collapseRow(t0).runNow()))
    __obj.updateDynamic("collapseRowChildren")(js.Any.fromFunction1((t0: typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity]) => collapseRowChildren(t0).runNow()))
    __obj.updateDynamic("expandAllRows")(expandAllRows.toJsFn)
    __obj.updateDynamic("expandRow")(js.Any.fromFunction1((t0: typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity]) => expandRow(t0).runNow()))
    __obj.updateDynamic("getRowChildren")(js.Any.fromFunction1((t0: typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity]) => getRowChildren(t0).runNow()))
    __obj.updateDynamic("getTreeState")(getTreeState.toJsFn)
    __obj.updateDynamic("setTreeState")(js.Any.fromFunction1((t0: typingsJapgolly.uiGrid.mod.treeBase.ITreeState) => setTreeState(t0).runNow()))
    __obj.updateDynamic("toggleRowTreeState")(js.Any.fromFunction1((t0: typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity]) => toggleRowTreeState(t0).runNow()))
    __obj.asInstanceOf[IGridTreeBaseApi[TEntity]]
  }
}

