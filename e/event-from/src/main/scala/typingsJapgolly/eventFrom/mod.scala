package typingsJapgolly.eventFrom

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("event-from", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventFrom(event: Record[String, Any]): EventFromInput = ^.asInstanceOf[js.Dynamic].applyDynamic("eventFrom")(event.asInstanceOf[js.Any]).asInstanceOf[EventFromInput]
  
  inline def setEventFrom(value: EventFromInput): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEventFrom")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.eventFrom.eventFromStrings.mouse
    - typingsJapgolly.eventFrom.eventFromStrings.touch
    - typingsJapgolly.eventFrom.eventFromStrings.key
  */
  trait EventFromInput extends StObject
  object EventFromInput {
    
    inline def key: typingsJapgolly.eventFrom.eventFromStrings.key = "key".asInstanceOf[typingsJapgolly.eventFrom.eventFromStrings.key]
    
    inline def mouse: typingsJapgolly.eventFrom.eventFromStrings.mouse = "mouse".asInstanceOf[typingsJapgolly.eventFrom.eventFromStrings.mouse]
    
    inline def touch: typingsJapgolly.eventFrom.eventFromStrings.touch = "touch".asInstanceOf[typingsJapgolly.eventFrom.eventFromStrings.touch]
  }
}
