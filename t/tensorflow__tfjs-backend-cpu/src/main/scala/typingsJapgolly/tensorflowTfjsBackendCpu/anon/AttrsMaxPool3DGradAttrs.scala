package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.MaxPool3DGradAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.MaxPool3DGradInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMaxPool3DGradAttrs extends StObject {
  
  var attrs: MaxPool3DGradAttrs
  
  var backend: MathBackendCPU
  
  var inputs: MaxPool3DGradInputs
}
object AttrsMaxPool3DGradAttrs {
  
  inline def apply(attrs: MaxPool3DGradAttrs, backend: MathBackendCPU, inputs: MaxPool3DGradInputs): AttrsMaxPool3DGradAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMaxPool3DGradAttrs]
  }
  
  extension [Self <: AttrsMaxPool3DGradAttrs](x: Self) {
    
    inline def setAttrs(value: MaxPool3DGradAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MaxPool3DGradInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
