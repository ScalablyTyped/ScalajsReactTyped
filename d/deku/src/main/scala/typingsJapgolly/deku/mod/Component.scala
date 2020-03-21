package typingsJapgolly.deku.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends js.Object {
  var onCreate: js.UndefOr[js.Function1[/* model */ Model, _]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* model */ Model, _]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* model */ Model, _]] = js.undefined
  def render(model: Model): VirtualElement
}

object Component {
  @scala.inline
  def apply(
    render: Model => CallbackTo[VirtualElement],
    onCreate: /* model */ Model => CallbackTo[js.Any] = null,
    onRemove: /* model */ Model => CallbackTo[js.Any] = null,
    onUpdate: /* model */ Model => CallbackTo[js.Any] = null
  ): Component = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.deku.mod.Model) => render(t0).runNow()))
    if (onCreate != null) __obj.updateDynamic("onCreate")(js.Any.fromFunction1((t0: /* model */ typingsJapgolly.deku.mod.Model) => onCreate(t0).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* model */ typingsJapgolly.deku.mod.Model) => onRemove(t0).runNow()))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* model */ typingsJapgolly.deku.mod.Model) => onUpdate(t0).runNow()))
    __obj.asInstanceOf[Component]
  }
}

