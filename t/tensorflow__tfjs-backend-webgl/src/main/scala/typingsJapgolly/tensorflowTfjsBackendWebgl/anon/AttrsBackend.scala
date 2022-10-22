package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.AnyAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.AnyInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBackend extends StObject {
  
  var attrs: AnyAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: AnyInputs
}
object AttrsBackend {
  
  inline def apply(attrs: AnyAttrs, backend: MathBackendWebGL, inputs: AnyInputs): AttrsBackend = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackend]
  }
  
  extension [Self <: AttrsBackend](x: Self) {
    
    inline def setAttrs(value: AnyAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: AnyInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
