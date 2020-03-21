package typingsJapgolly.uiGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.edit.afterCellEditHandler
import typingsJapgolly.uiGrid.mod.edit.beginCellEditHandler
import typingsJapgolly.uiGrid.mod.edit.cancelCellEditHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterCellEdit[TEntity] extends js.Object {
  /**
    * raised when cell editing is complete
    * @param scope The grid scope
    * @param {afterCellEditHandler} handler Callback
    */
  def afterCellEdit(scope: IScope, handler: afterCellEditHandler[TEntity]): Unit
  /**
    * raised when cell editing starts on a cell
    * @param scope The grid scope
    * @param {beginCellEditHandler} handler Callback
    */
  def beginCellEdit(scope: IScope, handler: beginCellEditHandler[TEntity]): Unit
  /**
    * raised when cell editing is cancelled on a cell
    * @param scope The grid scope
    * @param {cancelCellEditHandler} handler Callback
    */
  def cancelCellEdit(scope: IScope, handler: cancelCellEditHandler[TEntity]): Unit
}

object AnonAfterCellEdit {
  @scala.inline
  def apply[TEntity](
    afterCellEdit: (IScope, afterCellEditHandler[TEntity]) => Callback,
    beginCellEdit: (IScope, beginCellEditHandler[TEntity]) => Callback,
    cancelCellEdit: (IScope, cancelCellEditHandler[TEntity]) => Callback
  ): AnonAfterCellEdit[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterCellEdit")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.edit.afterCellEditHandler[TEntity]) => afterCellEdit(t0, t1).runNow()))
    __obj.updateDynamic("beginCellEdit")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.edit.beginCellEditHandler[TEntity]) => beginCellEdit(t0, t1).runNow()))
    __obj.updateDynamic("cancelCellEdit")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.edit.cancelCellEditHandler[TEntity]) => cancelCellEdit(t0, t1).runNow()))
    __obj.asInstanceOf[AnonAfterCellEdit[TEntity]]
  }
}

