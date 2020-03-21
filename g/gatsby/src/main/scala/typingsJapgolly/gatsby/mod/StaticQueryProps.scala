package typingsJapgolly.gatsby.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticQueryProps[T] extends js.Object {
  var children: js.UndefOr[RenderCallback[T]] = js.undefined
  var query: js.Any
  var render: js.UndefOr[RenderCallback[T]] = js.undefined
}

object StaticQueryProps {
  @scala.inline
  def apply[T](
    query: js.Any,
    children: T => CallbackTo[japgolly.scalajs.react.raw.React.Node] = null,
    render: T => CallbackTo[japgolly.scalajs.react.raw.React.Node] = null
  ): StaticQueryProps[T] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: T) => children(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: T) => render(t0).runNow()))
    __obj.asInstanceOf[StaticQueryProps[T]]
  }
}

