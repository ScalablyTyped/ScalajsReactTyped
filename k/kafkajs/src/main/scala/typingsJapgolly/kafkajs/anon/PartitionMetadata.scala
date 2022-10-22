package typingsJapgolly.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionMetadata extends StObject {
  
  var partitionMetadata: js.Array[typingsJapgolly.kafkajs.mod.PartitionMetadata]
  
  var topic: String
  
  var topicErrorCode: Double
}
object PartitionMetadata {
  
  inline def apply(
    partitionMetadata: js.Array[typingsJapgolly.kafkajs.mod.PartitionMetadata],
    topic: String,
    topicErrorCode: Double
  ): PartitionMetadata = {
    val __obj = js.Dynamic.literal(partitionMetadata = partitionMetadata.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], topicErrorCode = topicErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionMetadata]
  }
  
  extension [Self <: PartitionMetadata](x: Self) {
    
    inline def setPartitionMetadata(value: js.Array[typingsJapgolly.kafkajs.mod.PartitionMetadata]): Self = StObject.set(x, "partitionMetadata", value.asInstanceOf[js.Any])
    
    inline def setPartitionMetadataVarargs(value: typingsJapgolly.kafkajs.mod.PartitionMetadata*): Self = StObject.set(x, "partitionMetadata", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicErrorCode(value: Double): Self = StObject.set(x, "topicErrorCode", value.asInstanceOf[js.Any])
  }
}
