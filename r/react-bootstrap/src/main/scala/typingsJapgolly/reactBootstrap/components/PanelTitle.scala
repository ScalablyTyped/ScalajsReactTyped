package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPanelTitleMod.PanelTitleProps
import typingsJapgolly.reactBootstrap.libPanelTitleMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelTitle {
  
  @JSImport("react-bootstrap/lib/PanelTitle", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PanelTitle.type): SharedBuilder_PanelTitleProps_1171097564[^] = new SharedBuilder_PanelTitleProps_1171097564[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PanelTitleProps): SharedBuilder_PanelTitleProps_1171097564[^] = new SharedBuilder_PanelTitleProps_1171097564[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
