package typingsJapgolly.workerbApi

import typingsJapgolly.workerbApi.workerbApiStrings.keydown
import typingsJapgolly.workerbApi.workerbApiStrings.keyup
import typingsJapgolly.workerbApi.workerbApiStrings.mousedown
import typingsJapgolly.workerbApi.workerbApiStrings.mouseenter
import typingsJapgolly.workerbApi.workerbApiStrings.mouseleave
import typingsJapgolly.workerbApi.workerbApiStrings.mousemove
import typingsJapgolly.workerbApi.workerbApiStrings.mouseout
import typingsJapgolly.workerbApi.workerbApiStrings.mouseover
import typingsJapgolly.workerbApi.workerbApiStrings.mouseup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventConfig extends StObject {
  
  /**
    * An object used to specify the event properties. For key related event types, KeyboardEvent is supported. For mouse related event types, MouseEvent is supported.
    */
  var eventProps: js.UndefOr[js.Object] = js.undefined
  
  /**
    * A string value used to the specify the type of the event.
    */
  var eventType: keydown | keyup | mousedown | mouseenter | mouseleave | mousemove | mouseout | mouseover | mouseup
}
object EventConfig {
  
  inline def apply(
    eventType: keydown | keyup | mousedown | mouseenter | mouseleave | mousemove | mouseout | mouseover | mouseup
  ): EventConfig = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventConfig]
  }
  
  extension [Self <: EventConfig](x: Self) {
    
    inline def setEventProps(value: js.Object): Self = StObject.set(x, "eventProps", value.asInstanceOf[js.Any])
    
    inline def setEventPropsUndefined: Self = StObject.set(x, "eventProps", js.undefined)
    
    inline def setEventType(
      value: keydown | keyup | mousedown | mouseenter | mouseleave | mousemove | mouseout | mouseover | mouseup
    ): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
  }
}
