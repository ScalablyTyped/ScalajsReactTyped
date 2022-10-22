package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetQueueUrlOutputMod {
  
  trait GetQueueUrlOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The URL of the queue.</p>
      */
    var QueueUrl: js.UndefOr[String] = js.undefined
  }
  object GetQueueUrlOutput {
    
    inline def apply($metadata: ResponseMetadata): GetQueueUrlOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetQueueUrlOutput]
    }
    
    extension [Self <: GetQueueUrlOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
      
      inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
    }
  }
}
