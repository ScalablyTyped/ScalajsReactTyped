package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.SumAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.SumInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsSumAttrs extends StObject {
  
  var attrs: SumAttrs
  
  var backend: MathBackendCPU
  
  var inputs: SumInputs
}
object AttrsSumAttrs {
  
  inline def apply(attrs: SumAttrs, backend: MathBackendCPU, inputs: SumInputs): AttrsSumAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSumAttrs]
  }
  
  extension [Self <: AttrsSumAttrs](x: Self) {
    
    inline def setAttrs(value: SumAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SumInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
