package typingsJapgolly.antdMobileRn.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libTabBarStyleIndexDotnativeMod.ITabBarStyle
import typingsJapgolly.antdMobileRn.libTabBarTabbarDotandroidMod.TabBarNativeProps
import typingsJapgolly.antdMobileRn.libTabBarTabbarDotandroidMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabbarDotandroid {
  
  @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.android", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    inline def barTintColor(value: String): this.type = set("barTintColor", value.asInstanceOf[js.Any])
    
    inline def styles(value: ITabBarStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    
    inline def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    inline def unselectedTintColor(value: String): this.type = set("unselectedTintColor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TabbarDotandroid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabBarNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
