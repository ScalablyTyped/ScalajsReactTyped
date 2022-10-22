package typingsJapgolly.twilioChat.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEvents extends StObject {
  
  def updated(data: typingsJapgolly.twilioChat.anon.Message): Unit
}
object MessageEvents {
  
  inline def apply(updated: typingsJapgolly.twilioChat.anon.Message => Callback): MessageEvents = {
    val __obj = js.Dynamic.literal(updated = js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Message) => updated(t0).runNow()))
    __obj.asInstanceOf[MessageEvents]
  }
  
  extension [Self <: MessageEvents](x: Self) {
    
    inline def setUpdated(value: typingsJapgolly.twilioChat.anon.Message => Callback): Self = StObject.set(x, "updated", js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Message) => value(t0).runNow()))
  }
}
