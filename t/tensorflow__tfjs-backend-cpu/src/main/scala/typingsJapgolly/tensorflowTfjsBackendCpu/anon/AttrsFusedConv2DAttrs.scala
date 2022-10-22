package typingsJapgolly.tensorflowTfjsBackendCpu.anon

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.FusedConv2DAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.FusedConv2DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsFusedConv2DAttrs extends StObject {
  
  var attrs: FusedConv2DAttrs
  
  var backend: MathBackendCPU
  
  var inputs: FusedConv2DInputs
}
object AttrsFusedConv2DAttrs {
  
  inline def apply(attrs: FusedConv2DAttrs, backend: MathBackendCPU, inputs: FusedConv2DInputs): AttrsFusedConv2DAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsFusedConv2DAttrs]
  }
  
  extension [Self <: AttrsFusedConv2DAttrs](x: Self) {
    
    inline def setAttrs(value: FusedConv2DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: FusedConv2DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
