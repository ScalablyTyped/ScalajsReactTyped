package typingsJapgolly.reactNativeWindows.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeWindows.reactNativeWindowsInts.`10`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsInts.`12`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsInts.`15`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsInts.`1`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsInts.`20`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsInts.`2`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsInts.`30`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsInts.`3`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsInts.`4`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsInts.`5`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsInts.`6`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`box-none`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`box-only`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`inline`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.assertive
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.auto
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.compact
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.date
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.datetime
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.no
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.none
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.polite
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.spinner
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.time
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.yes
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityActionInfo
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityRole
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityState
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityValue
import typingsJapgolly.reactNativeWindows.rntypesMod.DatePickerIOSProps
import typingsJapgolly.reactNativeWindows.rntypesMod.Insets
import typingsJapgolly.reactNativeWindows.rntypesMod.NodeHandle
import typingsJapgolly.reactNativeWindows.rntypesMod.StyleProp
import typingsJapgolly.reactNativeWindows.rntypesMod.TVParallaxProperties
import typingsJapgolly.reactNativeWindows.rntypesMod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePickerIOS {
  
  inline def apply(onDateChange: js.Date => Callback): Builder = {
    val __props = js.Dynamic.literal(onDateChange = js.Any.fromFunction1((t0: js.Date) => onDateChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[DatePickerIOSProps]))
  }
  
  @JSImport("react-native-windows", "DatePickerIOS")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeWindows.mod.DatePickerIOS] {
    
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
    
    inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    inline def date(value: js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    
    inline def dateNull: this.type = set("date", null)
    
    inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def initialDate(value: js.Date): this.type = set("initialDate", value.asInstanceOf[js.Any])
    
    inline def initialDateNull: this.type = set("initialDate", null)
    
    inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maximumDate(value: js.Date): this.type = set("maximumDate", value.asInstanceOf[js.Any])
    
    inline def minimumDate(value: js.Date): this.type = set("minimumDate", value.asInstanceOf[js.Any])
    
    inline def minuteInterval(value: `1` | `2` | `3` | `4` | `5` | `6` | `10` | `12` | `15` | `20` | `30`): this.type = set("minuteInterval", value.asInstanceOf[js.Any])
    
    inline def mode(value: date | time | datetime): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onLayout(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMoveShouldSetResponder(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
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
    
    inline def pickerStyle(value: compact | spinner | `inline`): this.type = set("pickerStyle", value.asInstanceOf[js.Any])
    
    inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def timeZoneOffsetInMinutes(value: Double): this.type = set("timeZoneOffsetInMinutes", value.asInstanceOf[js.Any])
    
    inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DatePickerIOSProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
