package typingsJapgolly.reactDates.anon

import typingsJapgolly.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndDate extends StObject {
  
  var endDate: Moment | Null
  
  var startDate: Moment | Null
}
object EndDate {
  
  inline def apply(): EndDate = {
    val __obj = js.Dynamic.literal(endDate = null, startDate = null)
    __obj.asInstanceOf[EndDate]
  }
  
  extension [Self <: EndDate](x: Self) {
    
    inline def setEndDate(value: Moment): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setStartDate(value: Moment): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
  }
}
