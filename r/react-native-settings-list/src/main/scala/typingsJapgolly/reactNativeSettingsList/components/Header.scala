package typingsJapgolly.reactNativeSettingsList.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativeSettingsList.mod.HeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  def apply(
    headerNumberOfLines: Int | Double = null,
    headerRef: js.UndefOr[Callback] = js.undefined,
    headerStyle: StyleProp[TextStyle] = null,
    headerText: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HeaderProps, 
    typingsJapgolly.reactNativeSettingsList.mod.default.Header, 
    Unit, 
    HeaderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (headerNumberOfLines != null) __obj.updateDynamic("headerNumberOfLines")(headerNumberOfLines.asInstanceOf[js.Any])
    headerRef.foreach(p => __obj.updateDynamic("headerRef")(p.toJsFn))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSettingsList.mod.HeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSettingsList.mod.default.Header](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSettingsList.mod.HeaderProps])(children: _*)
  }
  @JSImport("react-native-settings-list", "default.Header")
  @js.native
  object componentImport extends js.Object
  
}

