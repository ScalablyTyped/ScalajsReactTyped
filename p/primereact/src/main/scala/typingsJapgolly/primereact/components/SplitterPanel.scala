package typingsJapgolly.primereact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.splitterSplitterMod.SplitterPanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SplitterPanel {
  
  @JSImport("primereact", "SplitterPanel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.SplitterPanel] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def minSize(value: Double): this.type = set("minSize", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SplitterPanel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SplitterPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
