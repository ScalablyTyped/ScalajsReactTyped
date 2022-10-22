package typingsJapgolly.tensorflowTfjsBackendWasm.anon

import typingsJapgolly.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ExpandDimsAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ExpandDimsInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBackendInputs extends StObject {
  
  var attrs: ExpandDimsAttrs
  
  var backend: BackendWasm
  
  var inputs: ExpandDimsInputs
}
object AttrsBackendInputs {
  
  inline def apply(attrs: ExpandDimsAttrs, backend: BackendWasm, inputs: ExpandDimsInputs): AttrsBackendInputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackendInputs]
  }
  
  extension [Self <: AttrsBackendInputs](x: Self) {
    
    inline def setAttrs(value: ExpandDimsAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ExpandDimsInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
