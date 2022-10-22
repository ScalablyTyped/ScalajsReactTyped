package typingsJapgolly.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfManagedKafkaEventSourceConfig extends StObject {
  
  /**
    * The identifier for the Kafka consumer group to join. The consumer group ID must be unique among all your Kafka event sources. After creating a Kafka event source mapping with the consumer group ID specified, you cannot update this value. For more information, see services-msk-consumer-group-id.
    */
  var ConsumerGroupId: js.UndefOr[URI] = js.undefined
}
object SelfManagedKafkaEventSourceConfig {
  
  inline def apply(): SelfManagedKafkaEventSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfManagedKafkaEventSourceConfig]
  }
  
  extension [Self <: SelfManagedKafkaEventSourceConfig](x: Self) {
    
    inline def setConsumerGroupId(value: URI): Self = StObject.set(x, "ConsumerGroupId", value.asInstanceOf[js.Any])
    
    inline def setConsumerGroupIdUndefined: Self = StObject.set(x, "ConsumerGroupId", js.undefined)
  }
}
