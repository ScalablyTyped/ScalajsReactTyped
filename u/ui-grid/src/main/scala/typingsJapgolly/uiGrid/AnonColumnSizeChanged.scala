package typingsJapgolly.uiGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.resizeColumns.columnSizeChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnSizeChanged extends js.Object {
  /**
    * Raised when column is resized
    * @param {ng.IScope} scope Grid Scope
    * @param {columnSizeChangedHandler} handler Callback
    */
  def columnSizeChanged(scope: IScope, handler: columnSizeChangedHandler): Unit
}

object AnonColumnSizeChanged {
  @scala.inline
  def apply(columnSizeChanged: (IScope, columnSizeChangedHandler) => Callback): AnonColumnSizeChanged = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnSizeChanged")(js.Any.fromFunction2((t0: typingsJapgolly.angular.mod.IScope, t1: typingsJapgolly.uiGrid.mod.resizeColumns.columnSizeChangedHandler) => columnSizeChanged(t0, t1).runNow()))
    __obj.asInstanceOf[AnonColumnSizeChanged]
  }
}

