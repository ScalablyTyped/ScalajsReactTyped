package typingsJapgolly.reactFlexr.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFlexr.ReactFlexr.GridProps
import typingsJapgolly.reactFlexr.reactFlexrStrings.bottom
import typingsJapgolly.reactFlexr.reactFlexrStrings.center
import typingsJapgolly.reactFlexr.reactFlexrStrings.left
import typingsJapgolly.reactFlexr.reactFlexrStrings.right
import typingsJapgolly.reactFlexr.reactFlexrStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grid {
  
  @JSImport("react-flexr", "Grid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactFlexr.mod.Grid] {
    
    inline def align(value: top | center | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def flexCells(value: Boolean): this.type = set("flexCells", value.asInstanceOf[js.Any])
    
    inline def gutter(value: String): this.type = set("gutter", value.asInstanceOf[js.Any])
    
    inline def hAlign(value: left | center | right): this.type = set("hAlign", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Grid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
