package typingsJapgolly.sqsConsumer

import typingsJapgolly.sqsConsumer.consumerMod.ConsumerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqs-consumer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Consumer protected ()
    extends typingsJapgolly.sqsConsumer.consumerMod.Consumer {
    def this(options: ConsumerOptions) = this()
  }
  
  /* static members */
  @js.native
  object Consumer extends js.Object {
    def create(options: ConsumerOptions): typingsJapgolly.sqsConsumer.consumerMod.Consumer = js.native
  }
  
}

