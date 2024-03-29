package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPanelToggleMod.PanelToggleProps
import typingsJapgolly.reactBootstrap.libPanelToggleMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelToggle {
  
  @JSImport("react-bootstrap/lib/PanelToggle", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PanelToggle.type): SharedBuilder_PanelToggleProps1616014763[^] = new SharedBuilder_PanelToggleProps1616014763[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PanelToggleProps): SharedBuilder_PanelToggleProps1616014763[^] = new SharedBuilder_PanelToggleProps1616014763[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
