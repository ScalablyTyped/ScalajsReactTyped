package typingsJapgolly.reactDashNavigation.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.reactMod.ComponentType
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationProp
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.SceneViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SceneView {
  def apply(
    component: ComponentType[js.Object],
    navigation: NavigationProp[_],
    screenProps: js.Any,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SceneViewProps, 
    typingsJapgolly.reactDashNavigation.reactDashNavigationMod.SceneView, 
    Unit, 
    SceneViewProps
  ] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigation.reactDashNavigationMod.SceneViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigation.reactDashNavigationMod.SceneView](js.constructorOf[typingsJapgolly.reactDashNavigation.reactDashNavigationMod.SceneView])
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigation.reactDashNavigationMod.SceneViewProps])(children: _*)
  }
}

