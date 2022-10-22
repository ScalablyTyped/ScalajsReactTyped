package typingsJapgolly.reactNativeGestureHandler.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.DrawerSlideEvent
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.PointerEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.anon.DrawerLayoutAndroidPropsc
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HandlerStateChangeEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`box-none`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`box-only`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-closed`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-open`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`on-drag`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.assertive
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.auto
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.left
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.no
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.none
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.polite
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.right
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.unlocked
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.yes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawerLayoutAndroid {
  
  inline def apply(hitSlop: js.UndefOr[Insets] & js.UndefOr[HitSlop], renderNavigationView: CallbackTo[Element]): Builder = {
    val __props = js.Dynamic.literal(hitSlop = hitSlop.asInstanceOf[js.Any], renderNavigationView = renderNavigationView.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[DrawerLayoutAndroidPropsc]))
  }
  
  @JSImport("react-native-gesture-handler", "DrawerLayoutAndroid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[ComponentType[Any] & js.Object] {
    
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
    
    inline def cancelsTouchesInView(value: Boolean): this.type = set("cancelsTouchesInView", value.asInstanceOf[js.Any])
    
    inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    inline def disallowInterruption(value: Boolean): this.type = set("disallowInterruption", value.asInstanceOf[js.Any])
    
    inline def drawerBackgroundColor(value: ColorValue): this.type = set("drawerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def drawerLockMode(value: unlocked | `locked-closed` | `locked-open`): this.type = set("drawerLockMode", value.asInstanceOf[js.Any])
    
    inline def drawerPosition(value: left | right): this.type = set("drawerPosition", value.asInstanceOf[js.Any])
    
    inline def drawerWidth(value: Double): this.type = set("drawerWidth", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def keyboardDismissMode(value: none | `on-drag`): this.type = set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onActivated(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onActivated", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onBegan(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onBegan", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onCancelled(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onCancelled", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onDrawerClose(value: Callback): this.type = set("onDrawerClose", value.toJsFn)
    
    inline def onDrawerOpen(value: Callback): this.type = set("onDrawerOpen", value.toJsFn)
    
    inline def onDrawerSlide(value: /* event */ DrawerSlideEvent => Callback): this.type = set("onDrawerSlide", js.Any.fromFunction1((t0: /* event */ DrawerSlideEvent) => value(t0).runNow()))
    
    inline def onDrawerStateChanged(value: /* event */ Idle | Dragging | Settling => Callback): this.type = set("onDrawerStateChanged", js.Any.fromFunction1((t0: /* event */ Idle | Dragging | Settling) => value(t0).runNow()))
    
    inline def onEnded(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onFailed(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onFailed", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onGestureEvent(value: /* event */ GestureEvent[NativeViewGestureHandlerPayload] => Callback): this.type = set("onGestureEvent", js.Any.fromFunction1((t0: /* event */ GestureEvent[NativeViewGestureHandlerPayload]) => value(t0).runNow()))
    
    inline def onHandlerStateChange(value: /* event */ HandlerStateChangeEvent[NativeViewGestureHandlerPayload] => Callback): this.type = set("onHandlerStateChange", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[NativeViewGestureHandlerPayload]) => value(t0).runNow()))
    
    inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onPointerCancel(value: /* event */ PointerEvent => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerCancelCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerCancelCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerDown(value: /* event */ PointerEvent => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerDownCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerDownCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerEnter(value: /* event */ PointerEvent => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerEnterCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerEnterCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerLeave(value: /* event */ PointerEvent => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerLeaveCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerLeaveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerMove(value: /* event */ PointerEvent => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerMoveCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerMoveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerUp(value: /* event */ PointerEvent => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerUpCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerUpCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onResponderEnd(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderGrant(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderGrant", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderMove(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderReject(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderReject", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderRelease(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderRelease", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderStart(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderTerminate(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderTerminate", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onTouchCancel(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchEnd(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchEndCapture(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchMove(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchStart(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def shouldActivateOnStart(value: Boolean): this.type = set("shouldActivateOnStart", value.asInstanceOf[js.Any])
    
    inline def shouldCancelWhenOutside(value: Boolean): this.type = set("shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def simultaneousHandlers(value: Ref[Any] | js.Array[Ref[Any]]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def simultaneousHandlersFunction1(value: Any | Null => Callback): this.type = set("simultaneousHandlers", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def simultaneousHandlersNull: this.type = set("simultaneousHandlers", null)
    
    inline def simultaneousHandlersVarargs(value: Ref[Any]*): this.type = set("simultaneousHandlers", js.Array(value*))
    
    inline def statusBarBackgroundColor(value: ColorValue): this.type = set("statusBarBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def waitFor(value: Ref[Any] | js.Array[Ref[Any]]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    
    inline def waitForFunction1(value: Any | Null => Callback): this.type = set("waitFor", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def waitForNull: this.type = set("waitFor", null)
    
    inline def waitForVarargs(value: Ref[Any]*): this.type = set("waitFor", js.Array(value*))
  }
  
  def withProps(p: DrawerLayoutAndroidPropsc): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
