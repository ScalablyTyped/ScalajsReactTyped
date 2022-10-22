package typingsJapgolly.antd.components

import typingsJapgolly.rcTabs.esTabPanelListTabPaneMod.TabPaneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabPane {
  
  @JSImport("antd/lib/tabs/TabPane", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TabPane.type): SharedBuilder_TabPaneProps115854863 = new SharedBuilder_TabPaneProps115854863(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabPaneProps): SharedBuilder_TabPaneProps115854863 = new SharedBuilder_TabPaneProps115854863(js.Array(this.component, p.asInstanceOf[js.Any]))
}
