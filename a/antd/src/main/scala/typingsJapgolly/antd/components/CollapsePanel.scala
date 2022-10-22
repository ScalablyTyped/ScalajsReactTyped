package typingsJapgolly.antd.components

import typingsJapgolly.antd.libCollapseCollapsePanelMod.CollapsePanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CollapsePanel {
  
  @JSImport("antd/lib/collapse/CollapsePanel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CollapsePanel.type): SharedBuilder_CollapsePanelProps_208192475 = new SharedBuilder_CollapsePanelProps_208192475(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapsePanelProps): SharedBuilder_CollapsePanelProps_208192475 = new SharedBuilder_CollapsePanelProps_208192475(js.Array(this.component, p.asInstanceOf[js.Any]))
}
