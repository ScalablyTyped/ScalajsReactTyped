package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.MinAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.MinInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMinAttrs extends StObject {
  
  var attrs: MinAttrs
  
  var backend: MathBackendCPU
  
  var inputs: MinInputs
}
object AttrsMinAttrs {
  
  inline def apply(attrs: MinAttrs, backend: MathBackendCPU, inputs: MinInputs): AttrsMinAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMinAttrs]
  }
  
  extension [Self <: AttrsMinAttrs](x: Self) {
    
    inline def setAttrs(value: MinAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MinInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
