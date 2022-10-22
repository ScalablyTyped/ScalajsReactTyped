package typingsJapgolly.wordpressComponents.components

import typingsJapgolly.wordpressComponents.panelRowMod.PanelRow.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelRow {
  
  @JSImport("@wordpress/components", "PanelRow")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PanelRow.type): SharedBuilder_Props1788767808 = new SharedBuilder_Props1788767808(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props1788767808 = new SharedBuilder_Props1788767808(js.Array(this.component, p.asInstanceOf[js.Any]))
}
