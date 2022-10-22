package typingsJapgolly.reactNativeMaterialDropdown.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.yes
import typingsJapgolly.reactNativeMaterialDropdown.anon.PartialDropDownPropsAbsoluteRTLLayout
import typingsJapgolly.reactNativeMaterialDropdown.mod.DropDownData
import typingsJapgolly.reactNativeMaterialDropdown.mod.DropDownInsets
import typingsJapgolly.reactNativeMaterialDropdown.mod.DropDownMargins
import typingsJapgolly.reactNativeMaterialDropdown.mod.DropDownOffset
import typingsJapgolly.reactNativeMaterialDropdown.mod.DropDownProps
import typingsJapgolly.reactNativeMaterialDropdown.mod.RenderBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  inline def apply(data: js.Array[DropDownData]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DropDownProps]))
  }
  
  @JSImport("react-native-material-dropdown", "Dropdown")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialDropdown.mod.Dropdown] {
    
    inline def absoluteRTLLayout(value: Boolean): this.type = set("absoluteRTLLayout", value.asInstanceOf[js.Any])
    
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
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def baseColor(value: String): this.type = set("baseColor", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    inline def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
    
    inline def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledItemColor(value: String): this.type = set("disabledItemColor", value.asInstanceOf[js.Any])
    
    inline def dropdownMargins(value: DropDownMargins): this.type = set("dropdownMargins", value.asInstanceOf[js.Any])
    
    inline def dropdownOffset(value: DropDownOffset): this.type = set("dropdownOffset", value.asInstanceOf[js.Any])
    
    inline def dropdownPosition(value: Double): this.type = set("dropdownPosition", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: DropDownInsets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def inputContainerStyle(value: StyleProp[ViewStyle]): this.type = set("inputContainerStyle", value.asInstanceOf[js.Any])
    
    inline def inputContainerStyleNull: this.type = set("inputContainerStyle", null)
    
    inline def itemColor(value: String): this.type = set("itemColor", value.asInstanceOf[js.Any])
    
    inline def itemCount(value: Double): this.type = set("itemCount", value.asInstanceOf[js.Any])
    
    inline def itemPadding(value: Double): this.type = set("itemPadding", value.asInstanceOf[js.Any])
    
    inline def itemTextStyle(value: StyleProp[TextStyle]): this.type = set("itemTextStyle", value.asInstanceOf[js.Any])
    
    inline def itemTextStyleNull: this.type = set("itemTextStyle", null)
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): this.type = set("labelExtractor", js.Any.fromFunction2(value))
    
    inline def labelFontSize(value: Double): this.type = set("labelFontSize", value.asInstanceOf[js.Any])
    
    inline def labelTextStyle(value: StyleProp[TextStyle]): this.type = set("labelTextStyle", value.asInstanceOf[js.Any])
    
    inline def labelTextStyleNull: this.type = set("labelTextStyle", null)
    
    inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onBlur(value: Callback): this.type = set("onBlur", value.toJsFn)
    
    inline def onChangeText(value: (/* value */ String, /* index */ Double, /* data */ js.Array[DropDownData]) => Callback): this.type = set("onChangeText", js.Any.fromFunction3((t0: /* value */ String, t1: /* index */ Double, t2: /* data */ js.Array[DropDownData]) => (value(t0, t1, t2)).runNow()))
    
    inline def onFocus(value: Callback): this.type = set("onFocus", value.toJsFn)
    
    inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def onLongPress(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onLongPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onPress(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPressIn(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPressIn", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPressOut(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPressOut", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def overlayStyle(value: StyleProp[ViewStyle]): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    inline def overlayStyleNull: this.type = set("overlayStyle", null)
    
    inline def pickerStyle(value: StyleProp[ViewStyle]): this.type = set("pickerStyle", value.asInstanceOf[js.Any])
    
    inline def pickerStyleNull: this.type = set("pickerStyle", null)
    
    inline def pressRetentionOffset(value: Insets): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def propsExtractor(value: (/* item */ DropDownData, /* index */ Double) => PartialDropDownPropsAbsoluteRTLLayout): this.type = set("propsExtractor", js.Any.fromFunction2(value))
    
    inline def renderAccessory(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): this.type = set("renderAccessory", value.toJsFn)
    
    inline def renderBase(value: /* props */ RenderBaseProps => typingsJapgolly.react.mod.global.JSX.Element): this.type = set("renderBase", js.Any.fromFunction1(value))
    
    inline def rippleCentered(value: Boolean): this.type = set("rippleCentered", value.asInstanceOf[js.Any])
    
    inline def rippleColor(value: String): this.type = set("rippleColor", value.asInstanceOf[js.Any])
    
    inline def rippleDuration(value: Double): this.type = set("rippleDuration", value.asInstanceOf[js.Any])
    
    inline def rippleInsets(value: DropDownInsets): this.type = set("rippleInsets", value.asInstanceOf[js.Any])
    
    inline def rippleOpacity(value: Double): this.type = set("rippleOpacity", value.asInstanceOf[js.Any])
    
    inline def rippleSequential(value: Boolean): this.type = set("rippleSequential", value.asInstanceOf[js.Any])
    
    inline def selectedItemColor(value: String): this.type = set("selectedItemColor", value.asInstanceOf[js.Any])
    
    inline def shadeOpacity(value: Double): this.type = set("shadeOpacity", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def supportedOrientations(value: js.Array[String]): this.type = set("supportedOrientations", value.asInstanceOf[js.Any])
    
    inline def supportedOrientationsVarargs(value: String*): this.type = set("supportedOrientations", js.Array(value*))
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
    
    inline def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
    
    inline def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): this.type = set("valueExtractor", js.Any.fromFunction2(value))
  }
  
  def withProps(p: DropDownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
