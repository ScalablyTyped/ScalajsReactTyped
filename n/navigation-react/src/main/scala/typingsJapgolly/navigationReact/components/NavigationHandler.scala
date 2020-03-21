package typingsJapgolly.navigationReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.navigation.mod.StateNavigator
import typingsJapgolly.navigationReact.AnonStateNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigationHandler {
  def apply(
    stateNavigator: StateNavigator,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AnonStateNavigator, 
    typingsJapgolly.navigationReact.mod.NavigationHandler, 
    Unit, 
    AnonStateNavigator
  ] = {
    val __obj = js.Dynamic.literal(stateNavigator = stateNavigator.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.navigationReact.AnonStateNavigator, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.navigationReact.mod.NavigationHandler](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.navigationReact.AnonStateNavigator])(children: _*)
  }
  @JSImport("navigation-react", "NavigationHandler")
  @js.native
  object componentImport extends js.Object
  
}

