package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'logits'> */
trait LogSoftmaxInputs extends StObject {
  
  var logits: js.UndefOr[scala.Any] = js.undefined
}
object LogSoftmaxInputs {
  
  inline def apply(): LogSoftmaxInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSoftmaxInputs]
  }
  
  extension [Self <: LogSoftmaxInputs](x: Self) {
    
    inline def setLogits(value: scala.Any): Self = StObject.set(x, "logits", value.asInstanceOf[js.Any])
    
    inline def setLogitsUndefined: Self = StObject.set(x, "logits", js.undefined)
  }
}
