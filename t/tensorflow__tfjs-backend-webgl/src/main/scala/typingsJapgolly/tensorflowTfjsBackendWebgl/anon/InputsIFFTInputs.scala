package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.IFFTInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsIFFTInputs extends StObject {
  
  var backend: MathBackendWebGL
  
  var inputs: IFFTInputs
}
object InputsIFFTInputs {
  
  inline def apply(backend: MathBackendWebGL, inputs: IFFTInputs): InputsIFFTInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsIFFTInputs]
  }
  
  extension [Self <: InputsIFFTInputs](x: Self) {
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: IFFTInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
