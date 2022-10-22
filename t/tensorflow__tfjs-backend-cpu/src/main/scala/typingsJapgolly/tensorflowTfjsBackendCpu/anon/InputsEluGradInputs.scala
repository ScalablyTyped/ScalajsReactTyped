package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.EluGradInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsEluGradInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: EluGradInputs
}
object InputsEluGradInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: EluGradInputs): InputsEluGradInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsEluGradInputs]
  }
  
  extension [Self <: InputsEluGradInputs](x: Self) {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: EluGradInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
