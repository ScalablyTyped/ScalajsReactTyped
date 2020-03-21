package typingsJapgolly.reactToastNotifications.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactToastNotifications.AnonToast
import typingsJapgolly.reactToastNotifications.mod.Placement
import typingsJapgolly.reactToastNotifications.mod.ToastProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToastProvider {
  def apply(
    autoDismiss: Boolean | Double = null,
    autoDismissTimeout: Int | Double = null,
    components: AnonToast = null,
    placement: Placement = null,
    transitionDuration: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ToastProviderProps, 
    typingsJapgolly.reactToastNotifications.mod.ToastProvider, 
    Unit, 
    ToastProviderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (autoDismiss != null) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (autoDismissTimeout != null) __obj.updateDynamic("autoDismissTimeout")(autoDismissTimeout.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToastNotifications.mod.ToastProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactToastNotifications.mod.ToastProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToastNotifications.mod.ToastProviderProps])(children: _*)
  }
  @JSImport("react-toast-notifications", "ToastProvider")
  @js.native
  object componentImport extends js.Object
  
}

