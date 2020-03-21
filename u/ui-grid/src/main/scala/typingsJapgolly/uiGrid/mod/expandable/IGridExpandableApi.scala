package typingsJapgolly.uiGrid.mod.expandable

import japgolly.scalajs.react.Callback
import typingsJapgolly.uiGrid.AnonRowExpandedStateChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridExpandableApi[TEntity] extends js.Object {
  // Events
  var on: AnonRowExpandedStateChanged[TEntity]
  // Methods
  /**
    * Collapse all subgrids.
    */
  def collapseAllRows(): Unit
  /**
    * expand all subgrids
    */
  def expandAllRows(): Unit
  /**
    * Toggle all subgrids
    */
  def toggleAllRows(): Unit
  /**
    * Toggle a specific row
    * @param {TEntity} rowEntity The data entity for the row you want to expand
    */
  def toggleRowExpansion(rowEntity: TEntity): Unit
}

object IGridExpandableApi {
  @scala.inline
  def apply[TEntity](
    collapseAllRows: Callback,
    expandAllRows: Callback,
    on: AnonRowExpandedStateChanged[TEntity],
    toggleAllRows: Callback,
    toggleRowExpansion: TEntity => Callback
  ): IGridExpandableApi[TEntity] = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.updateDynamic("collapseAllRows")(collapseAllRows.toJsFn)
    __obj.updateDynamic("expandAllRows")(expandAllRows.toJsFn)
    __obj.updateDynamic("toggleAllRows")(toggleAllRows.toJsFn)
    __obj.updateDynamic("toggleRowExpansion")(js.Any.fromFunction1((t0: TEntity) => toggleRowExpansion(t0).runNow()))
    __obj.asInstanceOf[IGridExpandableApi[TEntity]]
  }
}

