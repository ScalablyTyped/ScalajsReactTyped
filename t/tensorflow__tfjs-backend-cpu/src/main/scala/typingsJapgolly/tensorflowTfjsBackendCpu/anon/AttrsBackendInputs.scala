package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ArgMinAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ArgMinInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBackendInputs extends StObject {
  
  var attrs: ArgMinAttrs
  
  var backend: MathBackendCPU
  
  var inputs: ArgMinInputs
}
object AttrsBackendInputs {
  
  inline def apply(attrs: ArgMinAttrs, backend: MathBackendCPU, inputs: ArgMinInputs): AttrsBackendInputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackendInputs]
  }
  
  extension [Self <: AttrsBackendInputs](x: Self) {
    
    inline def setAttrs(value: ArgMinAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ArgMinInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
