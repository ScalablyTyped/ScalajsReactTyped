package typingsJapgolly.reactNativeSettingsList.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSettingsList.mod.ItemProps
import typingsJapgolly.reactNativeSettingsList.reactNativeSettingsListStrings.Both
import typingsJapgolly.reactNativeSettingsList.reactNativeSettingsListStrings.Bottom
import typingsJapgolly.reactNativeSettingsList.reactNativeSettingsListStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Item {
  def apply(
    arrowIcon: VdomNode = null,
    arrowStyle: StyleProp[ImageStyle] = null,
    authPropsPW: js.Object = null,
    authPropsUser: js.Object = null,
    backgroundColor: String = null,
    borderHide: Top | Bottom | Both = null,
    editableTextStyle: StyleProp[TextStyle] = null,
    hasNavArrow: js.UndefOr[Boolean] = js.undefined,
    hasSwitch: js.UndefOr[Boolean] = js.undefined,
    icon: VdomNode = null,
    isAuth: js.UndefOr[Boolean] = js.undefined,
    itemBoxStyle: StyleProp[ViewStyle] = null,
    itemRef: js.UndefOr[Callback] = js.undefined,
    itemWidth: Int | Double = null,
    onLongPress: js.UndefOr[Callback] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    rightSideContent: VdomNode = null,
    rightSideStyle: StyleProp[ViewStyle] = null,
    switchOnValueChange: js.UndefOr[Callback] = js.undefined,
    switchProps: js.Object = null,
    switchState: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleBoxStyle: StyleProp[ViewStyle] = null,
    titleInfo: String = null,
    titleInfoPosition: String = null,
    titleInfoStyle: StyleProp[TextStyle] = null,
    titleStyle: StyleProp[TextStyle] = null,
    underlayColor: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ItemProps, typingsJapgolly.reactNativeSettingsList.mod.default.Item, Unit, ItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (arrowIcon != null) __obj.updateDynamic("arrowIcon")(arrowIcon.rawNode.asInstanceOf[js.Any])
    if (arrowStyle != null) __obj.updateDynamic("arrowStyle")(arrowStyle.asInstanceOf[js.Any])
    if (authPropsPW != null) __obj.updateDynamic("authPropsPW")(authPropsPW.asInstanceOf[js.Any])
    if (authPropsUser != null) __obj.updateDynamic("authPropsUser")(authPropsUser.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderHide != null) __obj.updateDynamic("borderHide")(borderHide.asInstanceOf[js.Any])
    if (editableTextStyle != null) __obj.updateDynamic("editableTextStyle")(editableTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hasNavArrow)) __obj.updateDynamic("hasNavArrow")(hasNavArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSwitch)) __obj.updateDynamic("hasSwitch")(hasSwitch.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(isAuth)) __obj.updateDynamic("isAuth")(isAuth.asInstanceOf[js.Any])
    if (itemBoxStyle != null) __obj.updateDynamic("itemBoxStyle")(itemBoxStyle.asInstanceOf[js.Any])
    itemRef.foreach(p => __obj.updateDynamic("itemRef")(p.toJsFn))
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    onLongPress.foreach(p => __obj.updateDynamic("onLongPress")(p.toJsFn))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (rightSideContent != null) __obj.updateDynamic("rightSideContent")(rightSideContent.rawNode.asInstanceOf[js.Any])
    if (rightSideStyle != null) __obj.updateDynamic("rightSideStyle")(rightSideStyle.asInstanceOf[js.Any])
    switchOnValueChange.foreach(p => __obj.updateDynamic("switchOnValueChange")(p.toJsFn))
    if (switchProps != null) __obj.updateDynamic("switchProps")(switchProps.asInstanceOf[js.Any])
    if (!js.isUndefined(switchState)) __obj.updateDynamic("switchState")(switchState.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleBoxStyle != null) __obj.updateDynamic("titleBoxStyle")(titleBoxStyle.asInstanceOf[js.Any])
    if (titleInfo != null) __obj.updateDynamic("titleInfo")(titleInfo.asInstanceOf[js.Any])
    if (titleInfoPosition != null) __obj.updateDynamic("titleInfoPosition")(titleInfoPosition.asInstanceOf[js.Any])
    if (titleInfoStyle != null) __obj.updateDynamic("titleInfoStyle")(titleInfoStyle.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSettingsList.mod.ItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSettingsList.mod.default.Item](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSettingsList.mod.ItemProps])(children: _*)
  }
  @JSImport("react-native-settings-list", "default.Item")
  @js.native
  object componentImport extends js.Object
  
}

