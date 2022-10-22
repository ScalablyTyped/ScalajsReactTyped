package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPanelFooterMod.PanelFooterProps
import typingsJapgolly.reactBootstrap.libPanelFooterMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelFooter {
  
  @JSImport("react-bootstrap/lib/PanelFooter", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PanelFooter.type): SharedBuilder_PanelFooterProps1431193398[^] = new SharedBuilder_PanelFooterProps1431193398[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PanelFooterProps): SharedBuilder_PanelFooterProps1431193398[^] = new SharedBuilder_PanelFooterProps1431193398[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
