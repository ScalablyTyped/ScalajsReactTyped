package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.AnonActive
import typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigation.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BottomNavigationAction {
  def apply(
    active: Boolean,
    icon: Element | String,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    style: AnonActive = null,
    testID: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigationAction, 
    Action, 
    Unit, 
    typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigationAction
  ] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigationAction, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigation.Action](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.BottomNavigationAction])(children: _*)
  }
  @JSImport("react-native-material-ui", "BottomNavigation.Action")
  @js.native
  object componentImport extends js.Object
  
}

