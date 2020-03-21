package typingsJapgolly.formik.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.formik.fieldArrayMod.FieldArrayConfig
import typingsJapgolly.formik.fieldArrayMod.FieldArrayRenderProps
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FieldArray {
  def apply(
    name: String,
    component: String | (ComponentType[FieldArrayRenderProps | Unit]) = null,
    render: /* props */ FieldArrayRenderProps => CallbackTo[Node] = null,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* props */ FieldArrayRenderProps => CallbackTo[Node] = null
  ): UnmountedWithRoot[FieldArrayConfig, typingsJapgolly.formik.mod.FieldArray, Unit, FieldArrayConfig] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.formik.fieldArrayMod.FieldArrayRenderProps) => children(t0).runNow()))
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.formik.fieldArrayMod.FieldArrayRenderProps) => render(t0).runNow()))
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.formik.fieldArrayMod.FieldArrayConfig, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.formik.mod.FieldArray](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.formik.fieldArrayMod.FieldArrayConfig])
  }
  @JSImport("formik", "FieldArray")
  @js.native
  object componentImport extends js.Object
  
}

