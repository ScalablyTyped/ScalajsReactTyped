package typingsJapgolly.limeJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessageChannel extends StObject {
  
  def onMessage(message: Message): Any
  
  def sendMessage(message: Message): Unit
}
object IMessageChannel {
  
  inline def apply(onMessage: Message => Any, sendMessage: Message => Callback): IMessageChannel = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1(onMessage), sendMessage = js.Any.fromFunction1((t0: Message) => sendMessage(t0).runNow()))
    __obj.asInstanceOf[IMessageChannel]
  }
  
  extension [Self <: IMessageChannel](x: Self) {
    
    inline def setOnMessage(value: Message => Any): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    inline def setSendMessage(value: Message => Callback): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1((t0: Message) => value(t0).runNow()))
  }
}
