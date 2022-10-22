package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.baseui.dataTableTypesMod.Row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: ReactEventFrom[HTMLButtonElement]
  
  var row: Row
}
object Event {
  
  inline def apply(event: ReactEventFrom[HTMLButtonElement], row: Row): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEvent(value: ReactEventFrom[HTMLButtonElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Row): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
