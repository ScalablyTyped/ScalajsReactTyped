package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.NonMaxSuppressionV3Attrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.NonMaxSuppressionV3Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsNonMaxSuppressionV3Attrs extends StObject {
  
  var attrs: NonMaxSuppressionV3Attrs
  
  var backend: MathBackendWebGL
  
  var inputs: NonMaxSuppressionV3Inputs
}
object AttrsNonMaxSuppressionV3Attrs {
  
  inline def apply(attrs: NonMaxSuppressionV3Attrs, backend: MathBackendWebGL, inputs: NonMaxSuppressionV3Inputs): AttrsNonMaxSuppressionV3Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsNonMaxSuppressionV3Attrs]
  }
  
  extension [Self <: AttrsNonMaxSuppressionV3Attrs](x: Self) {
    
    inline def setAttrs(value: NonMaxSuppressionV3Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: NonMaxSuppressionV3Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
