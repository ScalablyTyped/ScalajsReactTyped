package typingsJapgolly.halogen.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.halogen.mod.MarginLoaderProps
import typingsJapgolly.halogen.mod.PacmanLoaderCls
import typingsJapgolly.halogen.mod.VerticalAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PacmanLoader {
  
  @JSImport("halogen", "PacmanLoader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[PacmanLoaderCls] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def margin(value: Double): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def verticalAlign(value: VerticalAlign): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PacmanLoader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MarginLoaderProps[Double]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
