package typingsJapgolly.mongodb.mod

import typingsJapgolly.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionEvents extends StObject {
  
  def close(): Unit
  
  def clusterTimeReceived(clusterTime: Document): Unit
  
  def commandFailed(event: CommandFailedEvent): Unit
  
  def commandStarted(event: CommandStartedEvent): Unit
  
  def commandSucceeded(event: CommandSucceededEvent): Unit
  
  def message(message: Any): Unit
  
  def pinned(pinType: String): Unit
  
  def unpinned(pinType: String): Unit
}
object ConnectionEvents {
  
  inline def apply(
    close: japgolly.scalajs.react.Callback,
    clusterTimeReceived: Document => japgolly.scalajs.react.Callback,
    commandFailed: CommandFailedEvent => japgolly.scalajs.react.Callback,
    commandStarted: CommandStartedEvent => japgolly.scalajs.react.Callback,
    commandSucceeded: CommandSucceededEvent => japgolly.scalajs.react.Callback,
    message: Any => japgolly.scalajs.react.Callback,
    pinned: String => japgolly.scalajs.react.Callback,
    unpinned: String => japgolly.scalajs.react.Callback
  ): ConnectionEvents = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, clusterTimeReceived = js.Any.fromFunction1((t0: Document) => clusterTimeReceived(t0).runNow()), commandFailed = js.Any.fromFunction1((t0: CommandFailedEvent) => commandFailed(t0).runNow()), commandStarted = js.Any.fromFunction1((t0: CommandStartedEvent) => commandStarted(t0).runNow()), commandSucceeded = js.Any.fromFunction1((t0: CommandSucceededEvent) => commandSucceeded(t0).runNow()), message = js.Any.fromFunction1((t0: Any) => message(t0).runNow()), pinned = js.Any.fromFunction1((t0: String) => pinned(t0).runNow()), unpinned = js.Any.fromFunction1((t0: String) => unpinned(t0).runNow()))
    __obj.asInstanceOf[ConnectionEvents]
  }
  
  extension [Self <: ConnectionEvents](x: Self) {
    
    inline def setClose(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setClusterTimeReceived(value: Document => japgolly.scalajs.react.Callback): Self = StObject.set(x, "clusterTimeReceived", js.Any.fromFunction1((t0: Document) => value(t0).runNow()))
    
    inline def setCommandFailed(value: CommandFailedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "commandFailed", js.Any.fromFunction1((t0: CommandFailedEvent) => value(t0).runNow()))
    
    inline def setCommandStarted(value: CommandStartedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "commandStarted", js.Any.fromFunction1((t0: CommandStartedEvent) => value(t0).runNow()))
    
    inline def setCommandSucceeded(value: CommandSucceededEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "commandSucceeded", js.Any.fromFunction1((t0: CommandSucceededEvent) => value(t0).runNow()))
    
    inline def setMessage(value: Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "message", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setPinned(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "pinned", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUnpinned(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "unpinned", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
