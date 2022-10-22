package typingsJapgolly.mongodb.mod

import typingsJapgolly.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {serverOpening (event : mongodb.mongodb.ServerOpeningEvent): void, serverClosed (event : mongodb.mongodb.ServerClosedEvent): void, serverDescriptionChanged (event : mongodb.mongodb.ServerDescriptionChangedEvent): void, topologyClosed (event : mongodb.mongodb.TopologyClosedEvent): void, topologyOpening (event : mongodb.mongodb.TopologyOpeningEvent): void, topologyDescriptionChanged (event : mongodb.mongodb.TopologyDescriptionChangedEvent): void, error (error : std.Error): void, close (): void, timeout (): void} & std.Omit<mongodb.mongodb.ServerEvents, 'connect'> & mongodb.mongodb.ConnectionPoolEvents & mongodb.mongodb.ConnectionEvents & mongodb.mongodb.EventEmitterWithState */
trait TopologyEvents extends StObject {
  
  /* Excluded from this release type: open */
  def close(): Unit
  
  def closed(): Unit
  @JSName("closed")
  var closed_Original: js.Function0[Unit]
  
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
  @JSName("connectionCheckOutFailed")
  var connectionCheckOutFailed_Original: js.Function1[/* event */ ConnectionCheckOutFailedEvent, Unit]
  
  def connectionCheckOutStarted(event: ConnectionCheckOutStartedEvent): Unit
  @JSName("connectionCheckOutStarted")
  var connectionCheckOutStarted_Original: js.Function1[/* event */ ConnectionCheckOutStartedEvent, Unit]
  
  def connectionCheckedIn(event: ConnectionCheckedInEvent): Unit
  @JSName("connectionCheckedIn")
  var connectionCheckedIn_Original: js.Function1[/* event */ ConnectionCheckedInEvent, Unit]
  
  def connectionCheckedOut(event: ConnectionCheckedOutEvent): Unit
  @JSName("connectionCheckedOut")
  var connectionCheckedOut_Original: js.Function1[/* event */ ConnectionCheckedOutEvent, Unit]
  
  def connectionClosed(event: ConnectionClosedEvent): Unit
  @JSName("connectionClosed")
  var connectionClosed_Original: js.Function1[/* event */ ConnectionClosedEvent, Unit]
  
  def connectionCreated(event: ConnectionCreatedEvent): Unit
  @JSName("connectionCreated")
  var connectionCreated_Original: js.Function1[/* event */ ConnectionCreatedEvent, Unit]
  
  def connectionPoolCleared(event: ConnectionPoolClearedEvent): Unit
  @JSName("connectionPoolCleared")
  var connectionPoolCleared_Original: js.Function1[/* event */ ConnectionPoolClearedEvent, Unit]
  
  def connectionPoolClosed(event: ConnectionPoolClosedEvent): Unit
  @JSName("connectionPoolClosed")
  var connectionPoolClosed_Original: js.Function1[/* event */ ConnectionPoolClosedEvent, Unit]
  
  def connectionPoolCreated(event: ConnectionPoolCreatedEvent): Unit
  @JSName("connectionPoolCreated")
  var connectionPoolCreated_Original: js.Function1[/* event */ ConnectionPoolCreatedEvent, Unit]
  
  def connectionPoolReady(event: ConnectionPoolReadyEvent): Unit
  @JSName("connectionPoolReady")
  var connectionPoolReady_Original: js.Function1[/* event */ ConnectionPoolReadyEvent, Unit]
  
  def connectionReady(event: ConnectionReadyEvent): Unit
  @JSName("connectionReady")
  var connectionReady_Original: js.Function1[/* event */ ConnectionReadyEvent, Unit]
  
  def descriptionReceived(description: ServerDescription): Unit
  @JSName("descriptionReceived")
  var descriptionReceived_Original: js.Function1[/* description */ ServerDescription, Unit]
  
  def ended(): Unit
  @JSName("ended")
  var ended_Original: js.Function0[Unit]
  
  def error(error: js.Error): Unit
  
  def message(message: Any): Unit
  
  def pinned(pinType: String): Unit
  @JSName("pinned")
  var pinned_Original: js.Function1[/* pinType */ String, Unit]
  
  def serverClosed(event: ServerClosedEvent): Unit
  
  def serverDescriptionChanged(event: ServerDescriptionChangedEvent): Unit
  
  def serverHeartbeatFailed(event: ServerHeartbeatFailedEvent): Unit
  @JSName("serverHeartbeatFailed")
  var serverHeartbeatFailed_Original: js.Function1[/* event */ ServerHeartbeatFailedEvent, Unit]
  
  def serverHeartbeatStarted(event: ServerHeartbeatStartedEvent): Unit
  @JSName("serverHeartbeatStarted")
  var serverHeartbeatStarted_Original: js.Function1[/* event */ ServerHeartbeatStartedEvent, Unit]
  
  def serverHeartbeatSucceeded(event: ServerHeartbeatSucceededEvent): Unit
  @JSName("serverHeartbeatSucceeded")
  var serverHeartbeatSucceeded_Original: js.Function1[/* event */ ServerHeartbeatSucceededEvent, Unit]
  
  /* Excluded from this release type: connect */
  def serverOpening(event: ServerOpeningEvent): Unit
  
  def timeout(): Unit
  
  def topologyClosed(event: TopologyClosedEvent): Unit
  
  def topologyDescriptionChanged(event: TopologyDescriptionChangedEvent): Unit
  
  def topologyOpening(event: TopologyOpeningEvent): Unit
  
  def unpinned(pinType: String): Unit
  @JSName("unpinned")
  var unpinned_Original: js.Function1[/* pinType */ String, Unit]
}
object TopologyEvents {
  
  inline def apply(
    close: japgolly.scalajs.react.Callback,
    closed: japgolly.scalajs.react.Callback,
    clusterTimeReceived: /* clusterTime */ Document => japgolly.scalajs.react.Callback,
    commandFailed: /* event */ CommandFailedEvent => japgolly.scalajs.react.Callback,
    commandStarted: /* event */ CommandStartedEvent => japgolly.scalajs.react.Callback,
    commandSucceeded: /* event */ CommandSucceededEvent => japgolly.scalajs.react.Callback,
    connectionCheckOutFailed: /* event */ ConnectionCheckOutFailedEvent => japgolly.scalajs.react.Callback,
    connectionCheckOutStarted: /* event */ ConnectionCheckOutStartedEvent => japgolly.scalajs.react.Callback,
    connectionCheckedIn: /* event */ ConnectionCheckedInEvent => japgolly.scalajs.react.Callback,
    connectionCheckedOut: /* event */ ConnectionCheckedOutEvent => japgolly.scalajs.react.Callback,
    connectionClosed: /* event */ ConnectionClosedEvent => japgolly.scalajs.react.Callback,
    connectionCreated: /* event */ ConnectionCreatedEvent => japgolly.scalajs.react.Callback,
    connectionPoolCleared: /* event */ ConnectionPoolClearedEvent => japgolly.scalajs.react.Callback,
    connectionPoolClosed: /* event */ ConnectionPoolClosedEvent => japgolly.scalajs.react.Callback,
    connectionPoolCreated: /* event */ ConnectionPoolCreatedEvent => japgolly.scalajs.react.Callback,
    connectionPoolReady: /* event */ ConnectionPoolReadyEvent => japgolly.scalajs.react.Callback,
    connectionReady: /* event */ ConnectionReadyEvent => japgolly.scalajs.react.Callback,
    descriptionReceived: /* description */ ServerDescription => japgolly.scalajs.react.Callback,
    ended: japgolly.scalajs.react.Callback,
    error: js.Error => japgolly.scalajs.react.Callback,
    message: Any => japgolly.scalajs.react.Callback,
    pinned: /* pinType */ String => japgolly.scalajs.react.Callback,
    serverClosed: ServerClosedEvent => japgolly.scalajs.react.Callback,
    serverDescriptionChanged: ServerDescriptionChangedEvent => japgolly.scalajs.react.Callback,
    serverHeartbeatFailed: /* event */ ServerHeartbeatFailedEvent => japgolly.scalajs.react.Callback,
    serverHeartbeatStarted: /* event */ ServerHeartbeatStartedEvent => japgolly.scalajs.react.Callback,
    serverHeartbeatSucceeded: /* event */ ServerHeartbeatSucceededEvent => japgolly.scalajs.react.Callback,
    serverOpening: ServerOpeningEvent => japgolly.scalajs.react.Callback,
    timeout: japgolly.scalajs.react.Callback,
    topologyClosed: TopologyClosedEvent => japgolly.scalajs.react.Callback,
    topologyDescriptionChanged: TopologyDescriptionChangedEvent => japgolly.scalajs.react.Callback,
    topologyOpening: TopologyOpeningEvent => japgolly.scalajs.react.Callback,
    unpinned: /* pinType */ String => japgolly.scalajs.react.Callback
  ): TopologyEvents = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, closed = closed.toJsFn, clusterTimeReceived = js.Any.fromFunction1((t0: /* clusterTime */ Document) => clusterTimeReceived(t0).runNow()), commandFailed = js.Any.fromFunction1((t0: /* event */ CommandFailedEvent) => commandFailed(t0).runNow()), commandStarted = js.Any.fromFunction1((t0: /* event */ CommandStartedEvent) => commandStarted(t0).runNow()), commandSucceeded = js.Any.fromFunction1((t0: /* event */ CommandSucceededEvent) => commandSucceeded(t0).runNow()), connectionCheckOutFailed = js.Any.fromFunction1((t0: /* event */ ConnectionCheckOutFailedEvent) => connectionCheckOutFailed(t0).runNow()), connectionCheckOutStarted = js.Any.fromFunction1((t0: /* event */ ConnectionCheckOutStartedEvent) => connectionCheckOutStarted(t0).runNow()), connectionCheckedIn = js.Any.fromFunction1((t0: /* event */ ConnectionCheckedInEvent) => connectionCheckedIn(t0).runNow()), connectionCheckedOut = js.Any.fromFunction1((t0: /* event */ ConnectionCheckedOutEvent) => connectionCheckedOut(t0).runNow()), connectionClosed = js.Any.fromFunction1((t0: /* event */ ConnectionClosedEvent) => connectionClosed(t0).runNow()), connectionCreated = js.Any.fromFunction1((t0: /* event */ ConnectionCreatedEvent) => connectionCreated(t0).runNow()), connectionPoolCleared = js.Any.fromFunction1((t0: /* event */ ConnectionPoolClearedEvent) => connectionPoolCleared(t0).runNow()), connectionPoolClosed = js.Any.fromFunction1((t0: /* event */ ConnectionPoolClosedEvent) => connectionPoolClosed(t0).runNow()), connectionPoolCreated = js.Any.fromFunction1((t0: /* event */ ConnectionPoolCreatedEvent) => connectionPoolCreated(t0).runNow()), connectionPoolReady = js.Any.fromFunction1((t0: /* event */ ConnectionPoolReadyEvent) => connectionPoolReady(t0).runNow()), connectionReady = js.Any.fromFunction1((t0: /* event */ ConnectionReadyEvent) => connectionReady(t0).runNow()), descriptionReceived = js.Any.fromFunction1((t0: /* description */ ServerDescription) => descriptionReceived(t0).runNow()), ended = ended.toJsFn, error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), message = js.Any.fromFunction1((t0: Any) => message(t0).runNow()), pinned = js.Any.fromFunction1((t0: /* pinType */ String) => pinned(t0).runNow()), serverClosed = js.Any.fromFunction1((t0: ServerClosedEvent) => serverClosed(t0).runNow()), serverDescriptionChanged = js.Any.fromFunction1((t0: ServerDescriptionChangedEvent) => serverDescriptionChanged(t0).runNow()), serverHeartbeatFailed = js.Any.fromFunction1((t0: /* event */ ServerHeartbeatFailedEvent) => serverHeartbeatFailed(t0).runNow()), serverHeartbeatStarted = js.Any.fromFunction1((t0: /* event */ ServerHeartbeatStartedEvent) => serverHeartbeatStarted(t0).runNow()), serverHeartbeatSucceeded = js.Any.fromFunction1((t0: /* event */ ServerHeartbeatSucceededEvent) => serverHeartbeatSucceeded(t0).runNow()), serverOpening = js.Any.fromFunction1((t0: ServerOpeningEvent) => serverOpening(t0).runNow()), timeout = timeout.toJsFn, topologyClosed = js.Any.fromFunction1((t0: TopologyClosedEvent) => topologyClosed(t0).runNow()), topologyDescriptionChanged = js.Any.fromFunction1((t0: TopologyDescriptionChangedEvent) => topologyDescriptionChanged(t0).runNow()), topologyOpening = js.Any.fromFunction1((t0: TopologyOpeningEvent) => topologyOpening(t0).runNow()), unpinned = js.Any.fromFunction1((t0: /* pinType */ String) => unpinned(t0).runNow()))
    __obj.asInstanceOf[TopologyEvents]
  }
  
  extension [Self <: TopologyEvents](x: Self) {
    
    inline def setClose(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setClosed(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "closed", value.toJsFn)
    
    inline def setClusterTimeReceived(value: /* clusterTime */ Document => japgolly.scalajs.react.Callback): Self = StObject.set(x, "clusterTimeReceived", js.Any.fromFunction1((t0: /* clusterTime */ Document) => value(t0).runNow()))
    
    inline def setCommandFailed(value: /* event */ CommandFailedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "commandFailed", js.Any.fromFunction1((t0: /* event */ CommandFailedEvent) => value(t0).runNow()))
    
    inline def setCommandStarted(value: /* event */ CommandStartedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "commandStarted", js.Any.fromFunction1((t0: /* event */ CommandStartedEvent) => value(t0).runNow()))
    
    inline def setCommandSucceeded(value: /* event */ CommandSucceededEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "commandSucceeded", js.Any.fromFunction1((t0: /* event */ CommandSucceededEvent) => value(t0).runNow()))
    
    inline def setConnectionCheckOutFailed(value: /* event */ ConnectionCheckOutFailedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionCheckOutFailed", js.Any.fromFunction1((t0: /* event */ ConnectionCheckOutFailedEvent) => value(t0).runNow()))
    
    inline def setConnectionCheckOutStarted(value: /* event */ ConnectionCheckOutStartedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionCheckOutStarted", js.Any.fromFunction1((t0: /* event */ ConnectionCheckOutStartedEvent) => value(t0).runNow()))
    
    inline def setConnectionCheckedIn(value: /* event */ ConnectionCheckedInEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionCheckedIn", js.Any.fromFunction1((t0: /* event */ ConnectionCheckedInEvent) => value(t0).runNow()))
    
    inline def setConnectionCheckedOut(value: /* event */ ConnectionCheckedOutEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionCheckedOut", js.Any.fromFunction1((t0: /* event */ ConnectionCheckedOutEvent) => value(t0).runNow()))
    
    inline def setConnectionClosed(value: /* event */ ConnectionClosedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionClosed", js.Any.fromFunction1((t0: /* event */ ConnectionClosedEvent) => value(t0).runNow()))
    
    inline def setConnectionCreated(value: /* event */ ConnectionCreatedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionCreated", js.Any.fromFunction1((t0: /* event */ ConnectionCreatedEvent) => value(t0).runNow()))
    
    inline def setConnectionPoolCleared(value: /* event */ ConnectionPoolClearedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionPoolCleared", js.Any.fromFunction1((t0: /* event */ ConnectionPoolClearedEvent) => value(t0).runNow()))
    
    inline def setConnectionPoolClosed(value: /* event */ ConnectionPoolClosedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionPoolClosed", js.Any.fromFunction1((t0: /* event */ ConnectionPoolClosedEvent) => value(t0).runNow()))
    
    inline def setConnectionPoolCreated(value: /* event */ ConnectionPoolCreatedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionPoolCreated", js.Any.fromFunction1((t0: /* event */ ConnectionPoolCreatedEvent) => value(t0).runNow()))
    
    inline def setConnectionPoolReady(value: /* event */ ConnectionPoolReadyEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionPoolReady", js.Any.fromFunction1((t0: /* event */ ConnectionPoolReadyEvent) => value(t0).runNow()))
    
    inline def setConnectionReady(value: /* event */ ConnectionReadyEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connectionReady", js.Any.fromFunction1((t0: /* event */ ConnectionReadyEvent) => value(t0).runNow()))
    
    inline def setDescriptionReceived(value: /* description */ ServerDescription => japgolly.scalajs.react.Callback): Self = StObject.set(x, "descriptionReceived", js.Any.fromFunction1((t0: /* description */ ServerDescription) => value(t0).runNow()))
    
    inline def setEnded(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "ended", value.toJsFn)
    
    inline def setError(value: js.Error => japgolly.scalajs.react.Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
    
    inline def setMessage(value: Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "message", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setPinned(value: /* pinType */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "pinned", js.Any.fromFunction1((t0: /* pinType */ String) => value(t0).runNow()))
    
    inline def setServerClosed(value: ServerClosedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "serverClosed", js.Any.fromFunction1((t0: ServerClosedEvent) => value(t0).runNow()))
    
    inline def setServerDescriptionChanged(value: ServerDescriptionChangedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "serverDescriptionChanged", js.Any.fromFunction1((t0: ServerDescriptionChangedEvent) => value(t0).runNow()))
    
    inline def setServerHeartbeatFailed(value: /* event */ ServerHeartbeatFailedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "serverHeartbeatFailed", js.Any.fromFunction1((t0: /* event */ ServerHeartbeatFailedEvent) => value(t0).runNow()))
    
    inline def setServerHeartbeatStarted(value: /* event */ ServerHeartbeatStartedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "serverHeartbeatStarted", js.Any.fromFunction1((t0: /* event */ ServerHeartbeatStartedEvent) => value(t0).runNow()))
    
    inline def setServerHeartbeatSucceeded(value: /* event */ ServerHeartbeatSucceededEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "serverHeartbeatSucceeded", js.Any.fromFunction1((t0: /* event */ ServerHeartbeatSucceededEvent) => value(t0).runNow()))
    
    inline def setServerOpening(value: ServerOpeningEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "serverOpening", js.Any.fromFunction1((t0: ServerOpeningEvent) => value(t0).runNow()))
    
    inline def setTimeout(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "timeout", value.toJsFn)
    
    inline def setTopologyClosed(value: TopologyClosedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "topologyClosed", js.Any.fromFunction1((t0: TopologyClosedEvent) => value(t0).runNow()))
    
    inline def setTopologyDescriptionChanged(value: TopologyDescriptionChangedEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "topologyDescriptionChanged", js.Any.fromFunction1((t0: TopologyDescriptionChangedEvent) => value(t0).runNow()))
    
    inline def setTopologyOpening(value: TopologyOpeningEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "topologyOpening", js.Any.fromFunction1((t0: TopologyOpeningEvent) => value(t0).runNow()))
    
    inline def setUnpinned(value: /* pinType */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "unpinned", js.Any.fromFunction1((t0: /* pinType */ String) => value(t0).runNow()))
  }
}
