package typingsJapgolly.reactNativeWindows.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeWindows.rntypesMod.ColorValue
import typingsJapgolly.reactNativeWindows.rntypesMod.NavigatorIOSProps
import typingsJapgolly.reactNativeWindows.rntypesMod.Route
import typingsJapgolly.reactNativeWindows.rntypesMod.StyleProp
import typingsJapgolly.reactNativeWindows.rntypesMod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigatorIOS {
  
  inline def apply(initialRoute: Route): Builder = {
    val __props = js.Dynamic.literal(initialRoute = initialRoute.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NavigatorIOSProps]))
  }
  
  @JSImport("react-native-windows", "NavigatorIOS")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeWindows.mod.NavigatorIOS] {
    
    inline def barTintColor(value: ColorValue): this.type = set("barTintColor", value.asInstanceOf[js.Any])
    
    inline def interactivePopGestureEnabled(value: Boolean): this.type = set("interactivePopGestureEnabled", value.asInstanceOf[js.Any])
    
    inline def itemWrapperStyle(value: StyleProp[ViewStyle]): this.type = set("itemWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def itemWrapperStyleNull: this.type = set("itemWrapperStyle", null)
    
    inline def navigationBarHidden(value: Boolean): this.type = set("navigationBarHidden", value.asInstanceOf[js.Any])
    
    inline def shadowHidden(value: Boolean): this.type = set("shadowHidden", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def tintColor(value: ColorValue): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    inline def titleTextColor(value: ColorValue): this.type = set("titleTextColor", value.asInstanceOf[js.Any])
    
    inline def translucent(value: Boolean): this.type = set("translucent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NavigatorIOSProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
