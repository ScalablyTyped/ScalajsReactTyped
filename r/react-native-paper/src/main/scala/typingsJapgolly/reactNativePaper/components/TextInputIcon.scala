package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentTextInputIconMod.Props
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextInputIcon {
  
  inline def apply(name: IconSource): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputIcon", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def color(value: (js.Function1[/* isTextInputFocused */ Boolean, js.UndefOr[String]]) | String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colorFunction1(value: /* isTextInputFocused */ Boolean => js.UndefOr[String]): this.type = set("color", js.Any.fromFunction1(value))
    
    inline def forceTextInputFocus(value: Boolean): this.type = set("forceTextInputFocus", value.asInstanceOf[js.Any])
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
