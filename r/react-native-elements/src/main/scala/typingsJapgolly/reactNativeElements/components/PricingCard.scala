package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.anon.RecursivePartialFullThemeAvatar
import typingsJapgolly.reactNativeElements.distButtonsButtonMod.ButtonProps
import typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.reactNativeElements.distPricingPricingCardMod.ButtonInformation
import typingsJapgolly.reactNativeElements.distPricingPricingCardMod.PricingCardProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PricingCard {
  
  inline def apply(
    replaceTheme: RecursivePartialFullThemeAvatar => Callback,
    theme: Theme[PricingCardProps],
    updateTheme: RecursivePartialFullThemeAvatar => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => replaceTheme(t0).runNow()), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => updateTheme(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[PricingCardProps & Partial[ThemeProps[PricingCardProps]]]))
  }
  
  @JSImport("react-native-elements/dist/pricing/PricingCard", "PricingCard")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def button(value: ButtonProps | ButtonInformation): this.type = set("button", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def info(value: js.Array[String]): this.type = set("info", value.asInstanceOf[js.Any])
    
    inline def infoStyle(value: StyleProp[TextStyle]): this.type = set("infoStyle", value.asInstanceOf[js.Any])
    
    inline def infoStyleNull: this.type = set("infoStyle", null)
    
    inline def infoVarargs(value: String*): this.type = set("info", js.Array(value*))
    
    inline def onButtonPress(value: Callback): this.type = set("onButtonPress", value.toJsFn)
    
    inline def price(value: String | Double): this.type = set("price", value.asInstanceOf[js.Any])
    
    inline def pricingStyle(value: StyleProp[TextStyle]): this.type = set("pricingStyle", value.asInstanceOf[js.Any])
    
    inline def pricingStyleNull: this.type = set("pricingStyle", null)
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    
    inline def titleStyleNull: this.type = set("titleStyle", null)
    
    inline def wrapperStyle(value: StyleProp[ViewStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  def withProps(p: PricingCardProps & Partial[ThemeProps[PricingCardProps]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
