package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libPanelHeadingMod.PanelHeadingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Heading {
  
  @JSImport("react-bootstrap/lib/Panel", "Heading")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Heading.type): SharedBuilder_PanelHeadingProps_1114388587[typingsJapgolly.reactBootstrap.libPanelMod.Heading] = new SharedBuilder_PanelHeadingProps_1114388587[typingsJapgolly.reactBootstrap.libPanelMod.Heading](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PanelHeadingProps): SharedBuilder_PanelHeadingProps_1114388587[typingsJapgolly.reactBootstrap.libPanelMod.Heading] = new SharedBuilder_PanelHeadingProps_1114388587[typingsJapgolly.reactBootstrap.libPanelMod.Heading](js.Array(this.component, p.asInstanceOf[js.Any]))
}
