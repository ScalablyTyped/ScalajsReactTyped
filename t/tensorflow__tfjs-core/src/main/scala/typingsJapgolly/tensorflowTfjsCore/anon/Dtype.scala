package typingsJapgolly.tensorflowTfjsCore.anon

import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float16
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.uint16
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.uint8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dtype extends StObject {
  
  var dtype: uint16 | uint8 | float16
  
  var min: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
}
object Dtype {
  
  inline def apply(dtype: uint16 | uint8 | float16): Dtype = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dtype]
  }
  
  extension [Self <: Dtype](x: Self) {
    
    inline def setDtype(value: uint16 | uint8 | float16): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
