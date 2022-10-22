package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.DepthwiseConv2dNativeBackpropFilterAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.DepthwiseConv2dNativeBackpropFilterInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsDepthwiseConv2dNativeBackpropFilterAttrs extends StObject {
  
  var attrs: DepthwiseConv2dNativeBackpropFilterAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: DepthwiseConv2dNativeBackpropFilterInputs
}
object AttrsDepthwiseConv2dNativeBackpropFilterAttrs {
  
  inline def apply(
    attrs: DepthwiseConv2dNativeBackpropFilterAttrs,
    backend: MathBackendWebGL,
    inputs: DepthwiseConv2dNativeBackpropFilterInputs
  ): AttrsDepthwiseConv2dNativeBackpropFilterAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDepthwiseConv2dNativeBackpropFilterAttrs]
  }
  
  extension [Self <: AttrsDepthwiseConv2dNativeBackpropFilterAttrs](x: Self) {
    
    inline def setAttrs(value: DepthwiseConv2dNativeBackpropFilterAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: DepthwiseConv2dNativeBackpropFilterInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
