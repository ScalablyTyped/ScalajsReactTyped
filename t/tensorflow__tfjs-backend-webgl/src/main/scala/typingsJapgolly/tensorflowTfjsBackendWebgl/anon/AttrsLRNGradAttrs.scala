package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.LRNGradAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.LRNGradInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsLRNGradAttrs extends StObject {
  
  var attrs: LRNGradAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: LRNGradInputs
}
object AttrsLRNGradAttrs {
  
  inline def apply(attrs: LRNGradAttrs, backend: MathBackendWebGL, inputs: LRNGradInputs): AttrsLRNGradAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsLRNGradAttrs]
  }
  
  extension [Self <: AttrsLRNGradAttrs](x: Self) {
    
    inline def setAttrs(value: LRNGradAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: LRNGradInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
