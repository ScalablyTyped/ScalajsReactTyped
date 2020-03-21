package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.AnonContainer
import typingsJapgolly.reactNativeMaterialUi.AnonIcon
import typingsJapgolly.reactNativeMaterialUi.mod.ActionButtonProps
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.speedDial
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActionButton {
  def apply(
    actions: js.Array[AnonIcon | Element | String] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    onLongPress: js.UndefOr[Callback] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    style: AnonContainer = null,
    transition: toolbar | speedDial = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ActionButtonProps, 
    typingsJapgolly.reactNativeMaterialUi.mod.ActionButton, 
    Unit, 
    ActionButtonProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    onLongPress.foreach(p => __obj.updateDynamic("onLongPress")(p.toJsFn))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.ActionButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialUi.mod.ActionButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.ActionButtonProps])(children: _*)
  }
  @JSImport("react-native-material-ui", "ActionButton")
  @js.native
  object componentImport extends js.Object
  
}

