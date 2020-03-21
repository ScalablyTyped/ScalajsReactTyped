package typingsJapgolly.reactNativeMaterialMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialMenu.mod.MenuProps
import typingsJapgolly.reactNativeMaterialMenu.mod.default
import typingsJapgolly.std.StyleMedia_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeMaterialMenu {
  def apply(
    animationDuration: Int | Double = null,
    button: VdomElement = null,
    onHidden: js.UndefOr[Callback] = js.undefined,
    style: StyleMedia_ = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MenuProps, default, Unit, MenuProps] = {
    val __obj = js.Dynamic.literal()
  
      if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.rawElement.asInstanceOf[js.Any])
    onHidden.foreach(p => __obj.updateDynamic("onHidden")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialMenu.mod.MenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialMenu.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialMenu.mod.MenuProps])(children: _*)
  }
  @JSImport("react-native-material-menu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

