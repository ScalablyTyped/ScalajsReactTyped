package typingsJapgolly.reactBigCalendar.anon

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactBigCalendar.mod.DateHeaderProps
import typingsJapgolly.reactBigCalendar.mod.EventProps
import typingsJapgolly.reactBigCalendar.mod.HeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateHeader[TEvent /* <: js.Object */] extends StObject {
  
  var dateHeader: js.UndefOr[ComponentType[DateHeaderProps]] = js.undefined
  
  var event: js.UndefOr[ComponentType[EventProps[TEvent]]] = js.undefined
  
  var header: js.UndefOr[ComponentType[HeaderProps]] = js.undefined
}
object DateHeader {
  
  inline def apply[TEvent /* <: js.Object */](): DateHeader[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateHeader[TEvent]]
  }
  
  extension [Self <: DateHeader[?], TEvent /* <: js.Object */](x: Self & DateHeader[TEvent]) {
    
    inline def setDateHeader(value: ComponentType[DateHeaderProps]): Self = StObject.set(x, "dateHeader", value.asInstanceOf[js.Any])
    
    inline def setDateHeaderUndefined: Self = StObject.set(x, "dateHeader", js.undefined)
    
    inline def setEvent(value: ComponentType[EventProps[TEvent]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setHeader(value: ComponentType[HeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
