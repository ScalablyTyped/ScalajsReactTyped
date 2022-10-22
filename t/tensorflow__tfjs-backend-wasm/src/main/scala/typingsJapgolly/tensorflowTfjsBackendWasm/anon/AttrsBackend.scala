package typingsJapgolly.tensorflowTfjsBackendWasm.anon

import typingsJapgolly.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.CumsumAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.CumsumInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBackend extends StObject {
  
  var attrs: CumsumAttrs
  
  var backend: BackendWasm
  
  var inputs: CumsumInputs
}
object AttrsBackend {
  
  inline def apply(attrs: CumsumAttrs, backend: BackendWasm, inputs: CumsumInputs): AttrsBackend = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackend]
  }
  
  extension [Self <: AttrsBackend](x: Self) {
    
    inline def setAttrs(value: CumsumAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: CumsumInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
