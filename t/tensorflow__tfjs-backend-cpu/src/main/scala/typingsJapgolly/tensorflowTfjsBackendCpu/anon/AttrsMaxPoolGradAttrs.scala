package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.MaxPoolGradAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.MaxPoolGradInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMaxPoolGradAttrs extends StObject {
  
  var attrs: MaxPoolGradAttrs
  
  var backend: MathBackendCPU
  
  var inputs: MaxPoolGradInputs
}
object AttrsMaxPoolGradAttrs {
  
  inline def apply(attrs: MaxPoolGradAttrs, backend: MathBackendCPU, inputs: MaxPoolGradInputs): AttrsMaxPoolGradAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMaxPoolGradAttrs]
  }
  
  extension [Self <: AttrsMaxPoolGradAttrs](x: Self) {
    
    inline def setAttrs(value: MaxPoolGradAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MaxPoolGradInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
