package typingsJapgolly.kafkajs.mod

import typingsJapgolly.kafkajs.anon.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerMetadata extends StObject {
  
  var brokers: js.Array[NodeId]
  
  var topicMetadata: js.Array[typingsJapgolly.kafkajs.anon.PartitionMetadata]
}
object BrokerMetadata {
  
  inline def apply(brokers: js.Array[NodeId], topicMetadata: js.Array[typingsJapgolly.kafkajs.anon.PartitionMetadata]): BrokerMetadata = {
    val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any], topicMetadata = topicMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerMetadata]
  }
  
  extension [Self <: BrokerMetadata](x: Self) {
    
    inline def setBrokers(value: js.Array[NodeId]): Self = StObject.set(x, "brokers", value.asInstanceOf[js.Any])
    
    inline def setBrokersVarargs(value: NodeId*): Self = StObject.set(x, "brokers", js.Array(value*))
    
    inline def setTopicMetadata(value: js.Array[typingsJapgolly.kafkajs.anon.PartitionMetadata]): Self = StObject.set(x, "topicMetadata", value.asInstanceOf[js.Any])
    
    inline def setTopicMetadataVarargs(value: typingsJapgolly.kafkajs.anon.PartitionMetadata*): Self = StObject.set(x, "topicMetadata", js.Array(value*))
  }
}
