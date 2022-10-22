package typingsJapgolly.twilioChat.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.twilioChat.anon.UpdateReasons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersEvents extends StObject {
  
  def userSubscribed(user: User): Unit
  
  def userUnsubscribed(user: User): Unit
  
  def userUpdated(data: UpdateReasons): Unit
}
object UsersEvents {
  
  inline def apply(
    userSubscribed: User => Callback,
    userUnsubscribed: User => Callback,
    userUpdated: UpdateReasons => Callback
  ): UsersEvents = {
    val __obj = js.Dynamic.literal(userSubscribed = js.Any.fromFunction1((t0: User) => userSubscribed(t0).runNow()), userUnsubscribed = js.Any.fromFunction1((t0: User) => userUnsubscribed(t0).runNow()), userUpdated = js.Any.fromFunction1((t0: UpdateReasons) => userUpdated(t0).runNow()))
    __obj.asInstanceOf[UsersEvents]
  }
  
  extension [Self <: UsersEvents](x: Self) {
    
    inline def setUserSubscribed(value: User => Callback): Self = StObject.set(x, "userSubscribed", js.Any.fromFunction1((t0: User) => value(t0).runNow()))
    
    inline def setUserUnsubscribed(value: User => Callback): Self = StObject.set(x, "userUnsubscribed", js.Any.fromFunction1((t0: User) => value(t0).runNow()))
    
    inline def setUserUpdated(value: UpdateReasons => Callback): Self = StObject.set(x, "userUpdated", js.Any.fromFunction1((t0: UpdateReasons) => value(t0).runNow()))
  }
}
