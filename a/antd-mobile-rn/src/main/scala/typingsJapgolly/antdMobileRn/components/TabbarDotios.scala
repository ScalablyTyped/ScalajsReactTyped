package typingsJapgolly.antdMobileRn.components

import typingsJapgolly.antdMobileRn.libTabBarPropsTypeMod.TabBarProps
import typingsJapgolly.antdMobileRn.libTabBarTabbarDotiosMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabbarDotios {
  
  @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.ios", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TabbarDotios.type): SharedBuilder_TabBarProps_1540001775[default] = new SharedBuilder_TabBarProps_1540001775[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabBarProps): SharedBuilder_TabBarProps_1540001775[default] = new SharedBuilder_TabBarProps_1540001775[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
