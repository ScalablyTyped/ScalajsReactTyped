package typingsJapgolly.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintAccuracySupported extends StObject {
  
  var `accuracy-units`: js.UndefOr[AccuracyUnits] = js.undefined
  
  var `x-accuracy`: js.UndefOr[Double] = js.undefined
  
  var `y-accuracy`: js.UndefOr[Double] = js.undefined
  
  var `z-accuracy`: js.UndefOr[Double] = js.undefined
}
object PrintAccuracySupported {
  
  inline def apply(): PrintAccuracySupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintAccuracySupported]
  }
  
  extension [Self <: PrintAccuracySupported](x: Self) {
    
    inline def `setAccuracy-units`(value: AccuracyUnits): Self = StObject.set(x, "accuracy-units", value.asInstanceOf[js.Any])
    
    inline def `setAccuracy-unitsUndefined`: Self = StObject.set(x, "accuracy-units", js.undefined)
    
    inline def `setX-accuracy`(value: Double): Self = StObject.set(x, "x-accuracy", value.asInstanceOf[js.Any])
    
    inline def `setX-accuracyUndefined`: Self = StObject.set(x, "x-accuracy", js.undefined)
    
    inline def `setY-accuracy`(value: Double): Self = StObject.set(x, "y-accuracy", value.asInstanceOf[js.Any])
    
    inline def `setY-accuracyUndefined`: Self = StObject.set(x, "y-accuracy", js.undefined)
    
    inline def `setZ-accuracy`(value: Double): Self = StObject.set(x, "z-accuracy", value.asInstanceOf[js.Any])
    
    inline def `setZ-accuracyUndefined`: Self = StObject.set(x, "z-accuracy", js.undefined)
  }
}
