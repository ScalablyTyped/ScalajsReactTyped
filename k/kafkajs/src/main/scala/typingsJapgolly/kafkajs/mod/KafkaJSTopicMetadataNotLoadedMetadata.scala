package typingsJapgolly.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaJSTopicMetadataNotLoadedMetadata extends StObject {
  
  var topic: String
}
object KafkaJSTopicMetadataNotLoadedMetadata {
  
  inline def apply(topic: String): KafkaJSTopicMetadataNotLoadedMetadata = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaJSTopicMetadataNotLoadedMetadata]
  }
  
  extension [Self <: KafkaJSTopicMetadataNotLoadedMetadata](x: Self) {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
