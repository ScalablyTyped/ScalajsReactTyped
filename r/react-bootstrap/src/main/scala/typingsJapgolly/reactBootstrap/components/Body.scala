package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPanelBodyMod.PanelBodyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Body {
  
  @JSImport("react-bootstrap/lib/Panel", "Body")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Body.type): SharedBuilder_PanelBodyProps973735426[typingsJapgolly.reactBootstrap.libPanelMod.Body] = new SharedBuilder_PanelBodyProps973735426[typingsJapgolly.reactBootstrap.libPanelMod.Body](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PanelBodyProps): SharedBuilder_PanelBodyProps973735426[typingsJapgolly.reactBootstrap.libPanelMod.Body] = new SharedBuilder_PanelBodyProps973735426[typingsJapgolly.reactBootstrap.libPanelMod.Body](js.Array(this.component, p.asInstanceOf[js.Any]))
}
