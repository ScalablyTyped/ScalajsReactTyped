package typingsJapgolly.tensorflowTfjsBackendWasm.anon

import typingsJapgolly.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.RangeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsRangeAttrs extends StObject {
  
  var attrs: RangeAttrs
  
  var backend: BackendWasm
}
object AttrsRangeAttrs {
  
  inline def apply(attrs: RangeAttrs, backend: BackendWasm): AttrsRangeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsRangeAttrs]
  }
  
  extension [Self <: AttrsRangeAttrs](x: Self) {
    
    inline def setAttrs(value: RangeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
  }
}
