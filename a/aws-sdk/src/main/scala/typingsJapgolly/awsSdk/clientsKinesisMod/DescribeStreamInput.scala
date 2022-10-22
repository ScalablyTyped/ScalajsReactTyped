package typingsJapgolly.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamInput extends StObject {
  
  /**
    * The shard ID of the shard to start with. Specify this parameter to indicate that you want to describe the stream starting with the shard whose ID immediately follows ExclusiveStartShardId. If you don't specify this parameter, the default behavior for DescribeStream is to describe the stream starting with the first shard in the stream.
    */
  var ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined
  
  /**
    * The maximum number of shards to return in a single call. The default value is 100. If you specify a value greater than 100, at most 100 results are returned.
    */
  var Limit: js.UndefOr[DescribeStreamInputLimit] = js.undefined
  
  /**
    * The name of the stream to describe.
    */
  var StreamName: typingsJapgolly.awsSdk.clientsKinesisMod.StreamName
}
object DescribeStreamInput {
  
  inline def apply(StreamName: StreamName): DescribeStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamInput]
  }
  
  extension [Self <: DescribeStreamInput](x: Self) {
    
    inline def setExclusiveStartShardId(value: ShardId): Self = StObject.set(x, "ExclusiveStartShardId", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartShardIdUndefined: Self = StObject.set(x, "ExclusiveStartShardId", js.undefined)
    
    inline def setLimit(value: DescribeStreamInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
