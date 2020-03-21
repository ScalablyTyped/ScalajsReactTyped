package typingsJapgolly.reactNavigation.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNavigation.mod.NavigationProp
import typingsJapgolly.reactNavigation.mod.SceneViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SceneView {
  def apply(
    component: ComponentType[js.Object],
    navigation: NavigationProp[_],
    screenProps: js.Any,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SceneViewProps, typingsJapgolly.reactNavigation.mod.SceneView, Unit, SceneViewProps] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigation.mod.SceneViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigation.mod.SceneView](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigation.mod.SceneViewProps])(children: _*)
  }
  @JSImport("react-navigation", "SceneView")
  @js.native
  object componentImport extends js.Object
  
}

