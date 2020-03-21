package typingsJapgolly.uiGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.selection.rowSelectionChangedBatchHandler
import typingsJapgolly.uiGrid.mod.selection.rowSelectionChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowSelectionChanged[TEntity] extends js.Object {
  /**
    * is raised after the row.isSelected state is changed
    * @param {ng.IScope} scope grid scope
    * @param {rowSelectionChangedHandler} handler callback
    */
  def rowSelectionChanged(scope: IScope, handler: rowSelectionChangedHandler[TEntity]): Unit
  /**
    * is raised after the row.isSelected state is changed in bulk,
    * if the enableSelectionBatchEvent option is set to true (which it is by default).
    * This allows more efficient processing of bulk events.
    * @param {ng.IScope} scope grid scope
    * @param {rowSelectionChangedBatchHandler} handler callback
    */
  def rowSelectionChangedBatch(scope: IScope, handler: rowSelectionChangedBatchHandler[TEntity]): Unit
}

object AnonRowSelectionChanged {
  @scala.inline
  def apply[TEntity](
    rowSelectionChanged: (IScope, rowSelectionChangedHandler[TEntity]) => Callback,
    rowSelectionChangedBatch: (IScope, rowSelectionChangedBatchHandler[TEntity]) => Callback
  ): AnonRowSelectionChanged[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rowSelectionChanged")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.selection.rowSelectionChangedHandler[TEntity]) => rowSelectionChanged(t0, t1).runNow()))
    __obj.updateDynamic("rowSelectionChangedBatch")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.selection.rowSelectionChangedBatchHandler[TEntity]) => rowSelectionChangedBatch(t0, t1).runNow()))
    __obj.asInstanceOf[AnonRowSelectionChanged[TEntity]]
  }
}

