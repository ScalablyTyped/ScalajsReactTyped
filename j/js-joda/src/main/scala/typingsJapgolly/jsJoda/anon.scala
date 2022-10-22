package typingsJapgolly.jsJoda

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ToDate extends StObject {
    
    def toDate(): js.Date
    
    def toEpochMilli(): Double
  }
  object ToDate {
    
    inline def apply(toDate: CallbackTo[js.Date], toEpochMilli: CallbackTo[Double]): ToDate = {
      val __obj = js.Dynamic.literal(toDate = toDate.toJsFn, toEpochMilli = toEpochMilli.toJsFn)
      __obj.asInstanceOf[ToDate]
    }
    
    extension [Self <: ToDate](x: Self) {
      
      inline def setToDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "toDate", value.toJsFn)
      
      inline def setToEpochMilli(value: CallbackTo[Double]): Self = StObject.set(x, "toEpochMilli", value.toJsFn)
    }
  }
}
