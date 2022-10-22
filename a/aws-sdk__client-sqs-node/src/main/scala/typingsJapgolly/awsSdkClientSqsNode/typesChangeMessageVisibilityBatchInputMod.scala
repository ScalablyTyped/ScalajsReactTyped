package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchRequestEntryMod.ChangeMessageVisibilityBatchRequestEntry
import typingsJapgolly.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesChangeMessageVisibilityBatchInputMod {
  
  trait ChangeMessageVisibilityBatchInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>A list of receipt handles of the messages for which the visibility timeout must be changed.</p>
      */
    var Entries: js.Array[ChangeMessageVisibilityBatchRequestEntry] | js.Iterable[ChangeMessageVisibilityBatchRequestEntry]
    
    /**
      * <p>The URL of the Amazon SQS queue whose messages' visibility is changed.</p> <p>Queue URLs and names are case-sensitive.</p>
      */
    var QueueUrl: String
  }
  object ChangeMessageVisibilityBatchInput {
    
    inline def apply(
      Entries: js.Array[ChangeMessageVisibilityBatchRequestEntry] | js.Iterable[ChangeMessageVisibilityBatchRequestEntry],
      QueueUrl: String
    ): ChangeMessageVisibilityBatchInput = {
      val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeMessageVisibilityBatchInput]
    }
    
    extension [Self <: ChangeMessageVisibilityBatchInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setEntries(
        value: js.Array[ChangeMessageVisibilityBatchRequestEntry] | js.Iterable[ChangeMessageVisibilityBatchRequestEntry]
      ): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: ChangeMessageVisibilityBatchRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
      
      inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    }
  }
}
