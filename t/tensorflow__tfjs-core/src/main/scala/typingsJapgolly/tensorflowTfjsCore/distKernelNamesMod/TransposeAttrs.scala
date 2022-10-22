package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransposeAttrs extends StObject {
  
  var perm: js.Array[Double]
}
object TransposeAttrs {
  
  inline def apply(perm: js.Array[Double]): TransposeAttrs = {
    val __obj = js.Dynamic.literal(perm = perm.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransposeAttrs]
  }
  
  extension [Self <: TransposeAttrs](x: Self) {
    
    inline def setPerm(value: js.Array[Double]): Self = StObject.set(x, "perm", value.asInstanceOf[js.Any])
    
    inline def setPermVarargs(value: Double*): Self = StObject.set(x, "perm", js.Array(value*))
  }
}
