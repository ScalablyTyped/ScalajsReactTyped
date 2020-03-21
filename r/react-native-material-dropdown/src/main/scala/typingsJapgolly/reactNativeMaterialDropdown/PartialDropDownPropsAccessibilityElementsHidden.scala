package typingsJapgolly.reactNativeMaterialDropdown

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
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
import typingsJapgolly.reactNativeMaterialDropdown.mod.DropDownInsets
import typingsJapgolly.reactNativeMaterialDropdown.mod.DropDownMargins
import typingsJapgolly.reactNativeMaterialDropdown.mod.DropDownOffset
import typingsJapgolly.reactNativeMaterialDropdown.mod.RenderBaseProps
import typingsJapgolly.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.assertive
import typingsJapgolly.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.auto
import typingsJapgolly.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.button
import typingsJapgolly.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.no
import typingsJapgolly.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.none
import typingsJapgolly.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.polite
import typingsJapgolly.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.radiobutton_checked
import typingsJapgolly.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.radiobutton_unchecked
import typingsJapgolly.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-material-dropdown.react-native-material-dropdown.DropDownProps> */
trait PartialDropDownPropsAccessibilityElementsHidden extends js.Object {
  var absoluteRTLLayout: js.UndefOr[Boolean] = js.undefined
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
  var animationDuration: js.UndefOr[Double] = js.undefined
  var baseColor: js.UndefOr[String] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var data: js.UndefOr[js.Array[this.type]] = js.undefined
  var delayLongPress: js.UndefOr[Double] = js.undefined
  var delayPressIn: js.UndefOr[Double] = js.undefined
  var delayPressOut: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledItemColor: js.UndefOr[String] = js.undefined
  var dropdownMargins: js.UndefOr[DropDownMargins] = js.undefined
  var dropdownOffset: js.UndefOr[DropDownOffset] = js.undefined
  var dropdownPosition: js.UndefOr[Double] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  var hitSlop: js.UndefOr[DropDownInsets] = js.undefined
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var itemColor: js.UndefOr[String] = js.undefined
  var itemCount: js.UndefOr[Double] = js.undefined
  var itemPadding: js.UndefOr[Double] = js.undefined
  var itemTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelExtractor: js.UndefOr[js.Function2[/* item */ this.type, /* index */ Double, String]] = js.undefined
  var labelFontSize: js.UndefOr[Double] = js.undefined
  var onAccessibilityAction: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChangeText: js.UndefOr[
    js.Function3[/* value */ String, /* index */ Double, /* data */ js.Array[this.type], Unit]
  ] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var pickerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
  var propsExtractor: js.UndefOr[
    js.Function2[
      /* item */ this.type, 
      /* index */ Double, 
      PartialDropDownPropsAccessibilityComponentType
    ]
  ] = js.undefined
  var renderAccessory: js.UndefOr[js.Function0[japgolly.scalajs.react.raw.React.Element]] = js.undefined
  var renderBase: js.UndefOr[
    js.Function1[/* props */ RenderBaseProps, japgolly.scalajs.react.raw.React.Element]
  ] = js.undefined
  var rippleCentered: js.UndefOr[Boolean] = js.undefined
  var rippleColor: js.UndefOr[String] = js.undefined
  var rippleDuration: js.UndefOr[Double] = js.undefined
  var rippleInsets: js.UndefOr[DropDownInsets] = js.undefined
  var rippleOpacity: js.UndefOr[Double] = js.undefined
  var rippleSequential: js.UndefOr[Boolean] = js.undefined
  var selectedItemColor: js.UndefOr[String] = js.undefined
  var shadeOpacity: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[String]] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
  var valueExtractor: js.UndefOr[js.Function2[/* item */ this.type, /* index */ Double, String]] = js.undefined
}

object PartialDropDownPropsAccessibilityElementsHidden {
  @scala.inline
  def apply(
    absoluteRTLLayout: js.UndefOr[Boolean] = js.undefined,
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
    animationDuration: Int | Double = null,
    baseColor: String = null,
    containerStyle: StyleProp[ViewStyle] = null,
    data: js.Array[PartialDropDownPropsAccessibilityElementsHidden] = null,
    delayLongPress: Int | Double = null,
    delayPressIn: Int | Double = null,
    delayPressOut: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledItemColor: String = null,
    dropdownMargins: DropDownMargins = null,
    dropdownOffset: DropDownOffset = null,
    dropdownPosition: Int | Double = null,
    fontSize: Int | Double = null,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: DropDownInsets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    inputContainerStyle: StyleProp[ViewStyle] = null,
    itemColor: String = null,
    itemCount: Int | Double = null,
    itemPadding: Int | Double = null,
    itemTextStyle: StyleProp[TextStyle] = null,
    label: String = null,
    labelExtractor: (PartialDropDownPropsAccessibilityElementsHidden, /* index */ Double) => CallbackTo[String] = null,
    labelFontSize: Int | Double = null,
    onAccessibilityAction: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onAccessibilityEscape: js.UndefOr[Callback] = js.undefined,
    onAccessibilityTap: js.UndefOr[Callback] = js.undefined,
    onBlur: js.UndefOr[Callback] = js.undefined,
    onChangeText: (/* value */ String, /* index */ Double, /* data */ js.Array[PartialDropDownPropsAccessibilityElementsHidden]) => Callback = null,
    onFocus: js.UndefOr[Callback] = js.undefined,
    onLayout: /* event */ LayoutChangeEvent => Callback = null,
    onLongPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onMagicTap: js.UndefOr[Callback] = js.undefined,
    onPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onPressIn: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onPressOut: ReactEventFrom[NodeHandle with Element] => Callback = null,
    overlayStyle: StyleProp[ViewStyle] = null,
    pickerStyle: StyleProp[ViewStyle] = null,
    pressRetentionOffset: Insets = null,
    propsExtractor: (PartialDropDownPropsAccessibilityElementsHidden, /* index */ Double) => CallbackTo[PartialDropDownPropsAccessibilityComponentType] = null,
    renderAccessory: js.UndefOr[CallbackTo[japgolly.scalajs.react.raw.React.Element]] = js.undefined,
    renderBase: /* props */ RenderBaseProps => CallbackTo[japgolly.scalajs.react.raw.React.Element] = null,
    rippleCentered: js.UndefOr[Boolean] = js.undefined,
    rippleColor: String = null,
    rippleDuration: Int | Double = null,
    rippleInsets: DropDownInsets = null,
    rippleOpacity: Int | Double = null,
    rippleSequential: js.UndefOr[Boolean] = js.undefined,
    selectedItemColor: String = null,
    shadeOpacity: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    supportedOrientations: js.Array[String] = null,
    testID: String = null,
    textColor: String = null,
    tvParallaxProperties: TVParallaxProperties = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    value: String | Double = null,
    valueExtractor: (PartialDropDownPropsAccessibilityElementsHidden, /* index */ Double) => CallbackTo[String] = null
  ): PartialDropDownPropsAccessibilityElementsHidden = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absoluteRTLLayout)) __obj.updateDynamic("absoluteRTLLayout")(absoluteRTLLayout.asInstanceOf[js.Any])
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
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (baseColor != null) __obj.updateDynamic("baseColor")(baseColor.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledItemColor != null) __obj.updateDynamic("disabledItemColor")(disabledItemColor.asInstanceOf[js.Any])
    if (dropdownMargins != null) __obj.updateDynamic("dropdownMargins")(dropdownMargins.asInstanceOf[js.Any])
    if (dropdownOffset != null) __obj.updateDynamic("dropdownOffset")(dropdownOffset.asInstanceOf[js.Any])
    if (dropdownPosition != null) __obj.updateDynamic("dropdownPosition")(dropdownPosition.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (inputContainerStyle != null) __obj.updateDynamic("inputContainerStyle")(inputContainerStyle.asInstanceOf[js.Any])
    if (itemColor != null) __obj.updateDynamic("itemColor")(itemColor.asInstanceOf[js.Any])
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (itemPadding != null) __obj.updateDynamic("itemPadding")(itemPadding.asInstanceOf[js.Any])
    if (itemTextStyle != null) __obj.updateDynamic("itemTextStyle")(itemTextStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelExtractor != null) __obj.updateDynamic("labelExtractor")(js.Any.fromFunction2((t0: typingsJapgolly.reactNativeMaterialDropdown.PartialDropDownPropsAccessibilityElementsHidden, t1: /* index */ scala.Double) => labelExtractor(t0, t1).runNow()))
    if (labelFontSize != null) __obj.updateDynamic("labelFontSize")(labelFontSize.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onAccessibilityAction(t0).runNow()))
    onAccessibilityEscape.foreach(p => __obj.updateDynamic("onAccessibilityEscape")(p.toJsFn))
    onAccessibilityTap.foreach(p => __obj.updateDynamic("onAccessibilityTap")(p.toJsFn))
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* index */ scala.Double, t2: /* data */ js.Array[
  typingsJapgolly.reactNativeMaterialDropdown.PartialDropDownPropsAccessibilityElementsHidden]) => onChangeText(t0, t1, t2).runNow()))
    onFocus.foreach(p => __obj.updateDynamic("onFocus")(p.toJsFn))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNative.mod.LayoutChangeEvent) => onLayout(t0).runNow()))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onLongPress(t0).runNow()))
    onMagicTap.foreach(p => __obj.updateDynamic("onMagicTap")(p.toJsFn))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPress(t0).runNow()))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPressIn(t0).runNow()))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPressOut(t0).runNow()))
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (pickerStyle != null) __obj.updateDynamic("pickerStyle")(pickerStyle.asInstanceOf[js.Any])
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset.asInstanceOf[js.Any])
    if (propsExtractor != null) __obj.updateDynamic("propsExtractor")(js.Any.fromFunction2((t0: typingsJapgolly.reactNativeMaterialDropdown.PartialDropDownPropsAccessibilityElementsHidden, t1: /* index */ scala.Double) => propsExtractor(t0, t1).runNow()))
    renderAccessory.foreach(p => __obj.updateDynamic("renderAccessory")(p.toJsFn))
    if (renderBase != null) __obj.updateDynamic("renderBase")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNativeMaterialDropdown.mod.RenderBaseProps) => renderBase(t0).runNow()))
    if (!js.isUndefined(rippleCentered)) __obj.updateDynamic("rippleCentered")(rippleCentered.asInstanceOf[js.Any])
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor.asInstanceOf[js.Any])
    if (rippleDuration != null) __obj.updateDynamic("rippleDuration")(rippleDuration.asInstanceOf[js.Any])
    if (rippleInsets != null) __obj.updateDynamic("rippleInsets")(rippleInsets.asInstanceOf[js.Any])
    if (rippleOpacity != null) __obj.updateDynamic("rippleOpacity")(rippleOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(rippleSequential)) __obj.updateDynamic("rippleSequential")(rippleSequential.asInstanceOf[js.Any])
    if (selectedItemColor != null) __obj.updateDynamic("selectedItemColor")(selectedItemColor.asInstanceOf[js.Any])
    if (shadeOpacity != null) __obj.updateDynamic("shadeOpacity")(shadeOpacity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueExtractor != null) __obj.updateDynamic("valueExtractor")(js.Any.fromFunction2((t0: typingsJapgolly.reactNativeMaterialDropdown.PartialDropDownPropsAccessibilityElementsHidden, t1: /* index */ scala.Double) => valueExtractor(t0, t1).runNow()))
    __obj.asInstanceOf[PartialDropDownPropsAccessibilityElementsHidden]
  }
}

