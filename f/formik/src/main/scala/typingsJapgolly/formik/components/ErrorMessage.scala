package typingsJapgolly.formik.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.formik.errorMessageMod.ErrorMessageProps
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ErrorMessage {
  def apply(
    name: String,
    className: String = null,
    component: String | ComponentType[js.Object] = null,
    render: /* errorMessage */ String => CallbackTo[Node] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* errorMessage */ String => CallbackTo[Node] = null
  ): UnmountedWithRoot[ErrorMessageProps, typingsJapgolly.formik.mod.ErrorMessage, Unit, ErrorMessageProps] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* errorMessage */ java.lang.String) => children(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* errorMessage */ java.lang.String) => render(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.formik.errorMessageMod.ErrorMessageProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.formik.mod.ErrorMessage](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.formik.errorMessageMod.ErrorMessageProps])
  }
  @JSImport("formik", "ErrorMessage")
  @js.native
  object componentImport extends js.Object
  
}

