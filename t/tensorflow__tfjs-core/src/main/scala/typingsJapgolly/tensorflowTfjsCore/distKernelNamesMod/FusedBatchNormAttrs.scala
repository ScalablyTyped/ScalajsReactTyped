package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FusedBatchNormAttrs extends StObject {
  
  var varianceEpsilon: Double
}
object FusedBatchNormAttrs {
  
  inline def apply(varianceEpsilon: Double): FusedBatchNormAttrs = {
    val __obj = js.Dynamic.literal(varianceEpsilon = varianceEpsilon.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedBatchNormAttrs]
  }
  
  extension [Self <: FusedBatchNormAttrs](x: Self) {
    
    inline def setVarianceEpsilon(value: Double): Self = StObject.set(x, "varianceEpsilon", value.asInstanceOf[js.Any])
  }
}
