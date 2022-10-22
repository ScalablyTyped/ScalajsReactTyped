package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.Conv2DAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.Conv2DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsConv2DAttrs extends StObject {
  
  var attrs: Conv2DAttrs
  
  var backend: MathBackendCPU
  
  var inputs: Conv2DInputs
}
object AttrsConv2DAttrs {
  
  inline def apply(attrs: Conv2DAttrs, backend: MathBackendCPU, inputs: Conv2DInputs): AttrsConv2DAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv2DAttrs]
  }
  
  extension [Self <: AttrsConv2DAttrs](x: Self) {
    
    inline def setAttrs(value: Conv2DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: Conv2DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
