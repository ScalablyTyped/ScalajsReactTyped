package typingsJapgolly.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationAlgorithm extends StObject {
  
  var interpolationAlgorithm: js.UndefOr[typingsJapgolly.cesium.mod.InterpolationAlgorithm] = js.undefined
  
  var interpolationDegree: js.UndefOr[Double] = js.undefined
}
object InterpolationAlgorithm {
  
  inline def apply(): InterpolationAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolationAlgorithm]
  }
  
  extension [Self <: InterpolationAlgorithm](x: Self) {
    
    inline def setInterpolationAlgorithm(value: typingsJapgolly.cesium.mod.InterpolationAlgorithm): Self = StObject.set(x, "interpolationAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setInterpolationAlgorithmUndefined: Self = StObject.set(x, "interpolationAlgorithm", js.undefined)
    
    inline def setInterpolationDegree(value: Double): Self = StObject.set(x, "interpolationDegree", value.asInstanceOf[js.Any])
    
    inline def setInterpolationDegreeUndefined: Self = StObject.set(x, "interpolationDegree", js.undefined)
  }
}
