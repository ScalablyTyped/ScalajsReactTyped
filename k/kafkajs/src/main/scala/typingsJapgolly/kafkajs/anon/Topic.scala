package typingsJapgolly.kafkajs.anon

import typingsJapgolly.kafkajs.mod.SeekEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Topic extends StObject {
  
  var groupId: String
  
  var partitions: js.Array[SeekEntry]
  
  var topic: String
}
object Topic {
  
  inline def apply(groupId: String, partitions: js.Array[SeekEntry], topic: String): Topic = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], partitions = partitions.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
  
  extension [Self <: Topic](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setPartitions(value: js.Array[SeekEntry]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: SeekEntry*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
