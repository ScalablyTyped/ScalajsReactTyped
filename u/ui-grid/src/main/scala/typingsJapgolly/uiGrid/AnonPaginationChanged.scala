package typingsJapgolly.uiGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.pagination.paginationChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPaginationChanged extends js.Object {
  /**
    * This event fires when the pageSize or currentPage changes
    * @param {ng.IScope} scope The grid scope
    * @param {paginationChangedHandler} handler Callback
    */
  def paginationChanged(scope: IScope, handler: paginationChangedHandler): Unit
}

object AnonPaginationChanged {
  @scala.inline
  def apply(paginationChanged: (IScope, paginationChangedHandler) => Callback): AnonPaginationChanged = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("paginationChanged")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.pagination.paginationChangedHandler) => paginationChanged(t0, t1).runNow()))
    __obj.asInstanceOf[AnonPaginationChanged]
  }
}

