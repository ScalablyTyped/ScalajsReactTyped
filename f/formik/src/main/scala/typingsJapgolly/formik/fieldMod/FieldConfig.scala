package typingsJapgolly.formik.fieldMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldConfig extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ FieldProps[_], Node]) | Node] = js.undefined
  var component: js.UndefOr[String | (ComponentType[FieldProps[_] | Unit])] = js.undefined
  var innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, Unit]] = js.undefined
  var name: String
  var render: js.UndefOr[js.Function1[/* props */ FieldProps[_], Node]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[js.Function1[/* value */ js.Any, js.UndefOr[String | js.Promise[Unit]]]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object FieldConfig {
  @scala.inline
  def apply(
    name: String,
    children: (js.Function1[/* props */ FieldProps[_], Node]) | Node = null,
    component: String | (ComponentType[FieldProps[_] | Unit]) = null,
    innerRef: /* instance */ js.Any => Callback = null,
    render: /* props */ FieldProps[js.Any] => CallbackTo[Node] = null,
    `type`: String = null,
    validate: /* value */ js.Any => CallbackTo[js.UndefOr[String | js.Promise[Unit]]] = null,
    value: js.Any = null
  ): FieldConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1((t0: /* instance */ js.Any) => innerRef(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.formik.fieldMod.FieldProps[js.Any]) => render(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: /* value */ js.Any) => validate(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldConfig]
  }
}

