package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.UnpackAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.UnpackInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsUnpackAttrs extends StObject {
  
  var attrs: UnpackAttrs
  
  var backend: MathBackendCPU
  
  var inputs: UnpackInputs
}
object AttrsUnpackAttrs {
  
  inline def apply(attrs: UnpackAttrs, backend: MathBackendCPU, inputs: UnpackInputs): AttrsUnpackAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsUnpackAttrs]
  }
  
  extension [Self <: AttrsUnpackAttrs](x: Self) {
    
    inline def setAttrs(value: UnpackAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: UnpackInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
