package typingsJapgolly.reactNativeVectorIcons.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextLayoutEventData
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.all
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.assertive
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.auto
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.balanced
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.clip
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.email
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.full
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.head
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.highQuality
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.link
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.middle
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.no
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.none
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.normal
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.phoneNumber
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.polite
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.simple
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.tail
import typingsJapgolly.reactNativeVectorIcons.reactNativeVectorIconsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_FontAwesome5IconProps_1260805263[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
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
  
  inline def adjustsFontSizeToFit(value: Boolean): this.type = set("adjustsFontSizeToFit", value.asInstanceOf[js.Any])
  
  inline def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
  
  inline def android_hyphenationFrequency(value: normal | none | full): this.type = set("android_hyphenationFrequency", value.asInstanceOf[js.Any])
  
  inline def brand(value: Boolean): this.type = set("brand", value.asInstanceOf[js.Any])
  
  inline def color(value: ColorValue | Double): this.type = set("color", value.asInstanceOf[js.Any])
  
  inline def dataDetectorType(value: phoneNumber | link | email | none | all): this.type = set("dataDetectorType", value.asInstanceOf[js.Any])
  
  inline def dataDetectorTypeNull: this.type = set("dataDetectorType", null)
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def ellipsizeMode(value: head | middle | tail | clip): this.type = set("ellipsizeMode", value.asInstanceOf[js.Any])
  
  inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
  
  inline def light(value: Boolean): this.type = set("light", value.asInstanceOf[js.Any])
  
  inline def lineBreakMode(value: head | middle | tail | clip): this.type = set("lineBreakMode", value.asInstanceOf[js.Any])
  
  inline def maxFontSizeMultiplier(value: Double): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
  
  inline def maxFontSizeMultiplierNull: this.type = set("maxFontSizeMultiplier", null)
  
  inline def minimumFontScale(value: Double): this.type = set("minimumFontScale", value.asInstanceOf[js.Any])
  
  inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
  
  inline def numberOfLines(value: Double): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
  
  inline def onAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
  
  inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
  
  inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
  
  inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
  
  inline def onLongPress(value: /* event */ GestureResponderEvent => Callback): this.type = set("onLongPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
  
  inline def onPress(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onPressIn(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPressIn", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onPressOut(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPressOut", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
  
  inline def onTextLayout(value: /* event */ NativeSyntheticEvent[TextLayoutEventData] => Callback): this.type = set("onTextLayout", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[TextLayoutEventData]) => value(t0).runNow()))
  
  inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
  
  inline def selectionColor(value: ColorValue): this.type = set("selectionColor", value.asInstanceOf[js.Any])
  
  inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  
  inline def solid(value: Boolean): this.type = set("solid", value.asInstanceOf[js.Any])
  
  inline def style(value: StyleProp[TextStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def suppressHighlighting(value: Boolean): this.type = set("suppressHighlighting", value.asInstanceOf[js.Any])
  
  inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  
  inline def textBreakStrategy(value: simple | highQuality | balanced): this.type = set("textBreakStrategy", value.asInstanceOf[js.Any])
}
