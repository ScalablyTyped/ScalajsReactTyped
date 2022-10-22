package typingsJapgolly.kafkajs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EachMessagePayload extends StObject {
  
  def heartbeat(): js.Promise[Unit]
  
  var message: KafkaMessage
  
  var partition: Double
  
  def pause(): js.Function0[Unit]
  
  var topic: String
}
object EachMessagePayload {
  
  inline def apply(
    heartbeat: CallbackTo[js.Promise[Unit]],
    message: KafkaMessage,
    partition: Double,
    pause: CallbackTo[js.Function0[Unit]],
    topic: String
  ): EachMessagePayload = {
    val __obj = js.Dynamic.literal(heartbeat = heartbeat.toJsFn, message = message.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], pause = pause.toJsFn, topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachMessagePayload]
  }
  
  extension [Self <: EachMessagePayload](x: Self) {
    
    inline def setHeartbeat(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "heartbeat", value.toJsFn)
    
    inline def setMessage(value: KafkaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPause(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
