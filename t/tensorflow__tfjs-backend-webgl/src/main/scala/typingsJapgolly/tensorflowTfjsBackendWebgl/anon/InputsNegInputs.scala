package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.NegInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsNegInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: NegInputs
}
object InputsNegInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: NegInputs): InputsNegInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsNegInputs]
  }
  
  extension [Self <: InputsNegInputs](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: NegInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
