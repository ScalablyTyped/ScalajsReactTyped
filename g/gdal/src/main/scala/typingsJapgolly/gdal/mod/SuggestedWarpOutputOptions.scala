package typingsJapgolly.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestedWarpOutputOptions extends StObject {
  
  var maxError: js.UndefOr[Double] = js.undefined
  
  var s_srs: SpatialReference
  
  var src: Dataset
  
  var t_srs: SpatialReference
}
object SuggestedWarpOutputOptions {
  
  inline def apply(s_srs: SpatialReference, src: Dataset, t_srs: SpatialReference): SuggestedWarpOutputOptions = {
    val __obj = js.Dynamic.literal(s_srs = s_srs.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], t_srs = t_srs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedWarpOutputOptions]
  }
  
  extension [Self <: SuggestedWarpOutputOptions](x: Self) {
    
    inline def setMaxError(value: Double): Self = StObject.set(x, "maxError", value.asInstanceOf[js.Any])
    
    inline def setMaxErrorUndefined: Self = StObject.set(x, "maxError", js.undefined)
    
    inline def setS_srs(value: SpatialReference): Self = StObject.set(x, "s_srs", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: Dataset): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setT_srs(value: SpatialReference): Self = StObject.set(x, "t_srs", value.asInstanceOf[js.Any])
  }
}
