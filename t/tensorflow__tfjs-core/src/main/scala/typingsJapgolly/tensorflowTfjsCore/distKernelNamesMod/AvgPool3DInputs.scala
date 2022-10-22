package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
trait AvgPool3DInputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object AvgPool3DInputs {
  
  inline def apply(): AvgPool3DInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvgPool3DInputs]
  }
  
  extension [Self <: AvgPool3DInputs](x: Self) {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
