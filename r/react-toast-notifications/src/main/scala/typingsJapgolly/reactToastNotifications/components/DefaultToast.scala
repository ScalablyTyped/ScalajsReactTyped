package typingsJapgolly.reactToastNotifications.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactToastNotifications.mod.AppearanceTypes
import typingsJapgolly.reactToastNotifications.mod.Placement
import typingsJapgolly.reactToastNotifications.mod.ToastProps
import typingsJapgolly.reactToastNotifications.mod.TransitionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultToast {
  def apply(
    appearance: AppearanceTypes,
    autoDismiss: Boolean | Double,
    autoDismissTimeout: Double,
    isRunning: Boolean,
    placement: Placement,
    transitionDuration: Double,
    transitionState: TransitionState,
    onDismiss: js.UndefOr[String] => Callback,
    onMouseEnter: Callback,
    onMouseLeave: Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ToastProps, typingsJapgolly.reactToastNotifications.mod.DefaultToast, Unit, ToastProps] = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], autoDismiss = autoDismiss.asInstanceOf[js.Any], autoDismissTimeout = autoDismissTimeout.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionState = transitionState.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: js.UndefOr[java.lang.String]) => onDismiss(t0).runNow()))
    __obj.updateDynamic("onMouseEnter")(onMouseEnter.toJsFn)
    __obj.updateDynamic("onMouseLeave")(onMouseLeave.toJsFn)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToastNotifications.mod.ToastProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactToastNotifications.mod.DefaultToast](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToastNotifications.mod.ToastProps])(children: _*)
  }
  @JSImport("react-toast-notifications", "DefaultToast")
  @js.native
  object componentImport extends js.Object
  
}

