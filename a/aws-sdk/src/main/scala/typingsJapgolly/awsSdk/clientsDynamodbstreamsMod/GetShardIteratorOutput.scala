package typingsJapgolly.awsSdk.clientsDynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetShardIteratorOutput extends StObject {
  
  /**
    * The position in the shard from which to start reading stream records sequentially. A shard iterator specifies this position using the sequence number of a stream record in a shard.
    */
  var ShardIterator: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbstreamsMod.ShardIterator] = js.undefined
}
object GetShardIteratorOutput {
  
  inline def apply(): GetShardIteratorOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetShardIteratorOutput]
  }
  
  extension [Self <: GetShardIteratorOutput](x: Self) {
    
    inline def setShardIterator(value: ShardIterator): Self = StObject.set(x, "ShardIterator", value.asInstanceOf[js.Any])
    
    inline def setShardIteratorUndefined: Self = StObject.set(x, "ShardIterator", js.undefined)
  }
}
