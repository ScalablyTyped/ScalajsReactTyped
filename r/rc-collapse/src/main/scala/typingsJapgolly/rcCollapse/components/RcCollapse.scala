package typingsJapgolly.rcCollapse.components

import typingsJapgolly.rcCollapse.esInterfaceMod.CollapsePanelProps
import typingsJapgolly.rcCollapse.esInterfaceMod.CollapseProps
import typingsJapgolly.rcCollapse.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcCollapse {
  
  object Panel {
    
    @JSImport("rc-collapse", "default.Panel")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Panel.type): SharedBuilder_CollapsePanelProps755478353[typingsJapgolly.rcCollapse.mod.default.Panel] = new SharedBuilder_CollapsePanelProps755478353[typingsJapgolly.rcCollapse.mod.default.Panel](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CollapsePanelProps): SharedBuilder_CollapsePanelProps755478353[typingsJapgolly.rcCollapse.mod.default.Panel] = new SharedBuilder_CollapsePanelProps755478353[typingsJapgolly.rcCollapse.mod.default.Panel](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-collapse", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcCollapse.type): SharedBuilder_CollapseProps_2006001708[default] = new SharedBuilder_CollapseProps_2006001708[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapseProps): SharedBuilder_CollapseProps_2006001708[default] = new SharedBuilder_CollapseProps_2006001708[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
