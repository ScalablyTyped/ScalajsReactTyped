package typingsJapgolly.recharts.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.recharts.mod.ResponsiveContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveContainer {
  
  @JSImport("recharts", "ResponsiveContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.recharts.mod.ResponsiveContainer] {
    
    inline def aspect(value: Double): this.type = set("aspect", value.asInstanceOf[js.Any])
    
    inline def className(value: String | Double): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def debounce(value: Double): this.type = set("debounce", value.asInstanceOf[js.Any])
    
    inline def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def id(value: String | Double): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: String | Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def minHeight(value: String | Double): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: String | Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ResponsiveContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ResponsiveContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
