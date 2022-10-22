package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ReshapeAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ReshapeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsReshapeAttrs extends StObject {
  
  var attrs: ReshapeAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: ReshapeInputs
}
object AttrsReshapeAttrs {
  
  inline def apply(attrs: ReshapeAttrs, backend: MathBackendWebGL, inputs: ReshapeInputs): AttrsReshapeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsReshapeAttrs]
  }
  
  extension [Self <: AttrsReshapeAttrs](x: Self) {
    
    inline def setAttrs(value: ReshapeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ReshapeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
