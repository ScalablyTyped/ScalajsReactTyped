package typingsJapgolly.reachRect.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reachRect.AnonRect
import typingsJapgolly.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* args */ AnonRect, Node]] = js.undefined
  var observe: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* rect */ DOMRect, Unit]] = js.undefined
}

object RectProps {
  @scala.inline
  def apply(
    children: /* args */ AnonRect => CallbackTo[Node] = null,
    observe: js.UndefOr[Boolean] = js.undefined,
    onChange: /* rect */ DOMRect => Callback = null
  ): RectProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reachRect.AnonRect) => children(t0).runNow()))
    if (!js.isUndefined(observe)) __obj.updateDynamic("observe")(observe.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* rect */ typingsJapgolly.std.DOMRect) => onChange(t0).runNow()))
    __obj.asInstanceOf[RectProps]
  }
}

