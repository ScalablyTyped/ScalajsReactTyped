package typingsJapgolly.reactNativeInputSpinner.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextProps
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeInputSpinner.mod.ReactNativeInputSpinnerProps
import typingsJapgolly.reactNativeInputSpinner.mod.default
import typingsJapgolly.reactNativeInputSpinner.reactNativeInputSpinnerStrings.clean
import typingsJapgolly.reactNativeInputSpinner.reactNativeInputSpinnerStrings.modern
import typingsJapgolly.reactNativeInputSpinner.reactNativeInputSpinnerStrings.paper
import typingsJapgolly.reactNativeInputSpinner.reactNativeInputSpinnerStrings.round
import typingsJapgolly.reactNativeInputSpinner.reactNativeInputSpinnerStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeInputSpinner {
  
  @JSImport("react-native-input-spinner", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def accelerationDelay(value: Double): this.type = set("accelerationDelay", value.asInstanceOf[js.Any])
    
    inline def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    
    inline def append(value: VdomElement): this.type = set("append", value.rawElement.asInstanceOf[js.Any])
    
    inline def arrows(value: Boolean): this.type = set("arrows", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def background(value: String): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def buttonFontFamily(value: String): this.type = set("buttonFontFamily", value.asInstanceOf[js.Any])
    
    inline def buttonFontSize(value: Double): this.type = set("buttonFontSize", value.asInstanceOf[js.Any])
    
    inline def buttonLeftDisabled(value: Boolean): this.type = set("buttonLeftDisabled", value.asInstanceOf[js.Any])
    
    inline def buttonLeftImage(value: VdomElement): this.type = set("buttonLeftImage", value.rawElement.asInstanceOf[js.Any])
    
    inline def buttonLeftText(value: String): this.type = set("buttonLeftText", value.asInstanceOf[js.Any])
    
    inline def buttonPressLeftImage(value: VdomElement): this.type = set("buttonPressLeftImage", value.rawElement.asInstanceOf[js.Any])
    
    inline def buttonPressRightImage(value: VdomElement): this.type = set("buttonPressRightImage", value.rawElement.asInstanceOf[js.Any])
    
    inline def buttonPressStyle(value: StyleProp[ViewStyle]): this.type = set("buttonPressStyle", value.asInstanceOf[js.Any])
    
    inline def buttonPressStyleNull: this.type = set("buttonPressStyle", null)
    
    inline def buttonPressTextStyle(value: StyleProp[ViewStyle]): this.type = set("buttonPressTextStyle", value.asInstanceOf[js.Any])
    
    inline def buttonPressTextStyleNull: this.type = set("buttonPressTextStyle", null)
    
    inline def buttonRightDisabled(value: Boolean): this.type = set("buttonRightDisabled", value.asInstanceOf[js.Any])
    
    inline def buttonRightImage(value: VdomElement): this.type = set("buttonRightImage", value.rawElement.asInstanceOf[js.Any])
    
    inline def buttonRightText(value: String): this.type = set("buttonRightText", value.asInstanceOf[js.Any])
    
    inline def buttonStyle(value: StyleProp[ViewStyle]): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    
    inline def buttonStyleNull: this.type = set("buttonStyle", null)
    
    inline def buttonTextColor(value: String): this.type = set("buttonTextColor", value.asInstanceOf[js.Any])
    
    inline def buttonTextProps(value: TextProps): this.type = set("buttonTextProps", value.asInstanceOf[js.Any])
    
    inline def buttonTextStyle(value: StyleProp[ViewStyle]): this.type = set("buttonTextStyle", value.asInstanceOf[js.Any])
    
    inline def buttonTextStyleNull: this.type = set("buttonTextStyle", null)
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colorAsBackground(value: Boolean): this.type = set("colorAsBackground", value.asInstanceOf[js.Any])
    
    inline def colorLeft(value: String): this.type = set("colorLeft", value.asInstanceOf[js.Any])
    
    inline def colorMax(value: String): this.type = set("colorMax", value.asInstanceOf[js.Any])
    
    inline def colorMin(value: String): this.type = set("colorMin", value.asInstanceOf[js.Any])
    
    inline def colorPress(value: String): this.type = set("colorPress", value.asInstanceOf[js.Any])
    
    inline def colorRight(value: String): this.type = set("colorRight", value.asInstanceOf[js.Any])
    
    inline def containerProps(value: js.Object): this.type = set("containerProps", value.asInstanceOf[js.Any])
    
    inline def continuity(value: Boolean): this.type = set("continuity", value.asInstanceOf[js.Any])
    
    inline def decimalSeparator(value: String): this.type = set("decimalSeparator", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def editable(value: Boolean): this.type = set("editable", value.asInstanceOf[js.Any])
    
    inline def emptied(value: Boolean): this.type = set("emptied", value.asInstanceOf[js.Any])
    
    inline def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def initialValue(value: String | Double): this.type = set("initialValue", value.asInstanceOf[js.Any])
    
    inline def inputProps(value: js.Object): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def inputStyle(value: StyleProp[ViewStyle]): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    inline def inputStyleNull: this.type = set("inputStyle", null)
    
    inline def leftButtonProps(value: js.Object): this.type = set("leftButtonProps", value.asInstanceOf[js.Any])
    
    inline def longStep(value: String | Double): this.type = set("longStep", value.asInstanceOf[js.Any])
    
    inline def max(value: String | Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def min(value: String | Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* repeated */ Any => Any): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    inline def onChange(value: /* repeated */ Any => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onDecrease(value: /* repeated */ Any => Any): this.type = set("onDecrease", js.Any.fromFunction1(value))
    
    inline def onFocus(value: /* repeated */ Any => Any): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    inline def onIncrease(value: /* repeated */ Any => Any): this.type = set("onIncrease", js.Any.fromFunction1(value))
    
    inline def onKeyPress(value: /* repeated */ Any => Any): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    inline def onLongPress(value: /* repeated */ Any => Any): this.type = set("onLongPress", js.Any.fromFunction1(value))
    
    inline def onMax(value: /* repeated */ Any => Any): this.type = set("onMax", js.Any.fromFunction1(value))
    
    inline def onMin(value: /* repeated */ Any => Any): this.type = set("onMin", js.Any.fromFunction1(value))
    
    inline def onSubmit(value: /* repeated */ Any => Any): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def placeholderTextColor(value: String): this.type = set("placeholderTextColor", value.asInstanceOf[js.Any])
    
    inline def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
    
    inline def prepend(value: VdomElement): this.type = set("prepend", value.rawElement.asInstanceOf[js.Any])
    
    inline def returnKeyLabel(value: String): this.type = set("returnKeyLabel", value.asInstanceOf[js.Any])
    
    inline def returnKeyType(value: String): this.type = set("returnKeyType", value.asInstanceOf[js.Any])
    
    inline def rightButtonProps(value: js.Object): this.type = set("rightButtonProps", value.asInstanceOf[js.Any])
    
    inline def rounded(value: Boolean): this.type = set("rounded", value.asInstanceOf[js.Any])
    
    inline def selectTextOnFocus(value: Boolean): this.type = set("selectTextOnFocus", value.asInstanceOf[js.Any])
    
    inline def selectionColor(value: String): this.type = set("selectionColor", value.asInstanceOf[js.Any])
    
    inline def shadow(value: Boolean): this.type = set("shadow", value.asInstanceOf[js.Any])
    
    inline def showBorder(value: Boolean): this.type = set("showBorder", value.asInstanceOf[js.Any])
    
    inline def skin(value: clean | modern | paper | round | square): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    
    inline def step(value: String | Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def typingTime(value: Double): this.type = set("typingTime", value.asInstanceOf[js.Any])
    
    inline def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeInputSpinner.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactNativeInputSpinnerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
