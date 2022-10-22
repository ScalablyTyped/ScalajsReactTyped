package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.RaggedRangeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsRaggedRangeInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: RaggedRangeInputs
}
object InputsRaggedRangeInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: RaggedRangeInputs): InputsRaggedRangeInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsRaggedRangeInputs]
  }
  
  extension [Self <: InputsRaggedRangeInputs](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: RaggedRangeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
