package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  var includeDates: js.UndefOr[js.Array[js.Date]] = js.undefined
  
  var maxDate: js.UndefOr[js.Date] = js.undefined
}
object `11` {
  
  inline def apply(): `11` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setIncludeDates(value: js.Array[js.Date]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
    
    inline def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
    
    inline def setIncludeDatesVarargs(value: js.Date*): Self = StObject.set(x, "includeDates", js.Array(value*))
    
    inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
  }
}
