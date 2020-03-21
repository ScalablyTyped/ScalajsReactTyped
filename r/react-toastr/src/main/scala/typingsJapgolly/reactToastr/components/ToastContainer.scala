package typingsJapgolly.reactToastr.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactToastr.AnonClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToastContainer {
  def apply(
    toastMessageFactory: js.Any,
    className: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonClassName, typingsJapgolly.reactToastr.mod.ToastContainer, Unit, AnonClassName] = {
    val __obj = js.Dynamic.literal(toastMessageFactory = toastMessageFactory.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToastr.AnonClassName, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactToastr.mod.ToastContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToastr.AnonClassName])(children: _*)
  }
  @JSImport("react-toastr", "ToastContainer")
  @js.native
  object componentImport extends js.Object
  
}

