package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ScatterNdAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ScatterNdInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsScatterNdAttrs extends StObject {
  
  var attrs: ScatterNdAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: ScatterNdInputs
}
object AttrsScatterNdAttrs {
  
  inline def apply(attrs: ScatterNdAttrs, backend: MathBackendWebGL, inputs: ScatterNdInputs): AttrsScatterNdAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsScatterNdAttrs]
  }
  
  extension [Self <: AttrsScatterNdAttrs](x: Self) {
    
    inline def setAttrs(value: ScatterNdAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ScatterNdInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
