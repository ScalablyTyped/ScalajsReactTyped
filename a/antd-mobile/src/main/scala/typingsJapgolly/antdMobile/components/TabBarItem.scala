package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esComponentsTabBarTabBarMod.TabBarItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBarItem {
  
  @JSImport("antd-mobile/es/components/tab-bar/tab-bar", "TabBarItem")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TabBarItem.type): SharedBuilder_TabBarItemProps1874712417 = new SharedBuilder_TabBarItemProps1874712417(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabBarItemProps): SharedBuilder_TabBarItemProps1874712417 = new SharedBuilder_TabBarItemProps1874712417(js.Array(this.component, p.asInstanceOf[js.Any]))
}
