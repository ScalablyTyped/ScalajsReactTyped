package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPanelTitleMod.PanelTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Title {
  
  @JSImport("react-bootstrap/lib/Panel", "Title")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Title.type): SharedBuilder_PanelTitleProps_1171097564[typingsJapgolly.reactBootstrap.libPanelMod.Title] = new SharedBuilder_PanelTitleProps_1171097564[typingsJapgolly.reactBootstrap.libPanelMod.Title](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PanelTitleProps): SharedBuilder_PanelTitleProps_1171097564[typingsJapgolly.reactBootstrap.libPanelMod.Title] = new SharedBuilder_PanelTitleProps_1171097564[typingsJapgolly.reactBootstrap.libPanelMod.Title](js.Array(this.component, p.asInstanceOf[js.Any]))
}
