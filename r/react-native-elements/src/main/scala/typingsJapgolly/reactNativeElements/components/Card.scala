package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.anon.RecursivePartialFullThemeAvatar
import typingsJapgolly.reactNativeElements.distCardCardMod.CardProps
import typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  inline def apply(
    replaceTheme: RecursivePartialFullThemeAvatar => Callback,
    theme: Theme[CardProps],
    updateTheme: RecursivePartialFullThemeAvatar => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => replaceTheme(t0).runNow()), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => updateTheme(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[CardProps & Partial[ThemeProps[CardProps]]]))
  }
  
  @JSImport("react-native-elements/dist/card/Card", "Card")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def wrapperStyle(value: StyleProp[ViewStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  def withProps(p: CardProps & Partial[ThemeProps[CardProps]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
