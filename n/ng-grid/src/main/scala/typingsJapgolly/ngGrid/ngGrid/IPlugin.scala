package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlugin extends js.Object {
  def init(childScope: IGridScope, gridInstance: IGridInstance, services: js.Any): Unit
}

object IPlugin {
  @scala.inline
  def apply(init: (IGridScope, IGridInstance, js.Any) => Callback): IPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(js.Any.fromFunction3((t0: typingsJapgolly.ngGrid.ngGrid.IGridScope, t1: typingsJapgolly.ngGrid.ngGrid.IGridInstance, t2: js.Any) => init(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IPlugin]
  }
}

