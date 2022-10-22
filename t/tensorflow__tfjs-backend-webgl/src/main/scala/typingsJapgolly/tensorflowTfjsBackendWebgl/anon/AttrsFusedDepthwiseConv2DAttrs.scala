package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.FusedDepthwiseConv2DAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.FusedDepthwiseConv2DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsFusedDepthwiseConv2DAttrs extends StObject {
  
  var attrs: FusedDepthwiseConv2DAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: FusedDepthwiseConv2DInputs
}
object AttrsFusedDepthwiseConv2DAttrs {
  
  inline def apply(attrs: FusedDepthwiseConv2DAttrs, backend: MathBackendWebGL, inputs: FusedDepthwiseConv2DInputs): AttrsFusedDepthwiseConv2DAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsFusedDepthwiseConv2DAttrs]
  }
  
  extension [Self <: AttrsFusedDepthwiseConv2DAttrs](x: Self) {
    
    inline def setAttrs(value: FusedDepthwiseConv2DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: FusedDepthwiseConv2DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
