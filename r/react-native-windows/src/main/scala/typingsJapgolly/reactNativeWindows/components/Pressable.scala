package typingsJapgolly.reactNativeWindows.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`box-none`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`box-only`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.assertive
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.auto
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.no
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.none
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.polite
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.yes
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityActionInfo
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityRole
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityState
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityValue
import typingsJapgolly.reactNativeWindows.rntypesMod.Insets
import typingsJapgolly.reactNativeWindows.rntypesMod.NodeHandle
import typingsJapgolly.reactNativeWindows.rntypesMod.PressableAndroidRippleConfig
import typingsJapgolly.reactNativeWindows.rntypesMod.PressableProps
import typingsJapgolly.reactNativeWindows.rntypesMod.PressableStateCallbackType
import typingsJapgolly.reactNativeWindows.rntypesMod.StyleProp
import typingsJapgolly.reactNativeWindows.rntypesMod.TVParallaxProperties
import typingsJapgolly.reactNativeWindows.rntypesMod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pressable {
  
  @JSImport("react-native-windows", "Pressable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeWindows.rntypesMod.View] {
    
    inline def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value*))
    
    inline def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    inline def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    inline def android_disableSound(value: Boolean): this.type = set("android_disableSound", value.asInstanceOf[js.Any])
    
    inline def android_disableSoundNull: this.type = set("android_disableSound", null)
    
    inline def android_ripple(value: PressableAndroidRippleConfig): this.type = set("android_ripple", value.asInstanceOf[js.Any])
    
    inline def android_rippleNull: this.type = set("android_ripple", null)
    
    inline def cancelable(value: Boolean): this.type = set("cancelable", value.asInstanceOf[js.Any])
    
    inline def cancelableNull: this.type = set("cancelable", null)
    
    inline def children(value: Node | (js.Function1[/* state */ PressableStateCallbackType, Node])): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* state */ PressableStateCallbackType => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    inline def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    inline def delayLongPressNull: this.type = set("delayLongPress", null)
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledNull: this.type = set("disabled", null)
    
    inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets | Double): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def hitSlopNull: this.type = set("hitSlop", null)
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onBlur(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onBlurNull: this.type = set("onBlur", null)
    
    inline def onFocus(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onFocusNull: this.type = set("onFocus", null)
    
    inline def onLayout(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLongPress(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onLongPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLongPressNull: this.type = set("onLongPress", null)
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMoveShouldSetResponder(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onPress(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPressIn(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPressIn", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPressInNull: this.type = set("onPressIn", null)
    
    inline def onPressNull: this.type = set("onPress", null)
    
    inline def onPressOut(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPressOut", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPressOutNull: this.type = set("onPressOut", null)
    
    inline def onResponderEnd(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderGrant(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderGrant", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderMove(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderReject(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderReject", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderRelease(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderRelease", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderStart(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderTerminate(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderTerminate", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderTerminationRequest(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponder(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onTouchCancel(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchEndCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def pressRetentionOffset(value: Insets | Double): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def pressRetentionOffsetNull: this.type = set("pressRetentionOffset", null)
    
    inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def style(
      value: StyleProp[ViewStyle] | (js.Function1[/* state */ PressableStateCallbackType, StyleProp[ViewStyle]])
    ): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleFunction1(value: /* state */ PressableStateCallbackType => StyleProp[ViewStyle]): this.type = set("style", js.Any.fromFunction1(value))
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def testOnly_pressed(value: Boolean): this.type = set("testOnly_pressed", value.asInstanceOf[js.Any])
    
    inline def testOnly_pressedNull: this.type = set("testOnly_pressed", null)
    
    inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Pressable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PressableProps & RefAttributes[typingsJapgolly.reactNativeWindows.rntypesMod.View]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
