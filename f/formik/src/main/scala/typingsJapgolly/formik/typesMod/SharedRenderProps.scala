package typingsJapgolly.formik.typesMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedRenderProps[T] extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ T, Node]] = js.undefined
  var component: js.UndefOr[String | (ComponentType[T | Unit])] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ T, Node]] = js.undefined
}

object SharedRenderProps {
  @scala.inline
  def apply[T](
    children: /* props */ T => CallbackTo[Node] = null,
    component: String | (ComponentType[T | Unit]) = null,
    render: /* props */ T => CallbackTo[Node] = null
  ): SharedRenderProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ T) => children(t0).runNow()))
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ T) => render(t0).runNow()))
    __obj.asInstanceOf[SharedRenderProps[T]]
  }
}

