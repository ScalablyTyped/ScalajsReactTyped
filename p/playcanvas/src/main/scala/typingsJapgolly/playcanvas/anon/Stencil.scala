package typingsJapgolly.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stencil extends StObject {
  
  var color: js.UndefOr[js.Array[Double]] = js.undefined
  
  var depth: js.UndefOr[Double] = js.undefined
  
  var flags: js.UndefOr[Double] = js.undefined
  
  var stencil: js.UndefOr[Double] = js.undefined
}
object Stencil {
  
  inline def apply(): Stencil = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stencil]
  }
  
  extension [Self <: Stencil](x: Self) {
    
    inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setStencil(value: Double): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
  }
}
