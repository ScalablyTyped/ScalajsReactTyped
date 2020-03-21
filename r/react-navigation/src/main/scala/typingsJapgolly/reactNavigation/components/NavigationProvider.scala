package typingsJapgolly.reactNavigation.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNavigation.AnonValue
import typingsJapgolly.reactNavigation.mod.NavigationProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigationProvider {
  def apply(
    value: NavigationProp[_],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonValue, typingsJapgolly.reactNavigation.mod.NavigationProvider, Unit, AnonValue] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigation.AnonValue, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigation.mod.NavigationProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigation.AnonValue])(children: _*)
  }
  @JSImport("react-navigation", "NavigationProvider")
  @js.native
  object componentImport extends js.Object
  
}

