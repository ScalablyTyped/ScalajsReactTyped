package typingsJapgolly.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenDateRange extends StObject {
  
  var end: js.Date | Null
  
  var start: js.Date | Null
}
object OpenDateRange {
  
  inline def apply(): OpenDateRange = {
    val __obj = js.Dynamic.literal(end = null, start = null)
    __obj.asInstanceOf[OpenDateRange]
  }
  
  extension [Self <: OpenDateRange](x: Self) {
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
  }
}
