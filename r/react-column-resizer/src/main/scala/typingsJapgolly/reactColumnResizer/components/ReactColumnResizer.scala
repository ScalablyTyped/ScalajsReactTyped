package typingsJapgolly.reactColumnResizer.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactColumnResizer.mod.ResizerProps
import typingsJapgolly.reactColumnResizer.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactColumnResizer {
  
  @JSImport("react-column-resizer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactColumnResizer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ResizerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
