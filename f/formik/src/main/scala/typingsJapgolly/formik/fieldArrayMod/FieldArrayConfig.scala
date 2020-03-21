package typingsJapgolly.formik.fieldArrayMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  name  :string,   validateOnChange ? :boolean} & formik.formik/dist/types.SharedRenderProps<formik.formik/dist/FieldArray.FieldArrayRenderProps> */
trait FieldArrayConfig extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ FieldArrayRenderProps, Node]] = js.undefined
  var component: js.UndefOr[String | (ComponentType[FieldArrayRenderProps | Unit])] = js.undefined
  var name: String
  var render: js.UndefOr[js.Function1[/* props */ FieldArrayRenderProps, Node]] = js.undefined
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
}

object FieldArrayConfig {
  @scala.inline
  def apply(
    name: String,
    children: /* props */ FieldArrayRenderProps => CallbackTo[Node] = null,
    component: String | (ComponentType[FieldArrayRenderProps | Unit]) = null,
    render: /* props */ FieldArrayRenderProps => CallbackTo[Node] = null,
    validateOnChange: js.UndefOr[Boolean] = js.undefined
  ): FieldArrayConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.formik.fieldArrayMod.FieldArrayRenderProps) => children(t0).runNow()))
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.formik.fieldArrayMod.FieldArrayRenderProps) => render(t0).runNow()))
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldArrayConfig]
  }
}

