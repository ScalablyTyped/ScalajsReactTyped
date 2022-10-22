package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.OneHotAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.OneHotInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsOneHotAttrs extends StObject {
  
  var attrs: OneHotAttrs
  
  var backend: MathBackendCPU
  
  var inputs: OneHotInputs
}
object AttrsOneHotAttrs {
  
  inline def apply(attrs: OneHotAttrs, backend: MathBackendCPU, inputs: OneHotInputs): AttrsOneHotAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsOneHotAttrs]
  }
  
  extension [Self <: AttrsOneHotAttrs](x: Self) {
    
    inline def setAttrs(value: OneHotAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: OneHotInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
