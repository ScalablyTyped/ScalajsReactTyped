package typingsJapgolly.reactNativeSettingsList.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSettingsList.reactNativeSettingsListStrings.Both
import typingsJapgolly.reactNativeSettingsList.reactNativeSettingsListStrings.Bottom
import typingsJapgolly.reactNativeSettingsList.reactNativeSettingsListStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemProps extends js.Object {
  var arrowIcon: js.UndefOr[Node] = js.undefined
  var arrowStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var authPropsPW: js.UndefOr[js.Object] = js.undefined
  var authPropsUser: js.UndefOr[js.Object] = js.undefined
  /**
    * Individual background color. Can be globally set in the parent. Will become Deprecated
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /* Gives opens to hide specific borders */
  var borderHide: js.UndefOr[Top | Bottom | Both] = js.undefined
  /**
    * Editable Right Side Style
    */
  var editableTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Enable or disable the > arrow at the end of the setting item.
    * Default: true
    */
  var hasNavArrow: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable a Switch component
    */
  var hasSwitch: js.UndefOr[Boolean] = js.undefined
  /**
    * Icon displayed on the left of the settings item
    */
  var icon: js.UndefOr[Node] = js.undefined
  /**
    * Allows for the item to become an auth item
    */
  var isAuth: js.UndefOr[Boolean] = js.undefined
  /**
    * Item Box Style
    */
  var itemBoxStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var itemRef: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Individual item width.  Can be globally set in the parent.  Will become deprecated
    */
  var itemWidth: js.UndefOr[Double] = js.undefined
  /**
    * Item on long press callback.
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Item on press callback.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Right side content
    */
  var rightSideContent: js.UndefOr[Node] = js.undefined
  /**
    * Right Side Style
    */
  var rightSideStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * On value change callback
    */
  var switchOnValueChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Switch props
    */
  var switchProps: js.UndefOr[js.Object] = js.undefined
  /**
    * Switch state
    */
  var switchState: js.UndefOr[Boolean] = js.undefined
  /**
    * Title being displayed
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Title Box Style
    */
  var titleBoxStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Right side information on the setting item
    */
  var titleInfo: js.UndefOr[String] = js.undefined
  /**
    * If 'Bottom'; info is placed beneath the title
    */
  var titleInfoPosition: js.UndefOr[String] = js.undefined
  var titleInfoStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Individual underlay click color.  Can be globally set in the parent.
    */
  var underlayColor: js.UndefOr[String] = js.undefined
}

object ItemProps {
  @scala.inline
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
    underlayColor: String = null
  ): ItemProps = {
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
    __obj.asInstanceOf[ItemProps]
  }
}

