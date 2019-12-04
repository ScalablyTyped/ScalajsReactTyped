package typingsJapgolly.reactDashRouterDashDom.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.historyMod.Location
import typingsJapgolly.history.historyMod.LocationState
import typingsJapgolly.reactDashRouter.reactDashRouterMod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Switch {
  def apply(
    location: Location[LocationState] = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SwitchProps, 
    typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomMod.Switch, 
    Unit, 
    SwitchProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashRouter.reactDashRouterMod.SwitchProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomMod.Switch](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashRouter.reactDashRouterMod.SwitchProps])(children: _*)
  }
  @JSImport("react-router-dom", "Switch")
  @js.native
  object componentImport extends js.Object
  
}

