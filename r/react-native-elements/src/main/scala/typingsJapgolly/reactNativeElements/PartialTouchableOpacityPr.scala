package typingsJapgolly.reactNativeElements

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityStates
import typingsJapgolly.reactNative.mod.AccessibilityTrait
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
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

/* Inlined std.Partial<react-native.react-native.TouchableOpacityProps> & {  buttonStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   buttonTextStyle ? :react-native.react-native.StyleProp<react-native.react-native.TextStyle>,   color ? :string,   buttonDisabledStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   buttonDisabledTextStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>} */
trait PartialTouchableOpacityPr extends js.Object {
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
  var buttonDisabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var buttonDisabledTextStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var buttonTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var delayLongPress: js.UndefOr[Double] = js.undefined
  var delayPressIn: js.UndefOr[Double] = js.undefined
  var delayPressOut: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  var hitSlop: js.UndefOr[Insets] = js.undefined
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  var onAccessibilityAction: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
}

object PartialTouchableOpacityPr {
  @scala.inline
  def apply(
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
    buttonDisabledStyle: StyleProp[ViewStyle] = null,
    buttonDisabledTextStyle: StyleProp[ViewStyle] = null,
    buttonStyle: StyleProp[ViewStyle] = null,
    buttonTextStyle: StyleProp[TextStyle] = null,
    color: String = null,
    delayLongPress: Int | Double = null,
    delayPressIn: Int | Double = null,
    delayPressOut: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    onAccessibilityAction: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onAccessibilityEscape: js.UndefOr[Callback] = js.undefined,
    onAccessibilityTap: js.UndefOr[Callback] = js.undefined,
    onBlur: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onFocus: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onLayout: /* event */ LayoutChangeEvent => Callback = null,
    onLongPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onMagicTap: js.UndefOr[Callback] = js.undefined,
    onPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onPressIn: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onPressOut: ReactEventFrom[NodeHandle with Element] => Callback = null,
    pressRetentionOffset: Insets = null,
    style: StyleProp[ViewStyle] = null,
    testID: String = null,
    tvParallaxProperties: TVParallaxProperties = null
  ): PartialTouchableOpacityPr = {
    val __obj = js.Dynamic.literal()
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
    if (buttonDisabledStyle != null) __obj.updateDynamic("buttonDisabledStyle")(buttonDisabledStyle.asInstanceOf[js.Any])
    if (buttonDisabledTextStyle != null) __obj.updateDynamic("buttonDisabledTextStyle")(buttonDisabledTextStyle.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (buttonTextStyle != null) __obj.updateDynamic("buttonTextStyle")(buttonTextStyle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onAccessibilityAction(t0).runNow()))
    onAccessibilityEscape.foreach(p => __obj.updateDynamic("onAccessibilityEscape")(p.toJsFn))
    onAccessibilityTap.foreach(p => __obj.updateDynamic("onAccessibilityTap")(p.toJsFn))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNative.mod.LayoutChangeEvent) => onLayout(t0).runNow()))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onLongPress(t0).runNow()))
    onMagicTap.foreach(p => __obj.updateDynamic("onMagicTap")(p.toJsFn))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPress(t0).runNow()))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPressIn(t0).runNow()))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPressOut(t0).runNow()))
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTouchableOpacityPr]
  }
}

