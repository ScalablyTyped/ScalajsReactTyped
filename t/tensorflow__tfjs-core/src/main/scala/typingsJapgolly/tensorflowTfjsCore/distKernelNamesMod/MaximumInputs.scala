package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.BinaryInputs */
trait MaximumInputs extends StObject {
  
  var a: js.UndefOr[scala.Any] = js.undefined
  
  var b: js.UndefOr[scala.Any] = js.undefined
}
object MaximumInputs {
  
  inline def apply(): MaximumInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximumInputs]
  }
  
  extension [Self <: MaximumInputs](x: Self) {
    
    inline def setA(value: scala.Any): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
    
    inline def setB(value: scala.Any): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
  }
}
