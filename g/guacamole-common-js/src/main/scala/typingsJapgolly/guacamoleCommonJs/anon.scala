package typingsJapgolly.guacamoleCommonJs

import typingsJapgolly.guacamoleCommonJs.libClientMod.Client.ExportLayer
import typingsJapgolly.std.CanvasFillRule
import typingsJapgolly.std.Path2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined guacamole-common-js.guacamole-common-js/lib/Client.Client.ExportLayerBase & {  x :number,   y :number,   z :number,   alpha :number,   matrix :unknown,   parent :unknown} */
  trait ExportLayerBasexnumberynu
    extends StObject
       with ExportLayer {
    
    var alpha: Double
    
    var height: Double
    
    var matrix: Any
    
    var parent: Any
    
    var url: js.UndefOr[String] = js.undefined
    
    var width: Double
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object ExportLayerBasexnumberynu {
    
    inline def apply(
      alpha: Double,
      height: Double,
      matrix: Any,
      parent: Any,
      width: Double,
      x: Double,
      y: Double,
      z: Double
    ): ExportLayerBasexnumberynu = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportLayerBasexnumberynu]
    }
    
    extension [Self <: ExportLayerBasexnumberynu](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMatrix(value: Any): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
    def apply(
      x: Double,
      y: Double,
      radius: Double,
      startAngle: Double,
      endAngle: Double,
      counterclockwise: Boolean
    ): Unit = js.native
  }
  
  @js.native
  trait FnCallPathFillRule extends StObject {
    
    def apply(): Unit = js.native
    def apply(fillRule: CanvasFillRule): Unit = js.native
    def apply(path: Path2D): Unit = js.native
    def apply(path: Path2D, fillRule: CanvasFillRule): Unit = js.native
  }
}
