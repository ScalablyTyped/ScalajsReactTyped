package typingsJapgolly.uiGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.moveColumns.columnPositionChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnPositionChanged extends js.Object {
  /**
    * Raised when a column is moved
    * @param {ng.IScope} scope Grid Scope
    * @param {columnPositionChangedHandler} handler Callback Function
    */
  var columnPositionChanged: js.UndefOr[
    js.Function2[/* scope */ IScope, /* handler */ columnPositionChangedHandler, Unit]
  ] = js.undefined
}

object AnonColumnPositionChanged {
  @scala.inline
  def apply(
    columnPositionChanged: (/* scope */ IScope, /* handler */ columnPositionChangedHandler) => Callback = null
  ): AnonColumnPositionChanged = {
    val __obj = js.Dynamic.literal()
    if (columnPositionChanged != null) __obj.updateDynamic("columnPositionChanged")(js.Any.fromFunction2((t0: /* scope */ typingsJapgolly.angular.mod.IScope, t1: /* handler */ typingsJapgolly.uiGrid.mod.moveColumns.columnPositionChangedHandler) => columnPositionChanged(t0, t1).runNow()))
    __obj.asInstanceOf[AnonColumnPositionChanged]
  }
}

