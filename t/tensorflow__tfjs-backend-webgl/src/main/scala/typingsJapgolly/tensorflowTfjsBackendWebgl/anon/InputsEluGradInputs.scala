package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.EluGradInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsEluGradInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: EluGradInputs
}
object InputsEluGradInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: EluGradInputs): InputsEluGradInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsEluGradInputs]
  }
  
  extension [Self <: InputsEluGradInputs](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: EluGradInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
