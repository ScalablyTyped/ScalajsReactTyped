package typingsJapgolly.jupyterlabLauncher.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabLauncher.mod.ILauncher.IItemOptions
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILauncher_ extends js.Object {
  /**
    * Add a command item to the launcher, and trigger re-render event for parent
    * widget.
    *
    * @param options - The specification options for a launcher item.
    *
    * @returns A disposable that will remove the item from Launcher, and trigger
    * re-render event for parent widget.
    *
    */
  def add(options: IItemOptions): IDisposable
}

object ILauncher_ {
  @scala.inline
  def apply(add: IItemOptions => CallbackTo[IDisposable]): ILauncher_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabLauncher.mod.ILauncher.IItemOptions) => add(t0).runNow()))
    __obj.asInstanceOf[ILauncher_]
  }
}

