package typingsJapgolly.reactNativeVectorIcons.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.BackgroundPropType
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.TargetedEvent
import typingsJapgolly.reactNative.mod.TextLayoutEventData
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeVectorIcons.anon.KinFontAwesome5IconVarian
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

object FontAwesome5IconButton {
  
  inline def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[KinFontAwesome5IconVarian]))
  }
  
  @JSImport("react-native-vector-icons/FontAwesome5", "FontAwesome5IconButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconButton] {
    
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
    
    inline def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    
    inline def adjustsFontSizeToFit(value: Boolean): this.type = set("adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    inline def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def android_hyphenationFrequency(value: normal | none | full): this.type = set("android_hyphenationFrequency", value.asInstanceOf[js.Any])
    
    inline def background(value: BackgroundPropType): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: ColorValue | Double): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def brand(value: Boolean): this.type = set("brand", value.asInstanceOf[js.Any])
    
    inline def color(value: ColorValue | Double): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def dataDetectorType(value: phoneNumber | link | email | none | all): this.type = set("dataDetectorType", value.asInstanceOf[js.Any])
    
    inline def dataDetectorTypeNull: this.type = set("dataDetectorType", null)
    
    inline def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    inline def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
    
    inline def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def ellipsizeMode(value: head | middle | tail | clip): this.type = set("ellipsizeMode", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def iconStyle(value: TextStyle): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def light(value: Boolean): this.type = set("light", value.asInstanceOf[js.Any])
    
    inline def lineBreakMode(value: head | middle | tail | clip): this.type = set("lineBreakMode", value.asInstanceOf[js.Any])
    
    inline def maxFontSizeMultiplier(value: Double): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def maxFontSizeMultiplierNull: this.type = set("maxFontSizeMultiplier", null)
    
    inline def minimumFontScale(value: Double): this.type = set("minimumFontScale", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def nextFocusDown(value: Double): this.type = set("nextFocusDown", value.asInstanceOf[js.Any])
    
    inline def nextFocusForward(value: Double): this.type = set("nextFocusForward", value.asInstanceOf[js.Any])
    
    inline def nextFocusLeft(value: Double): this.type = set("nextFocusLeft", value.asInstanceOf[js.Any])
    
    inline def nextFocusRight(value: Double): this.type = set("nextFocusRight", value.asInstanceOf[js.Any])
    
    inline def nextFocusUp(value: Double): this.type = set("nextFocusUp", value.asInstanceOf[js.Any])
    
    inline def numberOfLines(value: Double): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
    
    inline def onFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
    
    inline def onHideUnderlay(value: Callback): this.type = set("onHideUnderlay", value.toJsFn)
    
    inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def onLongPress(value: /* event */ GestureResponderEvent => Callback): this.type = set("onLongPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onPress(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onPressIn(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPressIn", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onPressOut(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPressOut", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onShowUnderlay(value: Callback): this.type = set("onShowUnderlay", value.toJsFn)
    
    inline def onTextLayout(value: /* event */ NativeSyntheticEvent[TextLayoutEventData] => Callback): this.type = set("onTextLayout", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[TextLayoutEventData]) => value(t0).runNow()))
    
    inline def pressRetentionOffset(value: Insets): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def selectionColor(value: ColorValue): this.type = set("selectionColor", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def solid(value: Boolean): this.type = set("solid", value.asInstanceOf[js.Any])
    
    inline def style(value: ViewStyle | TextStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suppressHighlighting(value: Boolean): this.type = set("suppressHighlighting", value.asInstanceOf[js.Any])
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def textBreakStrategy(value: simple | highQuality | balanced): this.type = set("textBreakStrategy", value.asInstanceOf[js.Any])
    
    inline def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def underlayColor(value: ColorValue): this.type = set("underlayColor", value.asInstanceOf[js.Any])
    
    inline def useForeground(value: Boolean): this.type = set("useForeground", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: KinFontAwesome5IconVarian): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
