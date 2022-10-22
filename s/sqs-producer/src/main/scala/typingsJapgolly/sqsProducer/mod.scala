package typingsJapgolly.sqsProducer

import typingsJapgolly.sqsProducer.distProducerMod.ProducerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqs-producer", "Producer")
  @js.native
  open class Producer protected ()
    extends typingsJapgolly.sqsProducer.distProducerMod.Producer {
    def this(options: ProducerOptions) = this()
  }
  /* static members */
  object Producer {
    
    @JSImport("sqs-producer", "Producer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: ProducerOptions): typingsJapgolly.sqsProducer.distProducerMod.Producer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sqsProducer.distProducerMod.Producer]
  }
}
