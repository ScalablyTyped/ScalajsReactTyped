package typingsJapgolly.reactBigCalendar.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateHeaderProps extends StObject {
  
  var date: js.Date
  
  var drilldownView: String
  
  var isOffRange: Boolean
  
  var label: String
  
  def onDrillDown(): Unit
}
object DateHeaderProps {
  
  inline def apply(date: js.Date, drilldownView: String, isOffRange: Boolean, label: String, onDrillDown: Callback): DateHeaderProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], drilldownView = drilldownView.asInstanceOf[js.Any], isOffRange = isOffRange.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onDrillDown = onDrillDown.toJsFn)
    __obj.asInstanceOf[DateHeaderProps]
  }
  
  extension [Self <: DateHeaderProps](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDrilldownView(value: String): Self = StObject.set(x, "drilldownView", value.asInstanceOf[js.Any])
    
    inline def setIsOffRange(value: Boolean): Self = StObject.set(x, "isOffRange", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnDrillDown(value: Callback): Self = StObject.set(x, "onDrillDown", value.toJsFn)
  }
}
