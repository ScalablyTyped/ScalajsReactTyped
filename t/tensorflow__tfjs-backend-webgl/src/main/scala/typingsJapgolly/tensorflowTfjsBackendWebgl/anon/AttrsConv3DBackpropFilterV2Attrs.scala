package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.Conv3DBackpropFilterV2Attrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.Conv3DBackpropFilterV2Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsConv3DBackpropFilterV2Attrs extends StObject {
  
  var attrs: Conv3DBackpropFilterV2Attrs
  
  var backend: MathBackendWebGL
  
  var inputs: Conv3DBackpropFilterV2Inputs
}
object AttrsConv3DBackpropFilterV2Attrs {
  
  inline def apply(
    attrs: Conv3DBackpropFilterV2Attrs,
    backend: MathBackendWebGL,
    inputs: Conv3DBackpropFilterV2Inputs
  ): AttrsConv3DBackpropFilterV2Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv3DBackpropFilterV2Attrs]
  }
  
  extension [Self <: AttrsConv3DBackpropFilterV2Attrs](x: Self) {
    
    inline def setAttrs(value: Conv3DBackpropFilterV2Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: Conv3DBackpropFilterV2Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
