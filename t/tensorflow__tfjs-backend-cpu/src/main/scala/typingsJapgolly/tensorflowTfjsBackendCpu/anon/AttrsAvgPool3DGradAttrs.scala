package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.AvgPool3DGradAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.AvgPool3DGradInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsAvgPool3DGradAttrs extends StObject {
  
  var attrs: AvgPool3DGradAttrs
  
  var backend: MathBackendCPU
  
  var inputs: AvgPool3DGradInputs
}
object AttrsAvgPool3DGradAttrs {
  
  inline def apply(attrs: AvgPool3DGradAttrs, backend: MathBackendCPU, inputs: AvgPool3DGradInputs): AttrsAvgPool3DGradAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsAvgPool3DGradAttrs]
  }
  
  extension [Self <: AttrsAvgPool3DGradAttrs](x: Self) {
    
    inline def setAttrs(value: AvgPool3DGradAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: AvgPool3DGradInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
