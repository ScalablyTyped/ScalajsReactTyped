package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esComponentsTabsTabsMod.TabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  @JSImport("antd-mobile/es/components/tabs/tabs", "Tab")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Tab.type): SharedBuilder_TabProps_1682305594 = new SharedBuilder_TabProps_1682305594(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabProps): SharedBuilder_TabProps_1682305594 = new SharedBuilder_TabProps_1682305594(js.Array(this.component, p.asInstanceOf[js.Any]))
}
