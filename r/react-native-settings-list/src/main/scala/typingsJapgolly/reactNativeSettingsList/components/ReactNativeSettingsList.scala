package typingsJapgolly.reactNativeSettingsList.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativeSettingsList.mod.SettingsListProps
import typingsJapgolly.reactNativeSettingsList.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeSettingsList {
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    defaultItemSize: Int | Double = null,
    defaultTitleInfoPosition: String = null,
    defaultTitleStyle: StyleProp[TextStyle] = null,
    scrollViewProps: js.Object = null,
    underlayColor: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SettingsListProps, default, Unit, SettingsListProps] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (defaultItemSize != null) __obj.updateDynamic("defaultItemSize")(defaultItemSize.asInstanceOf[js.Any])
    if (defaultTitleInfoPosition != null) __obj.updateDynamic("defaultTitleInfoPosition")(defaultTitleInfoPosition.asInstanceOf[js.Any])
    if (defaultTitleStyle != null) __obj.updateDynamic("defaultTitleStyle")(defaultTitleStyle.asInstanceOf[js.Any])
    if (scrollViewProps != null) __obj.updateDynamic("scrollViewProps")(scrollViewProps.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSettingsList.mod.SettingsListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSettingsList.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSettingsList.mod.SettingsListProps])(children: _*)
  }
  @JSImport("react-native-settings-list", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

