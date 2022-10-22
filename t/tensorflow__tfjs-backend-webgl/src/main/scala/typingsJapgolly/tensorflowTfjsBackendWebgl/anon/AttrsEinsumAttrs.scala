package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.EinsumAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.EinsumInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsEinsumAttrs extends StObject {
  
  var attrs: EinsumAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: EinsumInputs
}
object AttrsEinsumAttrs {
  
  inline def apply(attrs: EinsumAttrs, backend: MathBackendWebGL, inputs: EinsumInputs): AttrsEinsumAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsEinsumAttrs]
  }
  
  extension [Self <: AttrsEinsumAttrs](x: Self) {
    
    inline def setAttrs(value: EinsumAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: EinsumInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: TensorInfo*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}
