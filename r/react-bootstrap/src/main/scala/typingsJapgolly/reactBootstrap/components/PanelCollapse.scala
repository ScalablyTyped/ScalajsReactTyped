package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPanelCollapseMod.PanelCollapseProps
import typingsJapgolly.reactBootstrap.libPanelCollapseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelCollapse {
  
  @JSImport("react-bootstrap/lib/PanelCollapse", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PanelCollapse.type): SharedBuilder_PanelCollapseProps_1854732796[^] = new SharedBuilder_PanelCollapseProps_1854732796[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PanelCollapseProps): SharedBuilder_PanelCollapseProps_1854732796[^] = new SharedBuilder_PanelCollapseProps_1854732796[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
