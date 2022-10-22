package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ExpandDimsAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.ExpandDimsInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsExpandDimsAttrs extends StObject {
  
  var attrs: ExpandDimsAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: ExpandDimsInputs
}
object AttrsExpandDimsAttrs {
  
  inline def apply(attrs: ExpandDimsAttrs, backend: MathBackendWebGL, inputs: ExpandDimsInputs): AttrsExpandDimsAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsExpandDimsAttrs]
  }
  
  extension [Self <: AttrsExpandDimsAttrs](x: Self) {
    
    inline def setAttrs(value: ExpandDimsAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ExpandDimsInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
