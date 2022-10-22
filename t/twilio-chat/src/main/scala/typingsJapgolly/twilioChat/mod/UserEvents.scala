package typingsJapgolly.twilioChat.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.twilioChat.anon.UpdateReasons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserEvents extends StObject {
  
  def updated(data: UpdateReasons): Unit
  
  def userSubscribed(user: User): Unit
  
  def userUnsubscribed(user: User): Unit
}
object UserEvents {
  
  inline def apply(
    updated: UpdateReasons => Callback,
    userSubscribed: User => Callback,
    userUnsubscribed: User => Callback
  ): UserEvents = {
    val __obj = js.Dynamic.literal(updated = js.Any.fromFunction1((t0: UpdateReasons) => updated(t0).runNow()), userSubscribed = js.Any.fromFunction1((t0: User) => userSubscribed(t0).runNow()), userUnsubscribed = js.Any.fromFunction1((t0: User) => userUnsubscribed(t0).runNow()))
    __obj.asInstanceOf[UserEvents]
  }
  
  extension [Self <: UserEvents](x: Self) {
    
    inline def setUpdated(value: UpdateReasons => Callback): Self = StObject.set(x, "updated", js.Any.fromFunction1((t0: UpdateReasons) => value(t0).runNow()))
    
    inline def setUserSubscribed(value: User => Callback): Self = StObject.set(x, "userSubscribed", js.Any.fromFunction1((t0: User) => value(t0).runNow()))
    
    inline def setUserUnsubscribed(value: User => Callback): Self = StObject.set(x, "userUnsubscribed", js.Any.fromFunction1((t0: User) => value(t0).runNow()))
  }
}
