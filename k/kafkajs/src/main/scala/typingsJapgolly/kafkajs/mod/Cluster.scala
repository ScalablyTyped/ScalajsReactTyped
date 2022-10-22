package typingsJapgolly.kafkajs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.kafkajs.anon.FromBeginning
import typingsJapgolly.kafkajs.anon.FromTimestamp
import typingsJapgolly.kafkajs.anon.GroupIdString
import typingsJapgolly.kafkajs.anon.NodeIdString
import typingsJapgolly.kafkajs.anon.PartitionsArrayTopicString
import typingsJapgolly.kafkajs.anon.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  def addMultipleTargetTopics(topics: js.Array[String]): js.Promise[Unit]
  
  def addTargetTopic(topic: String): js.Promise[Unit]
  
  def connect(): js.Promise[Unit]
  
  def defaultOffset(config: FromBeginning): Double
  
  def disconnect(): js.Promise[Unit]
  
  def fetchTopicsOffset(topics: js.Array[PartitionsArrayTopicString & (XOR[FromBeginning, FromTimestamp])]): js.Promise[js.Array[TopicOffsets]]
  
  def findBroker(node: NodeIdString): js.Promise[Broker]
  
  def findControllerBroker(): js.Promise[Broker]
  
  def findGroupCoordinator(group: GroupIdString): js.Promise[Broker]
  
  def findGroupCoordinatorMetadata(group: GroupIdString): js.Promise[CoordinatorMetadata]
  
  def findLeaderForPartitions(topic: String, partitions: js.Array[Double]): StringDictionary[js.Array[Double]]
  
  def findTopicPartitionMetadata(topic: String): js.Array[PartitionMetadata]
  
  def getNodeIds(): js.Array[Double]
  
  def isConnected(): Boolean
  
  def metadata(): js.Promise[BrokerMetadata]
  
  def refreshMetadata(): js.Promise[Unit]
  
  def refreshMetadataIfNecessary(): js.Promise[Unit]
  
  def removeBroker(options: Port): Unit
}
object Cluster {
  
  inline def apply(
    addMultipleTargetTopics: js.Array[String] => js.Promise[Unit],
    addTargetTopic: String => js.Promise[Unit],
    connect: CallbackTo[js.Promise[Unit]],
    defaultOffset: FromBeginning => Double,
    disconnect: CallbackTo[js.Promise[Unit]],
    fetchTopicsOffset: js.Array[PartitionsArrayTopicString & (XOR[FromBeginning, FromTimestamp])] => js.Promise[js.Array[TopicOffsets]],
    findBroker: NodeIdString => js.Promise[Broker],
    findControllerBroker: CallbackTo[js.Promise[Broker]],
    findGroupCoordinator: GroupIdString => js.Promise[Broker],
    findGroupCoordinatorMetadata: GroupIdString => js.Promise[CoordinatorMetadata],
    findLeaderForPartitions: (String, js.Array[Double]) => StringDictionary[js.Array[Double]],
    findTopicPartitionMetadata: String => js.Array[PartitionMetadata],
    getNodeIds: CallbackTo[js.Array[Double]],
    isConnected: CallbackTo[Boolean],
    metadata: CallbackTo[js.Promise[BrokerMetadata]],
    refreshMetadata: CallbackTo[js.Promise[Unit]],
    refreshMetadataIfNecessary: CallbackTo[js.Promise[Unit]],
    removeBroker: Port => Callback
  ): Cluster = {
    val __obj = js.Dynamic.literal(addMultipleTargetTopics = js.Any.fromFunction1(addMultipleTargetTopics), addTargetTopic = js.Any.fromFunction1(addTargetTopic), connect = connect.toJsFn, defaultOffset = js.Any.fromFunction1(defaultOffset), disconnect = disconnect.toJsFn, fetchTopicsOffset = js.Any.fromFunction1(fetchTopicsOffset), findBroker = js.Any.fromFunction1(findBroker), findControllerBroker = findControllerBroker.toJsFn, findGroupCoordinator = js.Any.fromFunction1(findGroupCoordinator), findGroupCoordinatorMetadata = js.Any.fromFunction1(findGroupCoordinatorMetadata), findLeaderForPartitions = js.Any.fromFunction2(findLeaderForPartitions), findTopicPartitionMetadata = js.Any.fromFunction1(findTopicPartitionMetadata), getNodeIds = getNodeIds.toJsFn, isConnected = isConnected.toJsFn, metadata = metadata.toJsFn, refreshMetadata = refreshMetadata.toJsFn, refreshMetadataIfNecessary = refreshMetadataIfNecessary.toJsFn, removeBroker = js.Any.fromFunction1((t0: Port) => removeBroker(t0).runNow()))
    __obj.asInstanceOf[Cluster]
  }
  
  extension [Self <: Cluster](x: Self) {
    
    inline def setAddMultipleTargetTopics(value: js.Array[String] => js.Promise[Unit]): Self = StObject.set(x, "addMultipleTargetTopics", js.Any.fromFunction1(value))
    
    inline def setAddTargetTopic(value: String => js.Promise[Unit]): Self = StObject.set(x, "addTargetTopic", js.Any.fromFunction1(value))
    
    inline def setConnect(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "connect", value.toJsFn)
    
    inline def setDefaultOffset(value: FromBeginning => Double): Self = StObject.set(x, "defaultOffset", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "disconnect", value.toJsFn)
    
    inline def setFetchTopicsOffset(
      value: js.Array[PartitionsArrayTopicString & (XOR[FromBeginning, FromTimestamp])] => js.Promise[js.Array[TopicOffsets]]
    ): Self = StObject.set(x, "fetchTopicsOffset", js.Any.fromFunction1(value))
    
    inline def setFindBroker(value: NodeIdString => js.Promise[Broker]): Self = StObject.set(x, "findBroker", js.Any.fromFunction1(value))
    
    inline def setFindControllerBroker(value: CallbackTo[js.Promise[Broker]]): Self = StObject.set(x, "findControllerBroker", value.toJsFn)
    
    inline def setFindGroupCoordinator(value: GroupIdString => js.Promise[Broker]): Self = StObject.set(x, "findGroupCoordinator", js.Any.fromFunction1(value))
    
    inline def setFindGroupCoordinatorMetadata(value: GroupIdString => js.Promise[CoordinatorMetadata]): Self = StObject.set(x, "findGroupCoordinatorMetadata", js.Any.fromFunction1(value))
    
    inline def setFindLeaderForPartitions(value: (String, js.Array[Double]) => StringDictionary[js.Array[Double]]): Self = StObject.set(x, "findLeaderForPartitions", js.Any.fromFunction2(value))
    
    inline def setFindTopicPartitionMetadata(value: String => js.Array[PartitionMetadata]): Self = StObject.set(x, "findTopicPartitionMetadata", js.Any.fromFunction1(value))
    
    inline def setGetNodeIds(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getNodeIds", value.toJsFn)
    
    inline def setIsConnected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConnected", value.toJsFn)
    
    inline def setMetadata(value: CallbackTo[js.Promise[BrokerMetadata]]): Self = StObject.set(x, "metadata", value.toJsFn)
    
    inline def setRefreshMetadata(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "refreshMetadata", value.toJsFn)
    
    inline def setRefreshMetadataIfNecessary(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "refreshMetadataIfNecessary", value.toJsFn)
    
    inline def setRemoveBroker(value: Port => Callback): Self = StObject.set(x, "removeBroker", js.Any.fromFunction1((t0: Port) => value(t0).runNow()))
  }
}
