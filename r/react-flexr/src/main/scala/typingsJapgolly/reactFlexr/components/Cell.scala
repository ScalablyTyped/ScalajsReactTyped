package typingsJapgolly.reactFlexr.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFlexr.ReactFlexr.CellProps
import typingsJapgolly.reactFlexr.reactFlexrStrings.bottom
import typingsJapgolly.reactFlexr.reactFlexrStrings.center
import typingsJapgolly.reactFlexr.reactFlexrStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cell {
  
  @JSImport("react-flexr", "Cell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactFlexr.mod.Cell] {
    
    inline def align(value: top | center | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def desk(value: String | Double): this.type = set("desk", value.asInstanceOf[js.Any])
    
    inline def flex(value: Boolean): this.type = set("flex", value.asInstanceOf[js.Any])
    
    inline def gutter(value: String): this.type = set("gutter", value.asInstanceOf[js.Any])
    
    inline def lap(value: String | Double): this.type = set("lap", value.asInstanceOf[js.Any])
    
    inline def palm(value: String | Double): this.type = set("palm", value.asInstanceOf[js.Any])
    
    inline def portable(value: String | Double): this.type = set("portable", value.asInstanceOf[js.Any])
    
    inline def size(value: String | Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Cell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
