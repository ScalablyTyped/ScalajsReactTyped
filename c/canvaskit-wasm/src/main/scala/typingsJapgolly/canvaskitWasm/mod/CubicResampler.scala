package typingsJapgolly.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CubicResampler extends StObject {
  
  var B: Double
  
  // 0..1
  var C: Double
}
object CubicResampler {
  
  inline def apply(B: Double, C: Double): CubicResampler = {
    val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], C = C.asInstanceOf[js.Any])
    __obj.asInstanceOf[CubicResampler]
  }
  
  extension [Self <: CubicResampler](x: Self) {
    
    inline def setB(value: Double): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
    
    inline def setC(value: Double): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
  }
}
