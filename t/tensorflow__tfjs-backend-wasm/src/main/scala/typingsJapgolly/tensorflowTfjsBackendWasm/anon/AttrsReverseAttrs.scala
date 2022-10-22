package typingsJapgolly.tensorflowTfjsBackendWasm.anon

import typingsJapgolly.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ReverseAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ReverseInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsReverseAttrs extends StObject {
  
  var attrs: ReverseAttrs
  
  var backend: BackendWasm
  
  var inputs: ReverseInputs
}
object AttrsReverseAttrs {
  
  inline def apply(attrs: ReverseAttrs, backend: BackendWasm, inputs: ReverseInputs): AttrsReverseAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsReverseAttrs]
  }
  
  extension [Self <: AttrsReverseAttrs](x: Self) {
    
    inline def setAttrs(value: ReverseAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ReverseInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
