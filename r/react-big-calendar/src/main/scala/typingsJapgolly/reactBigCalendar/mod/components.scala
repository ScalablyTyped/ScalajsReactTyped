package typingsJapgolly.reactBigCalendar.mod

import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait components extends StObject {
  
  var dateCellWrapper: ComponentType[js.Object]
  
  var eventWrapper: ComponentType[Event]
}
object components {
  
  inline def apply(dateCellWrapper: ComponentType[js.Object], eventWrapper: ComponentType[Event]): components = {
    val __obj = js.Dynamic.literal(dateCellWrapper = dateCellWrapper.asInstanceOf[js.Any], eventWrapper = eventWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[components]
  }
  
  extension [Self <: components](x: Self) {
    
    inline def setDateCellWrapper(value: ComponentType[js.Object]): Self = StObject.set(x, "dateCellWrapper", value.asInstanceOf[js.Any])
    
    inline def setEventWrapper(value: ComponentType[Event]): Self = StObject.set(x, "eventWrapper", value.asInstanceOf[js.Any])
  }
}
