package typingsJapgolly.reactNativeElements

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityStates
import typingsJapgolly.reactNative.mod.AccessibilityTrait
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.SwitchProperties
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.TextProperties
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.mod.BadgeProps
import typingsJapgolly.reactNativeElements.mod.ButtonGroupProps
import typingsJapgolly.reactNativeElements.mod.CheckBoxProps
import typingsJapgolly.reactNativeElements.mod.InputProps
import typingsJapgolly.reactNativeElements.mod.ScaleProps
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.assertive
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.auto
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.button
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.no
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.none
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.polite
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.ListItemProps> */
trait PartialListItemPropsAccessibilityActions extends js.Object {
  var Component: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var ViewComponent: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  var accessibilityHint: js.UndefOr[String] = js.undefined
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  var accessibilityStates: js.UndefOr[js.Array[AccessibilityStates]] = js.undefined
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  var accessible: js.UndefOr[Boolean] = js.undefined
  var activeOpacity: js.UndefOr[Double] = js.undefined
  var badge: js.UndefOr[BadgeProps] = js.undefined
  var bottomDivider: js.UndefOr[Boolean] = js.undefined
  var buttonGroup: js.UndefOr[ButtonGroupProps] = js.undefined
  var checkBox: js.UndefOr[CheckBoxProps] = js.undefined
  var checkmark: js.UndefOr[Boolean | PartialIconProps | Element] = js.undefined
  var chevron: js.UndefOr[Boolean | PartialIconProps | Element] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var delayLongPress: js.UndefOr[Double] = js.undefined
  var delayPressIn: js.UndefOr[Double] = js.undefined
  var delayPressOut: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  var hitSlop: js.UndefOr[Insets] = js.undefined
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  var input: js.UndefOr[InputProps] = js.undefined
  var leftAvatar: js.UndefOr[PartialAvatarPropsActiveOpacity | Element] = js.undefined
  var leftElement: js.UndefOr[Element] = js.undefined
  var leftIcon: js.UndefOr[PartialIconProps | Element] = js.undefined
  var onAccessibilityAction: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pad: js.UndefOr[Double] = js.undefined
  var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
  var rightAvatar: js.UndefOr[PartialAvatarPropsActiveOpacity | Element] = js.undefined
  var rightContentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var rightElement: js.UndefOr[Element] = js.undefined
  var rightIcon: js.UndefOr[PartialIconProps | Element] = js.undefined
  var rightSubtitle: js.UndefOr[String | Element] = js.undefined
  var rightSubtitleProps: js.UndefOr[TextProperties] = js.undefined
  var rightSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var rightTitle: js.UndefOr[String | Element] = js.undefined
  var rightTitleProps: js.UndefOr[TextProperties] = js.undefined
  var rightTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var scaleProps: js.UndefOr[ScaleProps] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var subtitle: js.UndefOr[String | Element] = js.undefined
  var subtitleProps: js.UndefOr[TextProperties] = js.undefined
  var subtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var switch: js.UndefOr[SwitchProperties] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String | Element] = js.undefined
  var titleProps: js.UndefOr[TextProperties] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var topDivider: js.UndefOr[Boolean] = js.undefined
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  var underlayColor: js.UndefOr[String] = js.undefined
}

object PartialListItemPropsAccessibilityActions {
  @scala.inline
  def apply(
    Component: ComponentType[js.Object] = null,
    ViewComponent: ComponentType[js.Object] = null,
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    activeOpacity: Int | Double = null,
    badge: BadgeProps = null,
    bottomDivider: js.UndefOr[Boolean] = js.undefined,
    buttonGroup: ButtonGroupProps = null,
    checkBox: CheckBoxProps = null,
    checkmark: Boolean | PartialIconProps | Element = null,
    chevron: Boolean | PartialIconProps | Element = null,
    containerStyle: StyleProp[ViewStyle] = null,
    contentContainerStyle: StyleProp[ViewStyle] = null,
    delayLongPress: Int | Double = null,
    delayPressIn: Int | Double = null,
    delayPressOut: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledStyle: StyleProp[ViewStyle] = null,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    input: InputProps = null,
    leftAvatar: PartialAvatarPropsActiveOpacity | Element = null,
    leftElement: VdomElement = null,
    leftIcon: PartialIconProps | Element = null,
    onAccessibilityAction: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onAccessibilityEscape: js.UndefOr[Callback] = js.undefined,
    onAccessibilityTap: js.UndefOr[Callback] = js.undefined,
    onBlur: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onFocus: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onHideUnderlay: js.UndefOr[Callback] = js.undefined,
    onLayout: /* event */ LayoutChangeEvent => Callback = null,
    onLongPress: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onMagicTap: js.UndefOr[Callback] = js.undefined,
    onPress: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onPressIn: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onPressOut: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onShowUnderlay: js.UndefOr[Callback] = js.undefined,
    pad: Int | Double = null,
    pressRetentionOffset: Insets = null,
    rightAvatar: PartialAvatarPropsActiveOpacity | Element = null,
    rightContentContainerStyle: StyleProp[ViewStyle] = null,
    rightElement: VdomElement = null,
    rightIcon: PartialIconProps | Element = null,
    rightSubtitle: String | Element = null,
    rightSubtitleProps: TextProperties = null,
    rightSubtitleStyle: StyleProp[TextStyle] = null,
    rightTitle: String | Element = null,
    rightTitleProps: TextProperties = null,
    rightTitleStyle: StyleProp[TextStyle] = null,
    scaleProps: ScaleProps = null,
    style: StyleProp[ViewStyle] = null,
    subtitle: String | Element = null,
    subtitleProps: TextProperties = null,
    subtitleStyle: StyleProp[TextStyle] = null,
    switch: SwitchProperties = null,
    testID: String = null,
    title: String | Element = null,
    titleProps: TextProperties = null,
    titleStyle: StyleProp[TextStyle] = null,
    topDivider: js.UndefOr[Boolean] = js.undefined,
    tvParallaxProperties: TVParallaxProperties = null,
    underlayColor: String = null
  ): PartialListItemPropsAccessibilityActions = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (ViewComponent != null) __obj.updateDynamic("ViewComponent")(ViewComponent.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomDivider)) __obj.updateDynamic("bottomDivider")(bottomDivider.asInstanceOf[js.Any])
    if (buttonGroup != null) __obj.updateDynamic("buttonGroup")(buttonGroup.asInstanceOf[js.Any])
    if (checkBox != null) __obj.updateDynamic("checkBox")(checkBox.asInstanceOf[js.Any])
    if (checkmark != null) __obj.updateDynamic("checkmark")(checkmark.asInstanceOf[js.Any])
    if (chevron != null) __obj.updateDynamic("chevron")(chevron.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (leftAvatar != null) __obj.updateDynamic("leftAvatar")(leftAvatar.asInstanceOf[js.Any])
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement.rawElement.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onAccessibilityAction(t0).runNow()))
    onAccessibilityEscape.foreach(p => __obj.updateDynamic("onAccessibilityEscape")(p.toJsFn))
    onAccessibilityTap.foreach(p => __obj.updateDynamic("onAccessibilityTap")(p.toJsFn))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    onHideUnderlay.foreach(p => __obj.updateDynamic("onHideUnderlay")(p.toJsFn))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNative.mod.LayoutChangeEvent) => onLayout(t0).runNow()))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onLongPress(t0).runNow()))
    onMagicTap.foreach(p => __obj.updateDynamic("onMagicTap")(p.toJsFn))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPress(t0).runNow()))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPressIn(t0).runNow()))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPressOut(t0).runNow()))
    onShowUnderlay.foreach(p => __obj.updateDynamic("onShowUnderlay")(p.toJsFn))
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset.asInstanceOf[js.Any])
    if (rightAvatar != null) __obj.updateDynamic("rightAvatar")(rightAvatar.asInstanceOf[js.Any])
    if (rightContentContainerStyle != null) __obj.updateDynamic("rightContentContainerStyle")(rightContentContainerStyle.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.rawElement.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (rightSubtitle != null) __obj.updateDynamic("rightSubtitle")(rightSubtitle.asInstanceOf[js.Any])
    if (rightSubtitleProps != null) __obj.updateDynamic("rightSubtitleProps")(rightSubtitleProps.asInstanceOf[js.Any])
    if (rightSubtitleStyle != null) __obj.updateDynamic("rightSubtitleStyle")(rightSubtitleStyle.asInstanceOf[js.Any])
    if (rightTitle != null) __obj.updateDynamic("rightTitle")(rightTitle.asInstanceOf[js.Any])
    if (rightTitleProps != null) __obj.updateDynamic("rightTitleProps")(rightTitleProps.asInstanceOf[js.Any])
    if (rightTitleStyle != null) __obj.updateDynamic("rightTitleStyle")(rightTitleStyle.asInstanceOf[js.Any])
    if (scaleProps != null) __obj.updateDynamic("scaleProps")(scaleProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleProps != null) __obj.updateDynamic("subtitleProps")(subtitleProps.asInstanceOf[js.Any])
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle.asInstanceOf[js.Any])
    if (switch != null) __obj.updateDynamic("switch")(switch.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(topDivider)) __obj.updateDynamic("topDivider")(topDivider.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialListItemPropsAccessibilityActions]
  }
}

