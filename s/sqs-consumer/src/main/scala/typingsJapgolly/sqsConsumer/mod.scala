package typingsJapgolly.sqsConsumer

import typingsJapgolly.sqsConsumer.distConsumerMod.ConsumerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqs-consumer", "Consumer")
  @js.native
  open class Consumer protected ()
    extends typingsJapgolly.sqsConsumer.distConsumerMod.Consumer {
    def this(options: ConsumerOptions) = this()
  }
  /* static members */
  object Consumer {
    
    @JSImport("sqs-consumer", "Consumer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: ConsumerOptions): typingsJapgolly.sqsConsumer.distConsumerMod.Consumer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sqsConsumer.distConsumerMod.Consumer]
  }
}
