package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esComponentsCollapseCollapseMod.CollapsePanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CollapsePanel {
  
  @JSImport("antd-mobile/es/components/collapse/collapse", "CollapsePanel")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CollapsePanel.type): SharedBuilder_CollapsePanelProps_2073041382 = new SharedBuilder_CollapsePanelProps_2073041382(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapsePanelProps): SharedBuilder_CollapsePanelProps_2073041382 = new SharedBuilder_CollapsePanelProps_2073041382(js.Array(this.component, p.asInstanceOf[js.Any]))
}
