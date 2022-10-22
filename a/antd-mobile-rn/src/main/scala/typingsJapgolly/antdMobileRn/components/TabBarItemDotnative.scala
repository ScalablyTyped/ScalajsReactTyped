package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libTabBarTabBarItemDotnativeMod.TabBarItemProps
import typingsJapgolly.antdMobileRn.libTabBarTabBarItemDotnativeMod.default
import typingsJapgolly.reactNative.mod.ImageRequireSource
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBarItemDotnative {
  
  inline def apply(title: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabBarItemProps]))
  }
  
  @JSImport("antd-mobile-rn/lib/tab-bar/TabBarItem.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def badge(value: String | Double): this.type = set("badge", value.asInstanceOf[js.Any])
    
    inline def icon(value: ImageURISource | js.Array[ImageURISource] | ImageRequireSource): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconStyle(value: StyleProp[ImageStyle]): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    inline def iconStyleNull: this.type = set("iconStyle", null)
    
    inline def iconVarargs(value: ImageURISource*): this.type = set("icon", js.Array(value*))
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def renderAsOriginal(value: Boolean): this.type = set("renderAsOriginal", value.asInstanceOf[js.Any])
    
    inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def selectedIcon(value: ImageURISource | js.Array[ImageURISource] | ImageRequireSource): this.type = set("selectedIcon", value.asInstanceOf[js.Any])
    
    inline def selectedIconVarargs(value: ImageURISource*): this.type = set("selectedIcon", js.Array(value*))
    
    inline def styles(value: Any): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    inline def unselectedTintColor(value: String): this.type = set("unselectedTintColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabBarItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
