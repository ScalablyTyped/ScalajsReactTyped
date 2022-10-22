package typingsJapgolly.rcCollapse.components

import typingsJapgolly.rcCollapse.esInterfaceMod.CollapsePanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Panel {
  
  @JSImport("rc-collapse", "Panel")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Panel.type): SharedBuilder_CollapsePanelProps755478353[typingsJapgolly.rcCollapse.mod.Panel] = new SharedBuilder_CollapsePanelProps755478353[typingsJapgolly.rcCollapse.mod.Panel](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapsePanelProps): SharedBuilder_CollapsePanelProps755478353[typingsJapgolly.rcCollapse.mod.Panel] = new SharedBuilder_CollapsePanelProps755478353[typingsJapgolly.rcCollapse.mod.Panel](js.Array(this.component, p.asInstanceOf[js.Any]))
}
