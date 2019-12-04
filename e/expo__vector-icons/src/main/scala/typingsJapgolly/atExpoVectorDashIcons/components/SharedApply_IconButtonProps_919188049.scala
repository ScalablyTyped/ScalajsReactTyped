package typingsJapgolly.atExpoVectorDashIcons.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityActionInfo
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityRole
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityState
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityStates
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityTrait
import typingsJapgolly.reactDashNative.reactDashNativeMod.BackgroundPropType
import typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent
import typingsJapgolly.reactDashNative.reactDashNativeMod.Insets
import typingsJapgolly.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typingsJapgolly.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typingsJapgolly.reactDashNative.reactDashNativeMod.NodeHandle
import typingsJapgolly.reactDashNative.reactDashNativeMod.TVParallaxProperties
import typingsJapgolly.reactDashNative.reactDashNativeMod.TargetedEvent
import typingsJapgolly.reactDashNative.reactDashNativeMod.TextStyle
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNative.reactDashNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactDashNative.reactDashNativeStrings.assertive
import typingsJapgolly.reactDashNative.reactDashNativeStrings.auto
import typingsJapgolly.reactDashNative.reactDashNativeStrings.balanced
import typingsJapgolly.reactDashNative.reactDashNativeStrings.button
import typingsJapgolly.reactDashNative.reactDashNativeStrings.clip
import typingsJapgolly.reactDashNative.reactDashNativeStrings.head
import typingsJapgolly.reactDashNative.reactDashNativeStrings.highQuality
import typingsJapgolly.reactDashNative.reactDashNativeStrings.middle
import typingsJapgolly.reactDashNative.reactDashNativeStrings.no
import typingsJapgolly.reactDashNative.reactDashNativeStrings.none
import typingsJapgolly.reactDashNative.reactDashNativeStrings.polite
import typingsJapgolly.reactDashNative.reactDashNativeStrings.radiobutton_checked
import typingsJapgolly.reactDashNative.reactDashNativeStrings.radiobutton_unchecked
import typingsJapgolly.reactDashNative.reactDashNativeStrings.simple
import typingsJapgolly.reactDashNative.reactDashNativeStrings.tail
import typingsJapgolly.reactDashNative.reactDashNativeStrings.yes
import typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.IconButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IconButtonProps_919188049[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    name: String,
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
    adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    background: BackgroundPropType = null,
    backgroundColor: String = null,
    borderRadius: Int | Double = null,
    color: String = null,
    delayLongPress: Int | Double = null,
    delayPressIn: Int | Double = null,
    delayPressOut: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    ellipsizeMode: head | middle | tail | clip = null,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    iconStyle: TextStyle = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    lineBreakMode: head | middle | tail | clip = null,
    maxFontSizeMultiplier: Int | Double = null,
    minimumFontScale: Int | Double = null,
    nativeID: String = null,
    numberOfLines: Int | Double = null,
    onAccessibilityAction: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onAccessibilityTap: js.UndefOr[Callback] = js.undefined,
    onBlur: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback = null,
    onFocus: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback = null,
    onHideUnderlay: js.UndefOr[Callback] = js.undefined,
    onLayout: /* event */ LayoutChangeEvent => Callback = null,
    onLongPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onMagicTap: js.UndefOr[Callback] = js.undefined,
    onPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onPressIn: /* event */ GestureResponderEvent => Callback = null,
    onPressOut: /* event */ GestureResponderEvent => Callback = null,
    onShowUnderlay: js.UndefOr[Callback] = js.undefined,
    pressRetentionOffset: Insets = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectionColor: String = null,
    size: Int | Double = null,
    style: ViewStyle | TextStyle = null,
    suppressHighlighting: js.UndefOr[Boolean] = js.undefined,
    testID: String = null,
    textBreakStrategy: simple | highQuality | balanced = null,
    tvParallaxProperties: TVParallaxProperties = null,
    underlayColor: String = null,
    useForeground: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IconButtonProps, ComponentRef, Unit, IconButtonProps] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
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
    if (!js.isUndefined(adjustsFontSizeToFit)) __obj.updateDynamic("adjustsFontSizeToFit")(adjustsFontSizeToFit.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (ellipsizeMode != null) __obj.updateDynamic("ellipsizeMode")(ellipsizeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (lineBreakMode != null) __obj.updateDynamic("lineBreakMode")(lineBreakMode.asInstanceOf[js.Any])
    if (maxFontSizeMultiplier != null) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.asInstanceOf[js.Any])
    if (minimumFontScale != null) __obj.updateDynamic("minimumFontScale")(minimumFontScale.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.reactDashNative.reactDashNativeMod.NodeHandle with org.scalajs.dom.raw.Element]) => onAccessibilityAction(t0).runNow()))
    onAccessibilityTap.foreach(p => __obj.updateDynamic("onAccessibilityTap")(p.toJsFn))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDashNative.reactDashNativeMod.NativeSyntheticEvent[typingsJapgolly.reactDashNative.reactDashNativeMod.TargetedEvent]) => onBlur(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDashNative.reactDashNativeMod.NativeSyntheticEvent[typingsJapgolly.reactDashNative.reactDashNativeMod.TargetedEvent]) => onFocus(t0).runNow()))
    onHideUnderlay.foreach(p => __obj.updateDynamic("onHideUnderlay")(p.toJsFn))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.LayoutChangeEvent) => onLayout(t0).runNow()))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.reactDashNative.reactDashNativeMod.NodeHandle with org.scalajs.dom.raw.Element]) => onLongPress(t0).runNow()))
    onMagicTap.foreach(p => __obj.updateDynamic("onMagicTap")(p.toJsFn))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.reactDashNative.reactDashNativeMod.NodeHandle with org.scalajs.dom.raw.Element]) => onPress(t0).runNow()))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onPressIn(t0).runNow()))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onPressOut(t0).runNow()))
    onShowUnderlay.foreach(p => __obj.updateDynamic("onShowUnderlay")(p.toJsFn))
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHighlighting)) __obj.updateDynamic("suppressHighlighting")(suppressHighlighting.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    if (!js.isUndefined(useForeground)) __obj.updateDynamic("useForeground")(useForeground.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.IconButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod.IconButtonProps])(children: _*)
  }
}

