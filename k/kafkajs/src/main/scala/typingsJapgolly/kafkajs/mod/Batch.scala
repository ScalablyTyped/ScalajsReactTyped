package typingsJapgolly.kafkajs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Batch extends StObject {
  
  def firstOffset(): String | Null
  
  var highWatermark: String
  
  def isEmpty(): Boolean
  
  def lastOffset(): String
  
  var messages: js.Array[KafkaMessage]
  
  def offsetLag(): String
  
  def offsetLagLow(): String
  
  var partition: Double
  
  var topic: String
}
object Batch {
  
  inline def apply(
    firstOffset: CallbackTo[String | Null],
    highWatermark: String,
    isEmpty: CallbackTo[Boolean],
    lastOffset: CallbackTo[String],
    messages: js.Array[KafkaMessage],
    offsetLag: CallbackTo[String],
    offsetLagLow: CallbackTo[String],
    partition: Double,
    topic: String
  ): Batch = {
    val __obj = js.Dynamic.literal(firstOffset = firstOffset.toJsFn, highWatermark = highWatermark.asInstanceOf[js.Any], isEmpty = isEmpty.toJsFn, lastOffset = lastOffset.toJsFn, messages = messages.asInstanceOf[js.Any], offsetLag = offsetLag.toJsFn, offsetLagLow = offsetLagLow.toJsFn, partition = partition.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batch]
  }
  
  extension [Self <: Batch](x: Self) {
    
    inline def setFirstOffset(value: CallbackTo[String | Null]): Self = StObject.set(x, "firstOffset", value.toJsFn)
    
    inline def setHighWatermark(value: String): Self = StObject.set(x, "highWatermark", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setLastOffset(value: CallbackTo[String]): Self = StObject.set(x, "lastOffset", value.toJsFn)
    
    inline def setMessages(value: js.Array[KafkaMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: KafkaMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setOffsetLag(value: CallbackTo[String]): Self = StObject.set(x, "offsetLag", value.toJsFn)
    
    inline def setOffsetLagLow(value: CallbackTo[String]): Self = StObject.set(x, "offsetLagLow", value.toJsFn)
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
