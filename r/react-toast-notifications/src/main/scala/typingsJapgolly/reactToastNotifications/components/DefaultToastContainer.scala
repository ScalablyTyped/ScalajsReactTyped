package typingsJapgolly.reactToastNotifications.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactToastNotifications.mod.Placement
import typingsJapgolly.reactToastNotifications.mod.ToastContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultToastContainer {
  def apply(
    hasToasts: Boolean,
    placement: Placement,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ToastContainerProps, 
    typingsJapgolly.reactToastNotifications.mod.DefaultToastContainer, 
    Unit, 
    ToastContainerProps
  ] = {
    val __obj = js.Dynamic.literal(hasToasts = hasToasts.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToastNotifications.mod.ToastContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactToastNotifications.mod.DefaultToastContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToastNotifications.mod.ToastContainerProps])(children: _*)
  }
  @JSImport("react-toast-notifications", "DefaultToastContainer")
  @js.native
  object componentImport extends js.Object
  
}

