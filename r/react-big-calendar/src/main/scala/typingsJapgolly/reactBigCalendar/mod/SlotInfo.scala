package typingsJapgolly.reactBigCalendar.mod

import typingsJapgolly.reactBigCalendar.anon.Bottom
import typingsJapgolly.reactBigCalendar.anon.ClientX
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.click
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.doubleClick
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotInfo extends StObject {
  
  var action: select | click | doubleClick
  
  var bounds: js.UndefOr[Bottom] = js.undefined
  
  var box: js.UndefOr[ClientX] = js.undefined
  
  var end: js.Date
  
  var resourceId: js.UndefOr[Double | String] = js.undefined
  
  var slots: js.Array[js.Date]
  
  var start: js.Date
}
object SlotInfo {
  
  inline def apply(action: select | click | doubleClick, end: js.Date, slots: js.Array[js.Date], start: js.Date): SlotInfo = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotInfo]
  }
  
  extension [Self <: SlotInfo](x: Self) {
    
    inline def setAction(value: select | click | doubleClick): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setBounds(value: Bottom): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setBox(value: ClientX): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: Double | String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setSlots(value: js.Array[js.Date]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsVarargs(value: js.Date*): Self = StObject.set(x, "slots", js.Array(value*))
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
