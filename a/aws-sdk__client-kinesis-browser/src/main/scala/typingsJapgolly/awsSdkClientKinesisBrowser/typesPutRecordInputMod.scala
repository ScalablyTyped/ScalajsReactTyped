package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutRecordInputMod {
  
  trait PutRecordInput
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
      * <p>The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).</p>
      */
    var Data: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String
    
    /**
      * <p>The hash value used to explicitly determine the shard the data record is assigned to by overriding the partition key hash.</p>
      */
    var ExplicitHashKey: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings with a maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition key as input to a hash function that maps the partition key and associated data to a specific shard. Specifically, an MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As a result of this hashing mechanism, all data records with the same partition key map to the same shard within the stream.</p>
      */
    var PartitionKey: String
    
    /**
      * <p>Guarantees strictly increasing sequence numbers, for puts from the same client and to the same partition key. Usage: set the <code>SequenceNumberForOrdering</code> of record <i>n</i> to the sequence number of record <i>n-1</i> (as returned in the result when putting record <i>n-1</i>). If this parameter is not set, records are coarsely ordered based on arrival time.</p>
      */
    var SequenceNumberForOrdering: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the stream to put the data record into.</p>
      */
    var StreamName: String
  }
  object PutRecordInput {
    
    inline def apply(
      Data: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      PartitionKey: String,
      StreamName: String
    ): PutRecordInput = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutRecordInput]
    }
    
    extension [Self <: PutRecordInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setData(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setExplicitHashKey(value: String): Self = StObject.set(x, "ExplicitHashKey", value.asInstanceOf[js.Any])
      
      inline def setExplicitHashKeyUndefined: Self = StObject.set(x, "ExplicitHashKey", js.undefined)
      
      inline def setPartitionKey(value: String): Self = StObject.set(x, "PartitionKey", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumberForOrdering(value: String): Self = StObject.set(x, "SequenceNumberForOrdering", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumberForOrderingUndefined: Self = StObject.set(x, "SequenceNumberForOrdering", js.undefined)
      
      inline def setStreamName(value: String): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    }
  }
}
