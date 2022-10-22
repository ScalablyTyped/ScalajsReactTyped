package typingsJapgolly.reactToastNotifications.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactToastNotifications.mod.AppearanceTypes
import typingsJapgolly.reactToastNotifications.mod.Placement
import typingsJapgolly.reactToastNotifications.mod.ToastProps
import typingsJapgolly.reactToastNotifications.mod.TransitionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultToast {
  
  inline def apply(
    appearance: AppearanceTypes,
    autoDismiss: Boolean | Double,
    autoDismissTimeout: Double,
    isRunning: Boolean,
    onDismiss: js.UndefOr[String] => Callback,
    onMouseEnter: Callback,
    onMouseLeave: Callback,
    placement: Placement,
    transitionDuration: Double,
    transitionState: TransitionState
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], autoDismiss = autoDismiss.asInstanceOf[js.Any], autoDismissTimeout = autoDismissTimeout.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction1((t0: js.UndefOr[String]) => onDismiss(t0).runNow()), onMouseEnter = onMouseEnter.toJsFn, onMouseLeave = onMouseLeave.toJsFn, placement = placement.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionState = transitionState.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ToastProps]))
  }
  
  @JSImport("react-toast-notifications", "DefaultToast")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ToastProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
