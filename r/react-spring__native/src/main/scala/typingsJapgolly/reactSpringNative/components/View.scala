package typingsJapgolly.reactSpringNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.PointerEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactSpringNative.anon.ViewPropschildrenReactNod
import typingsJapgolly.reactSpringNative.reactSpringNativeStrings.`box-none`
import typingsJapgolly.reactSpringNative.reactSpringNativeStrings.`box-only`
import typingsJapgolly.reactSpringNative.reactSpringNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactSpringNative.reactSpringNativeStrings.assertive
import typingsJapgolly.reactSpringNative.reactSpringNativeStrings.auto
import typingsJapgolly.reactSpringNative.reactSpringNativeStrings.no
import typingsJapgolly.reactSpringNative.reactSpringNativeStrings.none
import typingsJapgolly.reactSpringNative.reactSpringNativeStrings.polite
import typingsJapgolly.reactSpringNative.reactSpringNativeStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object View {
  
  @JSImport("@react-spring/native/dist/declarations/src/primitives", "primitives.View")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.reactSpringNative.distDeclarationsSrcPrimitivesMod.primitives.View
        ] {
    
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
    
    inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
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
    
    inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: View.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ViewPropschildrenReactNod): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
