package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPanelBodyMod.PanelBodyProps
import typingsJapgolly.reactBootstrap.libPanelBodyMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelBody {
  
  @JSImport("react-bootstrap/lib/PanelBody", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PanelBody.type): SharedBuilder_PanelBodyProps973735426[^] = new SharedBuilder_PanelBodyProps973735426[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PanelBodyProps): SharedBuilder_PanelBodyProps973735426[^] = new SharedBuilder_PanelBodyProps973735426[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
