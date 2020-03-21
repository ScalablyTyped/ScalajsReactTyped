package typingsJapgolly.uiGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.expandable.rowExpandedStateChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowExpandedStateChanged[TEntity] extends js.Object {
  /**
    * raised when cell editing is complete
    * @param {ng.IScope} scope
    * @param {rowExpandedStateChangedHandler} handler
    */
  def rowExpandedStateChanged(scope: IScope, handler: rowExpandedStateChangedHandler[TEntity]): Unit
}

object AnonRowExpandedStateChanged {
  @scala.inline
  def apply[TEntity](rowExpandedStateChanged: (IScope, rowExpandedStateChangedHandler[TEntity]) => Callback): AnonRowExpandedStateChanged[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rowExpandedStateChanged")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.expandable.rowExpandedStateChangedHandler[TEntity]) => rowExpandedStateChanged(t0, t1).runNow()))
    __obj.asInstanceOf[AnonRowExpandedStateChanged[TEntity]]
  }
}

