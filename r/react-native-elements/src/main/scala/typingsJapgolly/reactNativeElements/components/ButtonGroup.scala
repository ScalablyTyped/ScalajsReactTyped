package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.anon.Color
import typingsJapgolly.reactNativeElements.anon.RecursivePartialFullThemeAvatar
import typingsJapgolly.reactNativeElements.anon.TypeofComponent
import typingsJapgolly.reactNativeElements.distButtonsButtonGroupMod.ButtonGroupProps
import typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonGroup {
  
  inline def apply(
    replaceTheme: RecursivePartialFullThemeAvatar => Callback,
    theme: Theme[ButtonGroupProps],
    updateTheme: RecursivePartialFullThemeAvatar => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => replaceTheme(t0).runNow()), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => updateTheme(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[ButtonGroupProps & Partial[ThemeProps[ButtonGroupProps]]]))
  }
  
  @JSImport("react-native-elements/dist/buttons/ButtonGroup", "ButtonGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def Component(
      value: TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          japgolly.scalajs.react.facade.React.Component[js.Object, js.Object]
        ])
    ): this.type = set("Component", value.asInstanceOf[js.Any])
    
    inline def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    
    inline def button(value: js.Object): this.type = set("button", value.asInstanceOf[js.Any])
    
    inline def buttonContainerStyle(value: StyleProp[ViewStyle]): this.type = set("buttonContainerStyle", value.asInstanceOf[js.Any])
    
    inline def buttonContainerStyleNull: this.type = set("buttonContainerStyle", null)
    
    inline def buttonStyle(value: StyleProp[ViewStyle]): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    
    inline def buttonStyleNull: this.type = set("buttonStyle", null)
    
    inline def buttons(value: js.Array[String | Element]): this.type = set("buttons", value.asInstanceOf[js.Any])
    
    inline def buttonsVarargs(value: (String | Element)*): this.type = set("buttons", js.Array(value*))
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def disabled(value: Boolean | js.Array[Double]): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledSelectedStyle(value: StyleProp[ViewStyle]): this.type = set("disabledSelectedStyle", value.asInstanceOf[js.Any])
    
    inline def disabledSelectedStyleNull: this.type = set("disabledSelectedStyle", null)
    
    inline def disabledSelectedTextStyle(value: StyleProp[TextStyle]): this.type = set("disabledSelectedTextStyle", value.asInstanceOf[js.Any])
    
    inline def disabledSelectedTextStyleNull: this.type = set("disabledSelectedTextStyle", null)
    
    inline def disabledStyle(value: StyleProp[ViewStyle]): this.type = set("disabledStyle", value.asInstanceOf[js.Any])
    
    inline def disabledStyleNull: this.type = set("disabledStyle", null)
    
    inline def disabledTextStyle(value: StyleProp[TextStyle]): this.type = set("disabledTextStyle", value.asInstanceOf[js.Any])
    
    inline def disabledTextStyleNull: this.type = set("disabledTextStyle", null)
    
    inline def disabledVarargs(value: Double*): this.type = set("disabled", js.Array(value*))
    
    inline def innerBorderStyle(value: Color): this.type = set("innerBorderStyle", value.asInstanceOf[js.Any])
    
    inline def onHideUnderlay(value: Callback): this.type = set("onHideUnderlay", value.toJsFn)
    
    inline def onPress(value: /* repeated */ Any => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def onShowUnderlay(value: Callback): this.type = set("onShowUnderlay", value.toJsFn)
    
    inline def selectMultiple(value: Boolean): this.type = set("selectMultiple", value.asInstanceOf[js.Any])
    
    inline def selectedButtonStyle(value: StyleProp[ViewStyle]): this.type = set("selectedButtonStyle", value.asInstanceOf[js.Any])
    
    inline def selectedButtonStyleNull: this.type = set("selectedButtonStyle", null)
    
    inline def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
    
    inline def selectedIndexNull: this.type = set("selectedIndex", null)
    
    inline def selectedIndexes(value: js.Array[Double]): this.type = set("selectedIndexes", value.asInstanceOf[js.Any])
    
    inline def selectedIndexesVarargs(value: Double*): this.type = set("selectedIndexes", js.Array(value*))
    
    inline def selectedTextStyle(value: StyleProp[TextStyle]): this.type = set("selectedTextStyle", value.asInstanceOf[js.Any])
    
    inline def selectedTextStyleNull: this.type = set("selectedTextStyle", null)
    
    inline def setOpacityTo(value: /* value */ Double => Callback): this.type = set("setOpacityTo", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def textStyleNull: this.type = set("textStyle", null)
    
    inline def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonGroupProps & Partial[ThemeProps[ButtonGroupProps]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
