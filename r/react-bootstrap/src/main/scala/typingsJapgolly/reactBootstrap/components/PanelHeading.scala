package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPanelHeadingMod.PanelHeadingProps
import typingsJapgolly.reactBootstrap.libPanelHeadingMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelHeading {
  
  @JSImport("react-bootstrap/lib/PanelHeading", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PanelHeading.type): SharedBuilder_PanelHeadingProps_1114388587[^] = new SharedBuilder_PanelHeadingProps_1114388587[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PanelHeadingProps): SharedBuilder_PanelHeadingProps_1114388587[^] = new SharedBuilder_PanelHeadingProps_1114388587[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
