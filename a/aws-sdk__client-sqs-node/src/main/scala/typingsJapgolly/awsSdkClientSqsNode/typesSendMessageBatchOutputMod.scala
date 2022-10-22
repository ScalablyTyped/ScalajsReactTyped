package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.typesBatchResultErrorEntryMod.UnmarshalledBatchResultErrorEntry
import typingsJapgolly.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchResultEntryMod.UnmarshalledSendMessageBatchResultEntry
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSendMessageBatchOutputMod {
  
  trait SendMessageBatchOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A list of <code> <a>BatchResultErrorEntry</a> </code> items with error details about each message that can't be enqueued.</p>
      */
    var Failed: js.Array[UnmarshalledBatchResultErrorEntry]
    
    /**
      * <p>A list of <code> <a>SendMessageBatchResultEntry</a> </code> items.</p>
      */
    var Successful: js.Array[UnmarshalledSendMessageBatchResultEntry]
  }
  object SendMessageBatchOutput {
    
    inline def apply(
      $metadata: ResponseMetadata,
      Failed: js.Array[UnmarshalledBatchResultErrorEntry],
      Successful: js.Array[UnmarshalledSendMessageBatchResultEntry]
    ): SendMessageBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMessageBatchOutput]
    }
    
    extension [Self <: SendMessageBatchOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setFailed(value: js.Array[UnmarshalledBatchResultErrorEntry]): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
      
      inline def setFailedVarargs(value: UnmarshalledBatchResultErrorEntry*): Self = StObject.set(x, "Failed", js.Array(value*))
      
      inline def setSuccessful(value: js.Array[UnmarshalledSendMessageBatchResultEntry]): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulVarargs(value: UnmarshalledSendMessageBatchResultEntry*): Self = StObject.set(x, "Successful", js.Array(value*))
    }
  }
}
