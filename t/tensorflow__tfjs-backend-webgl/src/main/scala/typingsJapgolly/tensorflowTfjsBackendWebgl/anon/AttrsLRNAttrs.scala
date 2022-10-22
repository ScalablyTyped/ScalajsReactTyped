package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.LRNAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.LRNInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsLRNAttrs extends StObject {
  
  var attrs: LRNAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: LRNInputs
}
object AttrsLRNAttrs {
  
  inline def apply(attrs: LRNAttrs, backend: MathBackendWebGL, inputs: LRNInputs): AttrsLRNAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsLRNAttrs]
  }
  
  extension [Self <: AttrsLRNAttrs](x: Self) {
    
    inline def setAttrs(value: LRNAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: LRNInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
