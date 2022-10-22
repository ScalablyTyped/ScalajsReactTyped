package typingsJapgolly.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeMaxPoint extends StObject {
  
  /**
    * Specifies the width of the image that represents the maximum point in a range area series.
    */
  var rangeMaxPoint: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the width of the image that represents the minimum point in a range area series.
    */
  var rangeMinPoint: js.UndefOr[Double] = js.undefined
}
object RangeMaxPoint {
  
  inline def apply(): RangeMaxPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeMaxPoint]
  }
  
  extension [Self <: RangeMaxPoint](x: Self) {
    
    inline def setRangeMaxPoint(value: Double): Self = StObject.set(x, "rangeMaxPoint", value.asInstanceOf[js.Any])
    
    inline def setRangeMaxPointUndefined: Self = StObject.set(x, "rangeMaxPoint", js.undefined)
    
    inline def setRangeMinPoint(value: Double): Self = StObject.set(x, "rangeMinPoint", value.asInstanceOf[js.Any])
    
    inline def setRangeMinPointUndefined: Self = StObject.set(x, "rangeMinPoint", js.undefined)
  }
}
