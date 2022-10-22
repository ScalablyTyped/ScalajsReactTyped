package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esComponentsJumboTabsJumboTabsMod.JumboTabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JumboTab {
  
  @JSImport("antd-mobile/es/components/jumbo-tabs/jumbo-tabs", "JumboTab")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: JumboTab.type): SharedBuilder_JumboTabProps1213141145 = new SharedBuilder_JumboTabProps1213141145(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: JumboTabProps): SharedBuilder_JumboTabProps1213141145 = new SharedBuilder_JumboTabProps1213141145(js.Array(this.component, p.asInstanceOf[js.Any]))
}
