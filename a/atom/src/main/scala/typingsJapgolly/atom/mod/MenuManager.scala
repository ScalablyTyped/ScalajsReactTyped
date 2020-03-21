package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuManager extends js.Object {
  /** Adds the given items to the application menu. */
  def add(items: js.Array[MenuOptions]): Disposable
  /** Refreshes the currently visible menu. */
  def update(): Unit
}

object MenuManager {
  @scala.inline
  def apply(add: js.Array[MenuOptions] => CallbackTo[Disposable], update: Callback): MenuManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.atom.mod.MenuOptions]) => add(t0).runNow()))
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[MenuManager]
  }
}

