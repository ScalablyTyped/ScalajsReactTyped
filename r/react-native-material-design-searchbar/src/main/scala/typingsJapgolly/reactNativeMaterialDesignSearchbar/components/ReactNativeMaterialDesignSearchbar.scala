package typingsJapgolly.reactNativeMaterialDesignSearchbar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ReturnKeyType
import typingsJapgolly.reactNative.mod.ReturnKeyTypeAndroid
import typingsJapgolly.reactNative.mod.ReturnKeyTypeIOS
import typingsJapgolly.reactNative.mod.TextInputProps
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativeMaterialDesignSearchbar.mod.SearchBarProps
import typingsJapgolly.reactNativeMaterialDesignSearchbar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeMaterialDesignSearchbar {
  def apply(
    height: Double,
    alwaysShowBackButton: js.UndefOr[Boolean] = js.undefined,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    iconBackName: String = null,
    iconCloseName: String = null,
    iconColor: String = null,
    iconPadding: Int | Double = null,
    iconSearchName: String = null,
    iconSize: Int | Double = null,
    inputProps: TextInputProps = null,
    inputStyle: TextStyle = null,
    onBackPress: js.UndefOr[Callback] = js.undefined,
    onBlur: js.UndefOr[Callback] = js.undefined,
    onClose: js.UndefOr[Callback] = js.undefined,
    onEndEditing: js.UndefOr[Callback] = js.undefined,
    onFocus: js.UndefOr[Callback] = js.undefined,
    onSearchChange: /* text */ String => Callback = null,
    onSubmitEditing: js.UndefOr[Callback] = js.undefined,
    padding: Int | Double = null,
    placeholder: String = null,
    placeholderColor: String = null,
    returnKeyType: ReturnKeyType | ReturnKeyTypeAndroid | ReturnKeyTypeIOS = null,
    textStyle: TextStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SearchBarProps, default, Unit, SearchBarProps] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
  
      if (!js.isUndefined(alwaysShowBackButton)) __obj.updateDynamic("alwaysShowBackButton")(alwaysShowBackButton.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (iconBackName != null) __obj.updateDynamic("iconBackName")(iconBackName.asInstanceOf[js.Any])
    if (iconCloseName != null) __obj.updateDynamic("iconCloseName")(iconCloseName.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (iconPadding != null) __obj.updateDynamic("iconPadding")(iconPadding.asInstanceOf[js.Any])
    if (iconSearchName != null) __obj.updateDynamic("iconSearchName")(iconSearchName.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    onBackPress.foreach(p => __obj.updateDynamic("onBackPress")(p.toJsFn))
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onEndEditing.foreach(p => __obj.updateDynamic("onEndEditing")(p.toJsFn))
    onFocus.foreach(p => __obj.updateDynamic("onFocus")(p.toJsFn))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => onSearchChange(t0).runNow()))
    onSubmitEditing.foreach(p => __obj.updateDynamic("onSubmitEditing")(p.toJsFn))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderColor != null) __obj.updateDynamic("placeholderColor")(placeholderColor.asInstanceOf[js.Any])
    if (returnKeyType != null) __obj.updateDynamic("returnKeyType")(returnKeyType.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialDesignSearchbar.mod.SearchBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialDesignSearchbar.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialDesignSearchbar.mod.SearchBarProps])(children: _*)
  }
  @JSImport("react-native-material-design-searchbar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

