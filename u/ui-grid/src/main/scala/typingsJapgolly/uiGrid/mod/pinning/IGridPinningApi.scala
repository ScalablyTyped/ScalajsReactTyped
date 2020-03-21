package typingsJapgolly.uiGrid.mod.pinning

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.IGridColumnOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridPinningApi[TEntity] extends js.Object {
  // Events
  /**
    * raised when column pin state has changed
    * @param {ng.IScope} scope The grid scope
    * @param {columnPinHandler} handler Callback
    */
  def columnPin(scope: IScope, handler: columnPinHandler): Unit
  // Methods
  /**
    * Pin column left, right, or none
    * @param {IGridColumn} col The column being pinned
    * @param {string} container One of the recognized container types from uiGridPinningConstants
    */
  def pinColumn(col: IGridColumnOf[TEntity], container: String): Unit
}

object IGridPinningApi {
  @scala.inline
  def apply[TEntity](
    columnPin: (IScope, columnPinHandler) => Callback,
    pinColumn: (IGridColumnOf[TEntity], String) => Callback
  ): IGridPinningApi[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnPin")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.pinning.columnPinHandler) => columnPin(t0, t1).runNow()))
    __obj.updateDynamic("pinColumn")(js.Any.fromFunction2((t0: typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity], t1: java.lang.String) => pinColumn(t0, t1).runNow()))
    __obj.asInstanceOf[IGridPinningApi[TEntity]]
  }
}

