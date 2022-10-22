package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.DepthToSpaceAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.DepthToSpaceInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsDepthToSpaceAttrs extends StObject {
  
  var attrs: DepthToSpaceAttrs
  
  var backend: MathBackendCPU
  
  var inputs: DepthToSpaceInputs
}
object AttrsDepthToSpaceAttrs {
  
  inline def apply(attrs: DepthToSpaceAttrs, backend: MathBackendCPU, inputs: DepthToSpaceInputs): AttrsDepthToSpaceAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDepthToSpaceAttrs]
  }
  
  extension [Self <: AttrsDepthToSpaceAttrs](x: Self) {
    
    inline def setAttrs(value: DepthToSpaceAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: DepthToSpaceInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
