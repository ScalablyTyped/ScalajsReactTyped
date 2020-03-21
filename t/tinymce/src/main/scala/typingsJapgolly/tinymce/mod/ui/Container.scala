package typingsJapgolly.tinymce.mod.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  def add(items: js.Any): Collection
  def items(): Collection
}

object Container {
  @scala.inline
  def apply(add: js.Any => CallbackTo[Collection], items: CallbackTo[Collection]): Container = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: js.Any) => add(t0).runNow()))
    __obj.updateDynamic("items")(items.toJsFn)
    __obj.asInstanceOf[Container]
  }
}

