package typingsJapgolly.uiGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.treeBase.rowCollapsedHandler
import typingsJapgolly.uiGrid.mod.treeBase.rowExpandedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowCollapsed[TEntity] extends js.Object {
  /**
    * Raised when a row is collapsed.  Doesn't really have a purpose at the moment.  Included for symmetry
    * @param {ng.IScope} scope Grid scope
    * @param {rowCollapsedHandler} handler Callback
    */
  def rowCollapsed(scope: IScope, handler: rowCollapsedHandler[TEntity]): Unit
  /**
    * Raised whenever a row is expanded.
    *
    * If you are dynamically rendering your tree,
    * in your callback you can retrieve the children of this row and load them into the grid data.
    *
    * When the data is loaded, the grid will automatically refresh to show these new rows.
    * @param {ng.IScope} scope Grid Scope
    * @param {rowExpandedHandler} handler Callback
    */
  def rowExpanded(scope: IScope, handler: rowExpandedHandler[TEntity]): Unit
}

object AnonRowCollapsed {
  @scala.inline
  def apply[TEntity](
    rowCollapsed: (IScope, rowCollapsedHandler[TEntity]) => Callback,
    rowExpanded: (IScope, rowExpandedHandler[TEntity]) => Callback
  ): AnonRowCollapsed[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rowCollapsed")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.treeBase.rowCollapsedHandler[TEntity]) => rowCollapsed(t0, t1).runNow()))
    __obj.updateDynamic("rowExpanded")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.treeBase.rowExpandedHandler[TEntity]) => rowExpanded(t0, t1).runNow()))
    __obj.asInstanceOf[AnonRowCollapsed[TEntity]]
  }
}

