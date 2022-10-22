package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esComponentsSideBarSideBarMod.SideBarItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SideBarItem {
  
  @JSImport("antd-mobile/es/components/side-bar/side-bar", "SideBarItem")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SideBarItem.type): SharedBuilder_SideBarItemProps_1952243687 = new SharedBuilder_SideBarItemProps_1952243687(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SideBarItemProps): SharedBuilder_SideBarItemProps_1952243687 = new SharedBuilder_SideBarItemProps_1952243687(js.Array(this.component, p.asInstanceOf[js.Any]))
}
