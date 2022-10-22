package typingsJapgolly.inkDivider.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.inkDivider.mod.DividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InkDivider {
  
  @JSImport("ink-divider", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dividerChar(value: String): this.type = set("dividerChar", value.asInstanceOf[js.Any])
    
    inline def dividerColor(value: String): this.type = set("dividerColor", value.asInstanceOf[js.Any])
    
    inline def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleColor(value: String): this.type = set("titleColor", value.asInstanceOf[js.Any])
    
    inline def titlePadding(value: Double): this.type = set("titlePadding", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InkDivider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DividerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
