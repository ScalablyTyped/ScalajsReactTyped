package typingsJapgolly.rcTabs.components

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.rcTabs.esTabsMod.TabsProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @JSImport("rc-tabs/es/Tabs", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Tabs.type): SharedBuilder_TabsPropsRefAttributes_266785819[HTMLDivElement] = new SharedBuilder_TabsPropsRefAttributes_266785819[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabsProps & RefAttributes[HTMLDivElement]): SharedBuilder_TabsPropsRefAttributes_266785819[HTMLDivElement] = new SharedBuilder_TabsPropsRefAttributes_266785819[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
