package typingsJapgolly.jupyterlabStatusbar.tokensMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabStatusbar.tokensMod.IStatusBar.IItem
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatusBar_ extends js.Object {
  /**
    * Register a new status item.
    *
    * @param id - a unique id for the status item.
    *
    * @param options - The options for how to add the status item.
    *
    * @returns an `IDisposable` that can be disposed to remove the item.
    */
  def registerStatusItem(id: String, statusItem: IItem): IDisposable
}

object IStatusBar_ {
  @scala.inline
  def apply(registerStatusItem: (String, IItem) => CallbackTo[IDisposable]): IStatusBar_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerStatusItem")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.jupyterlabStatusbar.tokensMod.IStatusBar.IItem) => registerStatusItem(t0, t1).runNow()))
    __obj.asInstanceOf[IStatusBar_]
  }
}

