package typingsJapgolly.reactDashNavigationDashStack.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityActionEvent
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityRole
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityState
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityStates
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityTrait
import typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent
import typingsJapgolly.reactDashNative.reactDashNativeMod.Insets
import typingsJapgolly.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.TVParallaxProperties
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNavigationDashStack.AccessibilityActionInfo
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTouchableItemMod.Props
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTouchableItemMod.default
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.`box-none`
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.`box-only`
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.`no-hide-descendants`
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.assertive
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.auto
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.button
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.no
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.none
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.polite
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.radiobutton_checked
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.radiobutton_unchecked
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TouchableItem {
  def apply(
    pressColor: String,
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
    borderless: js.UndefOr[Boolean] = js.undefined,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    delayPressIn: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Callback = null,
    onAccessibilityTap: js.UndefOr[Callback] = js.undefined,
    onLayout: /* event */ LayoutChangeEvent => Callback = null,
    onMagicTap: js.UndefOr[Callback] = js.undefined,
    onMoveShouldSetResponder: /* event */ GestureResponderEvent => CallbackTo[Boolean] = null,
    onMoveShouldSetResponderCapture: /* event */ GestureResponderEvent => CallbackTo[Boolean] = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    onResponderEnd: /* event */ GestureResponderEvent => Callback = null,
    onResponderGrant: /* event */ GestureResponderEvent => Callback = null,
    onResponderMove: /* event */ GestureResponderEvent => Callback = null,
    onResponderReject: /* event */ GestureResponderEvent => Callback = null,
    onResponderRelease: /* event */ GestureResponderEvent => Callback = null,
    onResponderStart: /* event */ GestureResponderEvent => Callback = null,
    onResponderTerminate: /* event */ GestureResponderEvent => Callback = null,
    onResponderTerminationRequest: /* event */ GestureResponderEvent => CallbackTo[Boolean] = null,
    onStartShouldSetResponder: /* event */ GestureResponderEvent => CallbackTo[Boolean] = null,
    onStartShouldSetResponderCapture: /* event */ GestureResponderEvent => CallbackTo[Boolean] = null,
    onTouchCancel: /* event */ GestureResponderEvent => Callback = null,
    onTouchEnd: /* event */ GestureResponderEvent => Callback = null,
    onTouchEndCapture: /* event */ GestureResponderEvent => Callback = null,
    onTouchMove: /* event */ GestureResponderEvent => Callback = null,
    onTouchStart: /* event */ GestureResponderEvent => Callback = null,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    testID: String = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(pressColor = pressColor.asInstanceOf[js.Any])
  
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
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityActionEvent) => onAccessibilityAction(t0).runNow()))
    onAccessibilityTap.foreach(p => __obj.updateDynamic("onAccessibilityTap")(p.toJsFn))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.LayoutChangeEvent) => onLayout(t0).runNow()))
    onMagicTap.foreach(p => __obj.updateDynamic("onMagicTap")(p.toJsFn))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onMoveShouldSetResponder(t0).runNow()))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onMoveShouldSetResponderCapture(t0).runNow()))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onResponderEnd(t0).runNow()))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onResponderGrant(t0).runNow()))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onResponderMove(t0).runNow()))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onResponderReject(t0).runNow()))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onResponderRelease(t0).runNow()))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onResponderStart(t0).runNow()))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onResponderTerminate(t0).runNow()))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onResponderTerminationRequest(t0).runNow()))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onStartShouldSetResponder(t0).runNow()))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onStartShouldSetResponderCapture(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onTouchEnd(t0).runNow()))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onTouchEndCapture(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.GestureResponderEvent) => onTouchStart(t0).runNow()))
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTouchableItemMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTouchableItemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTouchableItemMod.Props])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/TouchableItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

