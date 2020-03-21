package typingsJapgolly.formik.errorMessageMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorMessageProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* errorMessage */ String, Node]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[String | ComponentType[js.Object]] = js.undefined
  var name: String
  var render: js.UndefOr[js.Function1[/* errorMessage */ String, Node]] = js.undefined
}

object ErrorMessageProps {
  @scala.inline
  def apply(
    name: String,
    children: /* errorMessage */ String => CallbackTo[Node] = null,
    className: String = null,
    component: String | ComponentType[js.Object] = null,
    render: /* errorMessage */ String => CallbackTo[Node] = null
  ): ErrorMessageProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* errorMessage */ java.lang.String) => children(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* errorMessage */ java.lang.String) => render(t0).runNow()))
    __obj.asInstanceOf[ErrorMessageProps]
  }
}

