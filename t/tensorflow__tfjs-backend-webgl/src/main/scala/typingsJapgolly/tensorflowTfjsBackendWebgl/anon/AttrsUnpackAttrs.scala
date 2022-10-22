package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.UnpackAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.UnpackInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsUnpackAttrs extends StObject {
  
  var attrs: UnpackAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: UnpackInputs
}
object AttrsUnpackAttrs {
  
  inline def apply(attrs: UnpackAttrs, backend: MathBackendWebGL, inputs: UnpackInputs): AttrsUnpackAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsUnpackAttrs]
  }
  
  extension [Self <: AttrsUnpackAttrs](x: Self) {
    
    inline def setAttrs(value: UnpackAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: UnpackInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
