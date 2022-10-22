package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.yes
import typingsJapgolly.tuyaPanelKit.anon.BgColor
import typingsJapgolly.tuyaPanelKit.mod.ButtonProps
import typingsJapgolly.tuyaPanelKit.themeMod.BackgroundProps
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.large
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.left
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.noSet
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.normal
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.primary
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.right
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.small
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Button {
  
  @JSImport("tuya-panel-kit", "Button")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.Button] {
    
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
    
    inline def background(value: BackgroundProps): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def badgeAccessibilityLabel(value: String): this.type = set("badgeAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def badgeStyle(value: StyleProp[ViewStyle]): this.type = set("badgeStyle", value.asInstanceOf[js.Any])
    
    inline def badgeStyleNull: this.type = set("badgeStyle", null)
    
    inline def badgeText(value: String): this.type = set("badgeText", value.asInstanceOf[js.Any])
    
    inline def badgeTextAccessibilityLabel(value: String): this.type = set("badgeTextAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def badgeTextStyle(value: StyleProp[TextStyle]): this.type = set("badgeTextStyle", value.asInstanceOf[js.Any])
    
    inline def badgeTextStyleNull: this.type = set("badgeTextStyle", null)
    
    inline def border(value: String | Boolean | Double): this.type = set("border", value.asInstanceOf[js.Any])
    
    inline def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    inline def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
    
    inline def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledOpacity(value: Double): this.type = set("disabledOpacity", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconColor(value: String): this.type = set("iconColor", value.asInstanceOf[js.Any])
    
    inline def iconPath(value: String): this.type = set("iconPath", value.asInstanceOf[js.Any])
    
    inline def iconSize(value: Double): this.type = set("iconSize", value.asInstanceOf[js.Any])
    
    inline def image(value: String): this.type = set("image", value.asInstanceOf[js.Any])
    
    inline def imageColor(value: String): this.type = set("imageColor", value.asInstanceOf[js.Any])
    
    inline def imageStyle(value: StyleProp[ImageStyle]): this.type = set("imageStyle", value.asInstanceOf[js.Any])
    
    inline def imageStyleNull: this.type = set("imageStyle", null)
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def nextFocusDown(value: Double): this.type = set("nextFocusDown", value.asInstanceOf[js.Any])
    
    inline def nextFocusForward(value: Double): this.type = set("nextFocusForward", value.asInstanceOf[js.Any])
    
    inline def nextFocusLeft(value: Double): this.type = set("nextFocusLeft", value.asInstanceOf[js.Any])
    
    inline def nextFocusRight(value: Double): this.type = set("nextFocusRight", value.asInstanceOf[js.Any])
    
    inline def nextFocusUp(value: Double): this.type = set("nextFocusUp", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onBlur(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onLayout(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onLongPress(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onLongPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onPress(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPressIn(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPressIn", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPressOut(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPressOut", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def pressRetentionOffset(value: Insets): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def size(value: large | normal | small | noSet | Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def stretch(value: Boolean): this.type = set("stretch", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    
    inline def textAccessibilityLabel(value: String): this.type = set("textAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def textDirection(value: left | top | right | bottom | center): this.type = set("textDirection", value.asInstanceOf[js.Any])
    
    inline def textSingleLine(value: Boolean): this.type = set("textSingleLine", value.asInstanceOf[js.Any])
    
    inline def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def textStyleNull: this.type = set("textStyle", null)
    
    inline def theme(value: BgColor): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def `type`(value: primary | normal): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def useART(value: Boolean): this.type = set("useART", value.asInstanceOf[js.Any])
    
    inline def wrapperStyle(value: StyleProp[ViewStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  implicit def make(companion: Button.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
