package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.antDesignReactNative.libTabBarTabBarItemMod.TabBarItemProps
import typingsJapgolly.antDesignReactNative.libTabBarTabBarItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBarItem {
  
  inline def apply(title: String): SharedBuilder_TabBarItemProps_504391795[default] = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new SharedBuilder_TabBarItemProps_504391795[default](js.Array(this.component, __props.asInstanceOf[TabBarItemProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/tab-bar/TabBarItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TabBarItemProps): SharedBuilder_TabBarItemProps_504391795[default] = new SharedBuilder_TabBarItemProps_504391795[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
