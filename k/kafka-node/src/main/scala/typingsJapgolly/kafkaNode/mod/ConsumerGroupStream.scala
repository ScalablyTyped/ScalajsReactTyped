package typingsJapgolly.kafkaNode.mod

import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "ConsumerGroupStream")
@js.native
open class ConsumerGroupStream protected () extends Readable {
  def this(options: ConsumerGroupStreamOptions, topics: String) = this()
  def this(options: ConsumerGroupStreamOptions, topics: js.Array[String]) = this()
  
  var client: KafkaClient = js.native
  
  def close(cb: js.Function0[Any]): Unit = js.native
  
  def commit(message: Message): Unit = js.native
  def commit(message: Message, force: Boolean): Unit = js.native
  def commit(message: Message, force: Boolean, cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
  def commit(message: Message, force: Unit, cb: js.Function2[/* error */ Any, /* data */ Any, Any]): Unit = js.native
  
  var consumerGroup: ConsumerGroup = js.native
  
  def transmitMessages(): Unit = js.native
}
