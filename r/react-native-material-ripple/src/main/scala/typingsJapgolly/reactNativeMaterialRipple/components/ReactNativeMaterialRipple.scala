package typingsJapgolly.reactNativeMaterialRipple.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.Animated.CompositeAnimation
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.yes
import typingsJapgolly.reactNativeMaterialRipple.mod.RippleProps
import typingsJapgolly.reactNativeMaterialRipple.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeMaterialRipple {
  
  @JSImport("react-native-material-ripple", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value*))
    
    inline def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledBy(value: String | js.Array[String]): this.type = set("accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledByVarargs(value: String*): this.type = set("accessibilityLabelledBy", js.Array(value*))
    
    inline def accessibilityLanguage(value: String): this.type = set("accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    inline def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    inline def collapsable(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'collapsable' extends react-native.react-native.Animated.NonAnimatedProps ? 'collapsable' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<boolean | undefined> : boolean | undefined : react-native.react-native.Animated.WithAnimatedValue<boolean | undefined> */ js.Any
    ): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    inline def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    inline def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
    
    inline def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def focusable(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'focusable' extends react-native.react-native.Animated.NonAnimatedProps ? 'focusable' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<boolean | undefined> : boolean | undefined : react-native.react-native.Animated.WithAnimatedValue<boolean | undefined> */ js.Any
    ): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'hasTVPreferredFocus' extends react-native.react-native.Animated.NonAnimatedProps ? 'hasTVPreferredFocus' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<boolean | undefined> : boolean | undefined : react-native.react-native.Animated.WithAnimatedValue<boolean | undefined> */ js.Any
    ): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def isTVSelectable(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'isTVSelectable' extends react-native.react-native.Animated.NonAnimatedProps ? 'isTVSelectable' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<boolean | undefined> : boolean | undefined : react-native.react-native.Animated.WithAnimatedValue<boolean | undefined> */ js.Any
    ): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def nativeID(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'nativeID' extends react-native.react-native.Animated.NonAnimatedProps ? 'nativeID' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<string | undefined> : string | undefined : react-native.react-native.Animated.WithAnimatedValue<string | undefined> */ js.Any
    ): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'needsOffscreenAlphaCompositing' extends react-native.react-native.Animated.NonAnimatedProps ? 'needsOffscreenAlphaCompositing' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<boolean | undefined> : boolean | undefined : react-native.react-native.Animated.WithAnimatedValue<boolean | undefined> */ js.Any
    ): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onBlur(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onLayout(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onLongPress(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onLongPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMoveShouldSetResponder(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onMoveShouldSetResponder' extends react-native.react-native.Animated.NonAnimatedProps ? 'onMoveShouldSetResponder' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): boolean | undefined> : (event : react-native.react-native.GestureResponderEvent): boolean | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): boolean | undefined> */ js.Any
    ): this.type = set("onMoveShouldSetResponder", value.asInstanceOf[js.Any])
    
    inline def onMoveShouldSetResponderCapture(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onMoveShouldSetResponderCapture' extends react-native.react-native.Animated.NonAnimatedProps ? 'onMoveShouldSetResponderCapture' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): boolean | undefined> : (event : react-native.react-native.GestureResponderEvent): boolean | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): boolean | undefined> */ js.Any
    ): this.type = set("onMoveShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerCancel(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onPointerCancel' extends react-native.react-native.Animated.NonAnimatedProps ? 'onPointerCancel' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.PointerEvent): void | undefined> : (event : react-native.react-native.PointerEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.PointerEvent): void | undefined> */ js.Any
    ): this.type = set("onPointerCancel", value.asInstanceOf[js.Any])
    
    inline def onPointerCancelCapture(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onPointerCancelCapture' extends react-native.react-native.Animated.NonAnimatedProps ? 'onPointerCancelCapture' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.PointerEvent): void | undefined> : (event : react-native.react-native.PointerEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.PointerEvent): void | undefined> */ js.Any
    ): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerDown(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onPointerDown' extends react-native.react-native.Animated.NonAnimatedProps ? 'onPointerDown' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.PointerEvent): void | undefined> : (event : react-native.react-native.PointerEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.PointerEvent): void | undefined> */ js.Any
    ): this.type = set("onPointerDown", value.asInstanceOf[js.Any])
    
    inline def onPointerDownCapture(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onPointerDownCapture' extends react-native.react-native.Animated.NonAnimatedProps ? 'onPointerDownCapture' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.PointerEvent): void | undefined> : (event : react-native.react-native.PointerEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.PointerEvent): void | undefined> */ js.Any
    ): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerEnter(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onPointerEnter' extends react-native.react-native.Animated.NonAnimatedProps ? 'onPointerEnter' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.PointerEvent): void | undefined> : (event : react-native.react-native.PointerEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.PointerEvent): void | undefined> */ js.Any
    ): this.type = set("onPointerEnter", value.asInstanceOf[js.Any])
    
    inline def onPointerEnterCapture(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onPointerEnterCapture' extends react-native.react-native.Animated.NonAnimatedProps ? 'onPointerEnterCapture' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.PointerEvent): void | undefined> : (event : react-native.react-native.PointerEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.PointerEvent): void | undefined> */ js.Any
    ): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerLeave(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onPointerLeave' extends react-native.react-native.Animated.NonAnimatedProps ? 'onPointerLeave' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.PointerEvent): void | undefined> : (event : react-native.react-native.PointerEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.PointerEvent): void | undefined> */ js.Any
    ): this.type = set("onPointerLeave", value.asInstanceOf[js.Any])
    
    inline def onPointerLeaveCapture(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onPointerLeaveCapture' extends react-native.react-native.Animated.NonAnimatedProps ? 'onPointerLeaveCapture' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.PointerEvent): void | undefined> : (event : react-native.react-native.PointerEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.PointerEvent): void | undefined> */ js.Any
    ): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerMove(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onPointerMove' extends react-native.react-native.Animated.NonAnimatedProps ? 'onPointerMove' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.PointerEvent): void | undefined> : (event : react-native.react-native.PointerEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.PointerEvent): void | undefined> */ js.Any
    ): this.type = set("onPointerMove", value.asInstanceOf[js.Any])
    
    inline def onPointerMoveCapture(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onPointerMoveCapture' extends react-native.react-native.Animated.NonAnimatedProps ? 'onPointerMoveCapture' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.PointerEvent): void | undefined> : (event : react-native.react-native.PointerEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.PointerEvent): void | undefined> */ js.Any
    ): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerUp(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onPointerUp' extends react-native.react-native.Animated.NonAnimatedProps ? 'onPointerUp' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.PointerEvent): void | undefined> : (event : react-native.react-native.PointerEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.PointerEvent): void | undefined> */ js.Any
    ): this.type = set("onPointerUp", value.asInstanceOf[js.Any])
    
    inline def onPointerUpCapture(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onPointerUpCapture' extends react-native.react-native.Animated.NonAnimatedProps ? 'onPointerUpCapture' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.PointerEvent): void | undefined> : (event : react-native.react-native.PointerEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.PointerEvent): void | undefined> */ js.Any
    ): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
    
    inline def onPress(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPressIn(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPressIn", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPressOut(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPressOut", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderEnd(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onResponderEnd' extends react-native.react-native.Animated.NonAnimatedProps ? 'onResponderEnd' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): void | undefined> : (event : react-native.react-native.GestureResponderEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): void | undefined> */ js.Any
    ): this.type = set("onResponderEnd", value.asInstanceOf[js.Any])
    
    inline def onResponderGrant(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onResponderGrant' extends react-native.react-native.Animated.NonAnimatedProps ? 'onResponderGrant' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): void | undefined> : (event : react-native.react-native.GestureResponderEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): void | undefined> */ js.Any
    ): this.type = set("onResponderGrant", value.asInstanceOf[js.Any])
    
    inline def onResponderMove(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onResponderMove' extends react-native.react-native.Animated.NonAnimatedProps ? 'onResponderMove' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): void | undefined> : (event : react-native.react-native.GestureResponderEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): void | undefined> */ js.Any
    ): this.type = set("onResponderMove", value.asInstanceOf[js.Any])
    
    inline def onResponderReject(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onResponderReject' extends react-native.react-native.Animated.NonAnimatedProps ? 'onResponderReject' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): void | undefined> : (event : react-native.react-native.GestureResponderEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): void | undefined> */ js.Any
    ): this.type = set("onResponderReject", value.asInstanceOf[js.Any])
    
    inline def onResponderRelease(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onResponderRelease' extends react-native.react-native.Animated.NonAnimatedProps ? 'onResponderRelease' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): void | undefined> : (event : react-native.react-native.GestureResponderEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): void | undefined> */ js.Any
    ): this.type = set("onResponderRelease", value.asInstanceOf[js.Any])
    
    inline def onResponderStart(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onResponderStart' extends react-native.react-native.Animated.NonAnimatedProps ? 'onResponderStart' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): void | undefined> : (event : react-native.react-native.GestureResponderEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): void | undefined> */ js.Any
    ): this.type = set("onResponderStart", value.asInstanceOf[js.Any])
    
    inline def onResponderTerminate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onResponderTerminate' extends react-native.react-native.Animated.NonAnimatedProps ? 'onResponderTerminate' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): void | undefined> : (event : react-native.react-native.GestureResponderEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): void | undefined> */ js.Any
    ): this.type = set("onResponderTerminate", value.asInstanceOf[js.Any])
    
    inline def onResponderTerminationRequest(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onResponderTerminationRequest' extends react-native.react-native.Animated.NonAnimatedProps ? 'onResponderTerminationRequest' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): boolean | undefined> : (event : react-native.react-native.GestureResponderEvent): boolean | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): boolean | undefined> */ js.Any
    ): this.type = set("onResponderTerminationRequest", value.asInstanceOf[js.Any])
    
    inline def onRippleAnimation(value: (/* animation */ CompositeAnimation, /* callback */ js.Function0[Unit]) => Callback): this.type = set("onRippleAnimation", js.Any.fromFunction2((t0: /* animation */ CompositeAnimation, t1: /* callback */ js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def onStartShouldSetResponder(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onStartShouldSetResponder' extends react-native.react-native.Animated.NonAnimatedProps ? 'onStartShouldSetResponder' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): boolean | undefined> : (event : react-native.react-native.GestureResponderEvent): boolean | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): boolean | undefined> */ js.Any
    ): this.type = set("onStartShouldSetResponder", value.asInstanceOf[js.Any])
    
    inline def onStartShouldSetResponderCapture(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onStartShouldSetResponderCapture' extends react-native.react-native.Animated.NonAnimatedProps ? 'onStartShouldSetResponderCapture' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): boolean | undefined> : (event : react-native.react-native.GestureResponderEvent): boolean | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): boolean | undefined> */ js.Any
    ): this.type = set("onStartShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchCancel(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onTouchCancel' extends react-native.react-native.Animated.NonAnimatedProps ? 'onTouchCancel' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): void | undefined> : (event : react-native.react-native.GestureResponderEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): void | undefined> */ js.Any
    ): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def onTouchEnd(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onTouchEnd' extends react-native.react-native.Animated.NonAnimatedProps ? 'onTouchEnd' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): void | undefined> : (event : react-native.react-native.GestureResponderEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): void | undefined> */ js.Any
    ): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def onTouchEndCapture(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onTouchEndCapture' extends react-native.react-native.Animated.NonAnimatedProps ? 'onTouchEndCapture' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): void | undefined> : (event : react-native.react-native.GestureResponderEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): void | undefined> */ js.Any
    ): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchMove(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onTouchMove' extends react-native.react-native.Animated.NonAnimatedProps ? 'onTouchMove' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): void | undefined> : (event : react-native.react-native.GestureResponderEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): void | undefined> */ js.Any
    ): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    inline def onTouchStart(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'onTouchStart' extends react-native.react-native.Animated.NonAnimatedProps ? 'onTouchStart' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<(event : react-native.react-native.GestureResponderEvent): void | undefined> : (event : react-native.react-native.GestureResponderEvent): void | undefined : react-native.react-native.Animated.WithAnimatedValue<(event : react-native.react-native.GestureResponderEvent): void | undefined> */ js.Any
    ): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    inline def pointerEvents(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'pointerEvents' extends react-native.react-native.Animated.NonAnimatedProps ? 'pointerEvents' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<'box-none' | 'none' | 'box-only' | 'auto' | undefined> : 'box-none' | 'none' | 'box-only' | 'auto' | undefined : react-native.react-native.Animated.WithAnimatedValue<'box-none' | 'none' | 'box-only' | 'auto' | undefined> */ js.Any
    ): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def pressRetentionOffset(value: Insets): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def removeClippedSubviews(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'removeClippedSubviews' extends react-native.react-native.Animated.NonAnimatedProps ? 'removeClippedSubviews' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<boolean | undefined> : boolean | undefined : react-native.react-native.Animated.WithAnimatedValue<boolean | undefined> */ js.Any
    ): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def renderToHardwareTextureAndroid(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'renderToHardwareTextureAndroid' extends react-native.react-native.Animated.NonAnimatedProps ? 'renderToHardwareTextureAndroid' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<boolean | undefined> : boolean | undefined : react-native.react-native.Animated.WithAnimatedValue<boolean | undefined> */ js.Any
    ): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def rippleCentered(value: Boolean): this.type = set("rippleCentered", value.asInstanceOf[js.Any])
    
    inline def rippleColor(value: String): this.type = set("rippleColor", value.asInstanceOf[js.Any])
    
    inline def rippleContainerBorderRadius(value: Double): this.type = set("rippleContainerBorderRadius", value.asInstanceOf[js.Any])
    
    inline def rippleDuration(value: Double): this.type = set("rippleDuration", value.asInstanceOf[js.Any])
    
    inline def rippleFades(value: Boolean): this.type = set("rippleFades", value.asInstanceOf[js.Any])
    
    inline def rippleOpacity(value: Double): this.type = set("rippleOpacity", value.asInstanceOf[js.Any])
    
    inline def rippleSequential(value: Boolean): this.type = set("rippleSequential", value.asInstanceOf[js.Any])
    
    inline def rippleSize(value: Double): this.type = set("rippleSize", value.asInstanceOf[js.Any])
    
    inline def shouldRasterizeIOS(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'shouldRasterizeIOS' extends react-native.react-native.Animated.NonAnimatedProps ? 'shouldRasterizeIOS' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<boolean | undefined> : boolean | undefined : react-native.react-native.Animated.WithAnimatedValue<boolean | undefined> */ js.Any
    ): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def tvParallaxMagnification(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'tvParallaxMagnification' extends react-native.react-native.Animated.NonAnimatedProps ? 'tvParallaxMagnification' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<number | undefined> : number | undefined : react-native.react-native.Animated.WithAnimatedValue<number | undefined> */ js.Any
    ): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'tvParallaxProperties' extends react-native.react-native.Animated.NonAnimatedProps ? 'tvParallaxProperties' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<react-native.react-native.TVParallaxProperties | undefined> : react-native.react-native.TVParallaxProperties | undefined : react-native.react-native.Animated.WithAnimatedValue<react-native.react-native.TVParallaxProperties | undefined> */ js.Any
    ): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'tvParallaxShiftDistanceX' extends react-native.react-native.Animated.NonAnimatedProps ? 'tvParallaxShiftDistanceX' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<number | undefined> : number | undefined : react-native.react-native.Animated.WithAnimatedValue<number | undefined> */ js.Any
    ): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'tvParallaxShiftDistanceY' extends react-native.react-native.Animated.NonAnimatedProps ? 'tvParallaxShiftDistanceY' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<number | undefined> : number | undefined : react-native.react-native.Animated.WithAnimatedValue<number | undefined> */ js.Any
    ): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'tvParallaxTiltAngle' extends react-native.react-native.Animated.NonAnimatedProps ? 'tvParallaxTiltAngle' extends 'ref' ? react-native.react-native.Animated.TAugmentRef<number | undefined> : number | undefined : react-native.react-native.Animated.WithAnimatedValue<number | undefined> */ js.Any
    ): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeMaterialRipple.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RippleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
