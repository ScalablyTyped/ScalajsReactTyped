package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlashCommands[T] extends StObject {
  
  def addResponse(opts: SlashCommandOptions[T]): Unit
  
  var calls: js.Array[SlashCommandCall[T]]
  
  def reset(): Unit
  
  def send(targetUrl: SlashCommandUrl, body: T): js.Promise[Unit]
}
object SlashCommands {
  
  inline def apply[T](
    addResponse: SlashCommandOptions[T] => Callback,
    calls: js.Array[SlashCommandCall[T]],
    reset: Callback,
    send: (SlashCommandUrl, T) => js.Promise[Unit]
  ): SlashCommands[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1((t0: SlashCommandOptions[T]) => addResponse(t0).runNow()), calls = calls.asInstanceOf[js.Any], reset = reset.toJsFn, send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[SlashCommands[T]]
  }
  
  extension [Self <: SlashCommands[?], T](x: Self & SlashCommands[T]) {
    
    inline def setAddResponse(value: SlashCommandOptions[T] => Callback): Self = StObject.set(x, "addResponse", js.Any.fromFunction1((t0: SlashCommandOptions[T]) => value(t0).runNow()))
    
    inline def setCalls(value: js.Array[SlashCommandCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsVarargs(value: SlashCommandCall[T]*): Self = StObject.set(x, "calls", js.Array(value*))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSend(value: (SlashCommandUrl, T) => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
  }
}
