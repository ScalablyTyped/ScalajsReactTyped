package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.typesConsumerMod.UnmarshalledConsumer
import typingsJapgolly.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRegisterStreamConsumerOutputMod {
  
  trait RegisterStreamConsumerOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>An object that represents the details of the consumer you registered. When you register a consumer, it gets an ARN that is generated by Kinesis Data Streams.</p>
      */
    var Consumer: UnmarshalledConsumer
  }
  object RegisterStreamConsumerOutput {
    
    inline def apply($metadata: ResponseMetadata, Consumer: UnmarshalledConsumer): RegisterStreamConsumerOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Consumer = Consumer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisterStreamConsumerOutput]
    }
    
    extension [Self <: RegisterStreamConsumerOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConsumer(value: UnmarshalledConsumer): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
    }
  }
}
