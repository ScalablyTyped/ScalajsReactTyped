package typingsJapgolly.reactNativeMaterialKit.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`box-none`
import typingsJapgolly.reactNative.reactNativeStrings.`box-only`
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.yes
import typingsJapgolly.reactNativeMaterialKit.mod.MKButtonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MKButton {
  
  @JSImport("react-native-material-kit", "MKButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialKit.mod.MKButton] {
    
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
    
    inline def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    inline def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
    
    inline def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def fab(value: Boolean): this.type = set("fab", value.asInstanceOf[js.Any])
    
    inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def maskBorderRadius(value: Double): this.type = set("maskBorderRadius", value.asInstanceOf[js.Any])
    
    inline def maskBorderRadiusInPercent(value: Double): this.type = set("maskBorderRadiusInPercent", value.asInstanceOf[js.Any])
    
    inline def maskColor(value: String): this.type = set("maskColor", value.asInstanceOf[js.Any])
    
    inline def maskDuration(value: Double): this.type = set("maskDuration", value.asInstanceOf[js.Any])
    
    inline def maskEnabled(value: Boolean): this.type = set("maskEnabled", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onBlur(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onLayout(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onLongPress(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onLongPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMoveShouldSetResponder(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onPointerCancel(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerCancelCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerCancelCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerDown(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerDownCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerDownCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerEnter(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerEnterCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerEnterCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerLeave(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerLeaveCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerLeaveCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerMove(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerMoveCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerMoveCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerUp(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerUpCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerUpCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPress(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPressIn(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPressIn", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPressOut(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPressOut", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderEnd(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderGrant(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderGrant", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderMove(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderReject(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderReject", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderRelease(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderRelease", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderStart(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderTerminate(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderTerminate", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderTerminationRequest(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponder(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onTouchCancel(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTouchEndCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def pressRetentionOffset(value: Insets): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def rippleColor(value: String): this.type = set("rippleColor", value.asInstanceOf[js.Any])
    
    inline def rippleDuration(value: Double): this.type = set("rippleDuration", value.asInstanceOf[js.Any])
    
    inline def rippleLocation(value: typingsJapgolly.reactNativeMaterialKit.mod.MKPropTypes.rippleLocation): this.type = set("rippleLocation", value.asInstanceOf[js.Any])
    
    inline def shadowAniEnabled(value: Boolean): this.type = set("shadowAniEnabled", value.asInstanceOf[js.Any])
    
    inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MKButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MKButtonProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
