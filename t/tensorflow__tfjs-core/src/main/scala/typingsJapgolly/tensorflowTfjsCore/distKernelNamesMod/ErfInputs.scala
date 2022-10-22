package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.UnaryInputs */
trait ErfInputs extends StObject {
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object ErfInputs {
  
  inline def apply(): ErfInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErfInputs]
  }
  
  extension [Self <: ErfInputs](x: Self) {
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
