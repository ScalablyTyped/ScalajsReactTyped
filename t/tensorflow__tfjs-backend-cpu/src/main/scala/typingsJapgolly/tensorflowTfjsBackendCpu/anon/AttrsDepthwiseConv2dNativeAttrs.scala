package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.DepthwiseConv2dNativeAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.DepthwiseConv2dNativeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsDepthwiseConv2dNativeAttrs extends StObject {
  
  var attrs: DepthwiseConv2dNativeAttrs
  
  var backend: MathBackendCPU
  
  var inputs: DepthwiseConv2dNativeInputs
}
object AttrsDepthwiseConv2dNativeAttrs {
  
  inline def apply(attrs: DepthwiseConv2dNativeAttrs, backend: MathBackendCPU, inputs: DepthwiseConv2dNativeInputs): AttrsDepthwiseConv2dNativeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDepthwiseConv2dNativeAttrs]
  }
  
  extension [Self <: AttrsDepthwiseConv2dNativeAttrs](x: Self) {
    
    inline def setAttrs(value: DepthwiseConv2dNativeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: DepthwiseConv2dNativeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
