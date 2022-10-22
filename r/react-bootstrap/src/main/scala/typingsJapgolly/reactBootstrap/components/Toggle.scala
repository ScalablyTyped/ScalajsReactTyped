package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPanelToggleMod.PanelToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toggle {
  
  @JSImport("react-bootstrap/lib/Panel", "Toggle")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Toggle.type): SharedBuilder_PanelToggleProps1616014763[typingsJapgolly.reactBootstrap.libPanelMod.Toggle] = new SharedBuilder_PanelToggleProps1616014763[typingsJapgolly.reactBootstrap.libPanelMod.Toggle](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PanelToggleProps): SharedBuilder_PanelToggleProps1616014763[typingsJapgolly.reactBootstrap.libPanelMod.Toggle] = new SharedBuilder_PanelToggleProps1616014763[typingsJapgolly.reactBootstrap.libPanelMod.Toggle](js.Array(this.component, p.asInstanceOf[js.Any]))
}
