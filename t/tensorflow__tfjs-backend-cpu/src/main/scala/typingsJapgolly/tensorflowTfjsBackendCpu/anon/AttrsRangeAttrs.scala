package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.RangeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsRangeAttrs extends StObject {
  
  var attrs: RangeAttrs
  
  var backend: MathBackendCPU
}
object AttrsRangeAttrs {
  
  inline def apply(attrs: RangeAttrs, backend: MathBackendCPU): AttrsRangeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsRangeAttrs]
  }
  
  extension [Self <: AttrsRangeAttrs](x: Self) {
    
    inline def setAttrs(value: RangeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
  }
}
