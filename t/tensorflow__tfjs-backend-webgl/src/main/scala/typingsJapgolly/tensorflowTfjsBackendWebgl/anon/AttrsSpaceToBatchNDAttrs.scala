package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.SpaceToBatchNDAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.SpaceToBatchNDInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsSpaceToBatchNDAttrs extends StObject {
  
  var attrs: SpaceToBatchNDAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: SpaceToBatchNDInputs
}
object AttrsSpaceToBatchNDAttrs {
  
  inline def apply(attrs: SpaceToBatchNDAttrs, backend: MathBackendWebGL, inputs: SpaceToBatchNDInputs): AttrsSpaceToBatchNDAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSpaceToBatchNDAttrs]
  }
  
  extension [Self <: AttrsSpaceToBatchNDAttrs](x: Self) {
    
    inline def setAttrs(value: SpaceToBatchNDAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SpaceToBatchNDInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
