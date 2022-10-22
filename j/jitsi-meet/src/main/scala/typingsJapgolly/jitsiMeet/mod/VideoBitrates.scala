package typingsJapgolly.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoBitrates extends StObject {
  
  var high: js.UndefOr[Double] = js.undefined
  
  var low: js.UndefOr[Double] = js.undefined
  
  var standard: js.UndefOr[Double] = js.undefined
}
object VideoBitrates {
  
  inline def apply(): VideoBitrates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoBitrates]
  }
  
  extension [Self <: VideoBitrates](x: Self) {
    
    inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setStandard(value: Double): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
