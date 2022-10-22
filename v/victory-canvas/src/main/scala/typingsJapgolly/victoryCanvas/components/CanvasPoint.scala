package typingsJapgolly.victoryCanvas.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryCanvas.esMod.CanvasPointProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CanvasPoint {
  
  @JSImport("victory-canvas/es", "CanvasPoint")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryCanvas.esMod.CanvasPoint] {
    
    inline def datum(value: Any): this.type = set("datum", value.asInstanceOf[js.Any])
    
    inline def getPath(value: (/* x */ Double, /* y */ Double, /* size */ Double) => String): this.type = set("getPath", js.Any.fromFunction3(value))
    
    inline def size(value: Double | js.Function): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def symbol(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScatterSymbolType */ Any) | js.Function
    ): this.type = set("symbol", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CanvasPoint.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CanvasPointProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
