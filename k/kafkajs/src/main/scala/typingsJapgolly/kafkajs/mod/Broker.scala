package typingsJapgolly.kafkajs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kafkajs.anon.Acks
import typingsJapgolly.kafkajs.anon.GroupGenerationId
import typingsJapgolly.kafkajs.anon.GroupIdTopics
import typingsJapgolly.kafkajs.anon.GroupIds
import typingsJapgolly.kafkajs.anon.IsolationLevel
import typingsJapgolly.kafkajs.anon.Responses
import typingsJapgolly.kafkajs.anon.TimeoutTopics
import typingsJapgolly.kafkajs.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Broker extends StObject {
  
  def alterPartitionReassignments(request: TimeoutTopics): js.Promise[Any]
  
  def apiVersions(): js.Promise[ApiVersions]
  
  def connect(): js.Promise[Unit]
  
  def describeGroups(options: GroupIds): js.Promise[Any]
  
  def disconnect(): js.Promise[Unit]
  
  def fetch(request: IsolationLevel): js.Promise[Any]
  
  def isConnected(): Boolean
  
  def listPartitionReassignments(request: `1`): js.Promise[ListPartitionReassignmentsResponse]
  
  def metadata(topics: js.Array[String]): js.Promise[BrokerMetadata]
  
  def offsetCommit(request: GroupGenerationId): js.Promise[Any]
  
  def offsetFetch(request: GroupIdTopics): js.Promise[Responses]
  
  def produce(request: Acks): js.Promise[Any]
}
object Broker {
  
  inline def apply(
    alterPartitionReassignments: TimeoutTopics => js.Promise[Any],
    apiVersions: CallbackTo[js.Promise[ApiVersions]],
    connect: CallbackTo[js.Promise[Unit]],
    describeGroups: GroupIds => js.Promise[Any],
    disconnect: CallbackTo[js.Promise[Unit]],
    fetch: IsolationLevel => js.Promise[Any],
    isConnected: CallbackTo[Boolean],
    listPartitionReassignments: `1` => js.Promise[ListPartitionReassignmentsResponse],
    metadata: js.Array[String] => js.Promise[BrokerMetadata],
    offsetCommit: GroupGenerationId => js.Promise[Any],
    offsetFetch: GroupIdTopics => js.Promise[Responses],
    produce: Acks => js.Promise[Any]
  ): Broker = {
    val __obj = js.Dynamic.literal(alterPartitionReassignments = js.Any.fromFunction1(alterPartitionReassignments), apiVersions = apiVersions.toJsFn, connect = connect.toJsFn, describeGroups = js.Any.fromFunction1(describeGroups), disconnect = disconnect.toJsFn, fetch = js.Any.fromFunction1(fetch), isConnected = isConnected.toJsFn, listPartitionReassignments = js.Any.fromFunction1(listPartitionReassignments), metadata = js.Any.fromFunction1(metadata), offsetCommit = js.Any.fromFunction1(offsetCommit), offsetFetch = js.Any.fromFunction1(offsetFetch), produce = js.Any.fromFunction1(produce))
    __obj.asInstanceOf[Broker]
  }
  
  extension [Self <: Broker](x: Self) {
    
    inline def setAlterPartitionReassignments(value: TimeoutTopics => js.Promise[Any]): Self = StObject.set(x, "alterPartitionReassignments", js.Any.fromFunction1(value))
    
    inline def setApiVersions(value: CallbackTo[js.Promise[ApiVersions]]): Self = StObject.set(x, "apiVersions", value.toJsFn)
    
    inline def setConnect(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "connect", value.toJsFn)
    
    inline def setDescribeGroups(value: GroupIds => js.Promise[Any]): Self = StObject.set(x, "describeGroups", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "disconnect", value.toJsFn)
    
    inline def setFetch(value: IsolationLevel => js.Promise[Any]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    
    inline def setIsConnected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConnected", value.toJsFn)
    
    inline def setListPartitionReassignments(value: `1` => js.Promise[ListPartitionReassignmentsResponse]): Self = StObject.set(x, "listPartitionReassignments", js.Any.fromFunction1(value))
    
    inline def setMetadata(value: js.Array[String] => js.Promise[BrokerMetadata]): Self = StObject.set(x, "metadata", js.Any.fromFunction1(value))
    
    inline def setOffsetCommit(value: GroupGenerationId => js.Promise[Any]): Self = StObject.set(x, "offsetCommit", js.Any.fromFunction1(value))
    
    inline def setOffsetFetch(value: GroupIdTopics => js.Promise[Responses]): Self = StObject.set(x, "offsetFetch", js.Any.fromFunction1(value))
    
    inline def setProduce(value: Acks => js.Promise[Any]): Self = StObject.set(x, "produce", js.Any.fromFunction1(value))
  }
}
