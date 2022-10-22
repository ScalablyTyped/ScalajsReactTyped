package typingsJapgolly.bootstrapTimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryEventObject extends StObject {
  
  var time: js.UndefOr[TimepickerTime] = js.undefined
}
object JQueryEventObject {
  
  inline def apply(): JQueryEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryEventObject]
  }
  
  extension [Self <: JQueryEventObject](x: Self) {
    
    inline def setTime(value: TimepickerTime): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
