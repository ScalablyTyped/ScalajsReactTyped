package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ComplexAbsInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsComplexAbsInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: ComplexAbsInputs
}
object InputsComplexAbsInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: ComplexAbsInputs): InputsComplexAbsInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsComplexAbsInputs]
  }
  
  extension [Self <: InputsComplexAbsInputs](x: Self) {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ComplexAbsInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
