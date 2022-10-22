package typingsJapgolly.reactNavigationMaterialBottomTabs.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigation.mod.NavigationProp
import typingsJapgolly.reactNavigationMaterialBottomTabs.anon.TintColor
import typingsJapgolly.reactNavigationMaterialBottomTabs.libTypescriptSrcViewsMaterialBottomTabViewMod.Props
import typingsJapgolly.reactNavigationMaterialBottomTabs.libTypescriptSrcViewsMaterialBottomTabViewMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MaterialBottomTabView {
  
  inline def apply(navigation: NavigationProp[Any], renderIcon: TintColor => Node): Builder = {
    val __props = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], renderIcon = js.Any.fromFunction1(renderIcon))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-navigation-material-bottom-tabs/lib/typescript/src/views/MaterialBottomTabView", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def activeColorDark(value: String): this.type = set("activeColorDark", value.asInstanceOf[js.Any])
    
    inline def activeColorLight(value: String): this.type = set("activeColorLight", value.asInstanceOf[js.Any])
    
    inline def barStyleDark(value: StyleProp[ViewStyle]): this.type = set("barStyleDark", value.asInstanceOf[js.Any])
    
    inline def barStyleDarkNull: this.type = set("barStyleDark", null)
    
    inline def barStyleLight(value: StyleProp[ViewStyle]): this.type = set("barStyleLight", value.asInstanceOf[js.Any])
    
    inline def barStyleLightNull: this.type = set("barStyleLight", null)
    
    inline def inactiveColorDark(value: String): this.type = set("inactiveColorDark", value.asInstanceOf[js.Any])
    
    inline def inactiveColorLight(value: String): this.type = set("inactiveColorLight", value.asInstanceOf[js.Any])
    
    inline def screenProps(value: Any): this.type = set("screenProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
