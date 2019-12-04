package typingsJapgolly.reactDashNavigation.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNavigation.Anon_Value
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigationProvider {
  def apply(
    value: NavigationProp[_],
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    Anon_Value, 
    typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationProvider, 
    Unit, 
    Anon_Value
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigation.Anon_Value, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigation.Anon_Value])(children: _*)
  }
  @JSImport("react-navigation", "NavigationProvider")
  @js.native
  object componentImport extends js.Object
  
}

