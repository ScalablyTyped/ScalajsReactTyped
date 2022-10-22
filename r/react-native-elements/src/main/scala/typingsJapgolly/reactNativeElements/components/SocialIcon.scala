package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.anon.RecursivePartialFullThemeAvatar
import typingsJapgolly.reactNativeElements.anon.TypeofComponent
import typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.reactNativeElements.distSocialSocialIconMod.SocialIconProps
import typingsJapgolly.reactNativeElements.distSocialSocialIconMod.SocialMediaType
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SocialIcon {
  
  inline def apply(
    replaceTheme: RecursivePartialFullThemeAvatar => Callback,
    theme: Theme[SocialIconProps],
    updateTheme: RecursivePartialFullThemeAvatar => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => replaceTheme(t0).runNow()), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => updateTheme(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[SocialIconProps & Partial[ThemeProps[SocialIconProps]]]))
  }
  
  @JSImport("react-native-elements/dist/social/SocialIcon", "SocialIcon")
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
    
    inline def activityIndicatorStyle(value: StyleProp[ViewStyle]): this.type = set("activityIndicatorStyle", value.asInstanceOf[js.Any])
    
    inline def activityIndicatorStyleNull: this.type = set("activityIndicatorStyle", null)
    
    inline def button(value: Boolean): this.type = set("button", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def fontStyle(value: StyleProp[TextStyle]): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    inline def fontStyleNull: this.type = set("fontStyle", null)
    
    inline def fontWeight(value: String): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    inline def iconColor(value: String): this.type = set("iconColor", value.asInstanceOf[js.Any])
    
    inline def iconSize(value: Double): this.type = set("iconSize", value.asInstanceOf[js.Any])
    
    inline def iconStyle(value: StyleProp[ViewStyle]): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    inline def iconStyleNull: this.type = set("iconStyle", null)
    
    inline def iconType(value: String): this.type = set("iconType", value.asInstanceOf[js.Any])
    
    inline def light(value: Boolean): this.type = set("light", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def onLongPress(value: Callback): this.type = set("onLongPress", value.toJsFn)
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def raised(value: Boolean): this.type = set("raised", value.asInstanceOf[js.Any])
    
    inline def small(value: String): this.type = set("small", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def `type`(value: SocialMediaType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SocialIconProps & Partial[ThemeProps[SocialIconProps]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
