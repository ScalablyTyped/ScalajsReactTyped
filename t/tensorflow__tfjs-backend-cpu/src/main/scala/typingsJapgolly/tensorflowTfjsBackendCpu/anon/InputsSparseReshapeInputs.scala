package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.SparseReshapeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsSparseReshapeInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: SparseReshapeInputs
}
object InputsSparseReshapeInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: SparseReshapeInputs): InputsSparseReshapeInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsSparseReshapeInputs]
  }
  
  extension [Self <: InputsSparseReshapeInputs](x: Self) {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SparseReshapeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
