package typingsJapgolly.fullcalendarCommon.mod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fullcalendar/common.@fullcalendar/common.MountArg<@fullcalendar/common.@fullcalendar/common.AllDayContentArg> */
trait AllDayMountArg extends StObject {
  
  var el: HTMLElement
  
  var text: String
  
  var view: ViewApi
}
object AllDayMountArg {
  
  inline def apply(el: HTMLElement, text: String, view: ViewApi): AllDayMountArg = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDayMountArg]
  }
  
  extension [Self <: AllDayMountArg](x: Self) {
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
