package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.NonMaxSuppressionV5Attrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.NonMaxSuppressionV5Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsNonMaxSuppressionV5Attrs extends StObject {
  
  var attrs: NonMaxSuppressionV5Attrs
  
  var backend: MathBackendCPU
  
  var inputs: NonMaxSuppressionV5Inputs
}
object AttrsNonMaxSuppressionV5Attrs {
  
  inline def apply(attrs: NonMaxSuppressionV5Attrs, backend: MathBackendCPU, inputs: NonMaxSuppressionV5Inputs): AttrsNonMaxSuppressionV5Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsNonMaxSuppressionV5Attrs]
  }
  
  extension [Self <: AttrsNonMaxSuppressionV5Attrs](x: Self) {
    
    inline def setAttrs(value: NonMaxSuppressionV5Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: NonMaxSuppressionV5Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
