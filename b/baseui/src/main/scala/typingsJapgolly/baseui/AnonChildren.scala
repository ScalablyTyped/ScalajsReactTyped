package typingsJapgolly.baseui

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren[T] extends js.Object {
  var children: js.UndefOr[js.Function1[/* args */ T, Node]] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply[T](children: /* args */ T => CallbackTo[Node] = null): AnonChildren[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* args */ T) => children(t0).runNow()))
    __obj.asInstanceOf[AnonChildren[T]]
  }
}

