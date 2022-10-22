package typingsJapgolly.mongodb.mod

import typingsJapgolly.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {connectionPoolCreated (event : mongodb.mongodb.ConnectionPoolCreatedEvent): void, connectionPoolReady (event : mongodb.mongodb.ConnectionPoolReadyEvent): void, connectionPoolClosed (event : mongodb.mongodb.ConnectionPoolClosedEvent): void, connectionPoolCleared (event : mongodb.mongodb.ConnectionPoolClearedEvent): void, connectionCreated (event : mongodb.mongodb.ConnectionCreatedEvent): void, connectionReady (event : mongodb.mongodb.ConnectionReadyEvent): void, connectionClosed (event : mongodb.mongodb.ConnectionClosedEvent): void, connectionCheckOutStarted (event : mongodb.mongodb.ConnectionCheckOutStartedEvent): void, connectionCheckOutFailed (event : mongodb.mongodb.ConnectionCheckOutFailedEvent): void, connectionCheckedOut (event : mongodb.mongodb.ConnectionCheckedOutEvent): void, connectionCheckedIn (event : mongodb.mongodb.ConnectionCheckedInEvent): void} & std.Omit<mongodb.mongodb.ConnectionEvents, 'close' | 'message'> */
trait ConnectionPoolEvents extends StObject {
  
  def clusterTimeReceived(clusterTime: Document): Unit
  @JSName("clusterTimeReceived")
  var clusterTimeReceived_Original: js.Function1[/* clusterTime */ Document, Unit]
  
  def commandFailed(event: CommandFailedEvent): Unit
  @JSName("commandFailed")
  var commandFailed_Original: js.Function1[/* event */ CommandFailedEvent, Unit]
  
  def commandStarted(event: CommandStartedEvent): Unit
  @JSName("commandStarted")
  var commandStarted_Original: js.Function1[/* event */ CommandStartedEvent, Unit]
  
  def commandSucceeded(event: CommandSucceededEvent): Unit
  @JSName("commandSucceeded")
  var commandSucceeded_Original: js.Function1[/* event */ CommandSucceededEvent, Unit]
  
  def connectionCheckOutFailed(event: ConnectionCheckOutFailedEvent): Unit
  
  def connectionCheckOutStarted(event: ConnectionCheckOutStartedEvent): Unit
  
  def connectionCheckedIn(event: ConnectionCheckedInEvent): Unit
  
  def connectionCheckedOut(event: ConnectionCheckedOutEvent): Unit
  
  def connectionClosed(event: ConnectionClosedEvent): Unit
  
  def connectionCreated(event: ConnectionCreatedEvent): Unit
  
  def connectionPoolCleared(event: ConnectionPoolClearedEvent): Unit
  
  def connectionPoolClosed(event: ConnectionPoolClosedEvent): Unit
  
  def connectionPoolCreated(event: ConnectionPoolCreatedEvent): Unit
  
  def connectionPoolReady(event: ConnectionPoolReadyEvent): Unit
  
  def connectionReady(event: ConnectionReadyEvent): Unit
  
  def pinned(pinType: String): Unit
  @JSName("pinned")
  var pinned_Original: js.Function1[/* pinType */ String, Unit]
  
  def unpinned(pinType: String): Unit
  @JSName("unpinned")
  var unpinned_Original: js.Function1[/* pinType */ String, Unit]
}
object ConnectionPoolEvents {
  
  inline def apply(
    clusterTimeReceived: /* clusterTime */ Document => japgolly.scalajs.react.Callback,
    commandFailed: /* event */ CommandFailedEvent => japgolly.scalajs.react.Callback,
    commandStarted: /* event */ CommandStartedEvent => japgolly.scalajs.react.Callback,
    commandSucceeded: /* event */ CommandSucceededEvent => japgolly.scalajs.react.Callback,
    connectionCheckOutFailed: ConnectionCheckOutFailedEvent => japgolly.scalajs.react.Callback,
    connectionCheckOutStarted: ConnectionCheckOutStartedEvent => japgolly.scalajs.react.Callback,
    connectionCheckedIn: ConnectionCheckedInEvent => japgolly.scalajs.react.Callback,
    connectionCheckedOut: ConnectionCheckedOutEvent => japgolly.scalajs.react.Callback,
    connectionClosed: ConnectionClosedEvent => japgolly.scalajs.react.Callback,
    connectionCreated: ConnectionCreatedEvent => japgolly.scalajs.react.Callback,
    connectionPoolCleared: ConnectionPoolClearedEvent => japgolly.scalajs.react.Callback,
    connectionPoolClosed: ConnectionPoolClosedEvent => japgolly.scalajs.react.Callback,
    connectionPoolCreated: ConnectionPoolCreatedEvent => japgolly.scalajs.react.Callback,
    connectionPoolReady: ConnectionPoolReadyEvent => japgolly.scalajs.react.Callback,
    connectionReady: ConnectionReadyEvent => japgolly.scalajs.react.Callback,
    pinned: /* pinType */ String => japgolly.scalajs.react.Callback,
    unpinned: /* pinType */ String => japgolly.scalajs.react.Callback
  ): ConnectionPoolEvents = {
    val __obj = js.Dynamic.literal(clusterTimeReceived = js.Any.fromFunction1((t0: /* clusterTime */ Document) => clusterTimeReceived(t0).runNow()), commandFailed = js.Any.fromFunction1((t0: /* event */ CommandFailedEvent) => commandFailed(t0).runNow()), commandStarted = js.Any.fromFunction1((t0: /* event */ CommandStartedEvent) => commandStarted(t0).runNow()), commandSucceeded = js.Any.fromFunction1((t0: /* event */ CommandSucceededEvent) => commandSucceeded(t0).runNow()), connectionCheckOutFailed = js.Any.fromFunction1((t0: ConnectionCheckOutFailedEvent) => connectionCheckOutFailed(t0).runNow()), connectionCheckOutStarted = js.Any.fromFunction1((t0: ConnectionCheckOutStartedEvent) => connectionCheckOutStarted(t0).runNow()), connectionCheckedIn = js.Any.fromFunction1((t0: ConnectionCheckedInEvent) => connectionCheckedIn(t0).runNow()), connectionCheckedOut = js.Any.fromFunction1((t0: ConnectionCheckedOutEvent) => connectionCheckedOut(t0).runNow()), connectionClosed = js.Any.fromFunction1((t0: ConnectionClosedEvent) => connectionClosed(t0).runNow()), connectionCreated = js.Any.fromFunction1((t0: ConnectionCreatedEvent) => connectionCreated(t0).runNow()), connectionPoolCleared = js.Any.fromFunction1((t0: ConnectionPoolClearedEvent) => connectionPoolCleared(t0).runNow()), connectionPoolClosed = js.Any.fromFunction1((t0: ConnectionPoolClosedEvent) => connectionPoolClosed(t0).runNow()), connectionPoolCreated = js.Any.fromFunction1((t0: ConnectionPoolCreatedEvent) => connectionPoolCreated(t0).runNow()), connectionPoolReady = js.Any.fromFunction1((t0: ConnectionPoolReadyEvent) => connectionPoolReady(t0).runNow()), connectionReady = js.Any.fromFunction1((t0: ConnectionReadyEvent) => connectionReady(t0).runNow()), pinned = js.Any.fromFunction1((t0: /* pinType */ String) => pinned(t0).runNow()), unpinned = js.Any.fromFunction1((t0: /* pinType */ String) => unpinned(t0).runNow()))
    __obj.asInstanceOf[ConnectionPoolEvents]
  }
  
  extension [Self <: ConnectionPoolEvents](x: Self) {
    
    inline def setClusterTimeReceived(value: /* clusterTime */ Document => japgolly.scalajs.react.Callback): Self = StObject.set(x, "clusterTimeReceived", js.Any.fromFunction1((t0: /* clusterTime */ Document) => value(t0).runNow()))
    
    inline def setCommandFailed(value: /* event */ CommandFailedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "commandFailed", js.Any.fromFunction1((t0: /* event */ CommandFailedEvent) => value(t0).runNow()))
    
    inline def setCommandStarted(value: /* event */ CommandStartedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "commandStarted", js.Any.fromFunction1((t0: /* event */ CommandStartedEvent) => value(t0).runNow()))
    
    inline def setCommandSucceeded(value: /* event */ CommandSucceededEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "commandSucceeded", js.Any.fromFunction1((t0: /* event */ CommandSucceededEvent) => value(t0).runNow()))
    
    inline def setConnectionCheckOutFailed(value: ConnectionCheckOutFailedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionCheckOutFailed", js.Any.fromFunction1((t0: ConnectionCheckOutFailedEvent) => value(t0).runNow()))
    
    inline def setConnectionCheckOutStarted(value: ConnectionCheckOutStartedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionCheckOutStarted", js.Any.fromFunction1((t0: ConnectionCheckOutStartedEvent) => value(t0).runNow()))
    
    inline def setConnectionCheckedIn(value: ConnectionCheckedInEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionCheckedIn", js.Any.fromFunction1((t0: ConnectionCheckedInEvent) => value(t0).runNow()))
    
    inline def setConnectionCheckedOut(value: ConnectionCheckedOutEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionCheckedOut", js.Any.fromFunction1((t0: ConnectionCheckedOutEvent) => value(t0).runNow()))
    
    inline def setConnectionClosed(value: ConnectionClosedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionClosed", js.Any.fromFunction1((t0: ConnectionClosedEvent) => value(t0).runNow()))
    
    inline def setConnectionCreated(value: ConnectionCreatedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionCreated", js.Any.fromFunction1((t0: ConnectionCreatedEvent) => value(t0).runNow()))
    
    inline def setConnectionPoolCleared(value: ConnectionPoolClearedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionPoolCleared", js.Any.fromFunction1((t0: ConnectionPoolClearedEvent) => value(t0).runNow()))
    
    inline def setConnectionPoolClosed(value: ConnectionPoolClosedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionPoolClosed", js.Any.fromFunction1((t0: ConnectionPoolClosedEvent) => value(t0).runNow()))
    
    inline def setConnectionPoolCreated(value: ConnectionPoolCreatedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionPoolCreated", js.Any.fromFunction1((t0: ConnectionPoolCreatedEvent) => value(t0).runNow()))
    
    inline def setConnectionPoolReady(value: ConnectionPoolReadyEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionPoolReady", js.Any.fromFunction1((t0: ConnectionPoolReadyEvent) => value(t0).runNow()))
    
    inline def setConnectionReady(value: ConnectionReadyEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionReady", js.Any.fromFunction1((t0: ConnectionReadyEvent) => value(t0).runNow()))
    
    inline def setPinned(value: /* pinType */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "pinned", js.Any.fromFunction1((t0: /* pinType */ String) => value(t0).runNow()))
    
    inline def setUnpinned(value: /* pinType */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "unpinned", js.Any.fromFunction1((t0: /* pinType */ String) => value(t0).runNow()))
  }
}
