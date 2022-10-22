package typingsJapgolly.twilioChat.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberEvents extends StObject {
  
  def typingEnded(member: Member): Unit
  
  def typingStarted(member: Member): Unit
  
  def updated(data: typingsJapgolly.twilioChat.anon.Member): Unit
}
object MemberEvents {
  
  inline def apply(
    typingEnded: Member => Callback,
    typingStarted: Member => Callback,
    updated: typingsJapgolly.twilioChat.anon.Member => Callback
  ): MemberEvents = {
    val __obj = js.Dynamic.literal(typingEnded = js.Any.fromFunction1((t0: Member) => typingEnded(t0).runNow()), typingStarted = js.Any.fromFunction1((t0: Member) => typingStarted(t0).runNow()), updated = js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Member) => updated(t0).runNow()))
    __obj.asInstanceOf[MemberEvents]
  }
  
  extension [Self <: MemberEvents](x: Self) {
    
    inline def setTypingEnded(value: Member => Callback): Self = StObject.set(x, "typingEnded", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setTypingStarted(value: Member => Callback): Self = StObject.set(x, "typingStarted", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setUpdated(value: typingsJapgolly.twilioChat.anon.Member => Callback): Self = StObject.set(x, "updated", js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Member) => value(t0).runNow()))
  }
}
