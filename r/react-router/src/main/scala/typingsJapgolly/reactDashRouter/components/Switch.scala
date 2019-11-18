package typingsJapgolly.reactDashRouter.components

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
    typingsJapgolly.reactDashRouter.reactDashRouterMod.Switch, 
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
  typingsJapgolly.reactDashRouter.reactDashRouterMod.Switch](js.constructorOf[typingsJapgolly.reactDashRouter.reactDashRouterMod.Switch])
    f(__obj.asInstanceOf[typingsJapgolly.reactDashRouter.reactDashRouterMod.SwitchProps])(children: _*)
  }
}

