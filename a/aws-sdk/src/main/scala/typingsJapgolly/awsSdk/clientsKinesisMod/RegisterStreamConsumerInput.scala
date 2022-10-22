package typingsJapgolly.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterStreamConsumerInput extends StObject {
  
  /**
    * For a given Kinesis data stream, each consumer must have a unique name. However, consumer names don't have to be unique across data streams.
    */
  var ConsumerName: typingsJapgolly.awsSdk.clientsKinesisMod.ConsumerName
  
  /**
    * The ARN of the Kinesis data stream that you want to register the consumer with. For more info, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces.
    */
  var StreamARN: typingsJapgolly.awsSdk.clientsKinesisMod.StreamARN
}
object RegisterStreamConsumerInput {
  
  inline def apply(ConsumerName: ConsumerName, StreamARN: StreamARN): RegisterStreamConsumerInput = {
    val __obj = js.Dynamic.literal(ConsumerName = ConsumerName.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterStreamConsumerInput]
  }
  
  extension [Self <: RegisterStreamConsumerInput](x: Self) {
    
    inline def setConsumerName(value: ConsumerName): Self = StObject.set(x, "ConsumerName", value.asInstanceOf[js.Any])
    
    inline def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
  }
}
