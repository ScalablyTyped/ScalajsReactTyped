package typingsJapgolly.awsSdk.clientsDynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shard extends StObject {
  
  /**
    * The shard ID of the current shard's parent.
    */
  var ParentShardId: js.UndefOr[ShardId] = js.undefined
  
  /**
    * The range of possible sequence numbers for the shard.
    */
  var SequenceNumberRange: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbstreamsMod.SequenceNumberRange] = js.undefined
  
  /**
    * The system-generated identifier for this shard.
    */
  var ShardId: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbstreamsMod.ShardId] = js.undefined
}
object Shard {
  
  inline def apply(): Shard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shard]
  }
  
  extension [Self <: Shard](x: Self) {
    
    inline def setParentShardId(value: ShardId): Self = StObject.set(x, "ParentShardId", value.asInstanceOf[js.Any])
    
    inline def setParentShardIdUndefined: Self = StObject.set(x, "ParentShardId", js.undefined)
    
    inline def setSequenceNumberRange(value: SequenceNumberRange): Self = StObject.set(x, "SequenceNumberRange", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberRangeUndefined: Self = StObject.set(x, "SequenceNumberRange", js.undefined)
    
    inline def setShardId(value: ShardId): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
    
    inline def setShardIdUndefined: Self = StObject.set(x, "ShardId", js.undefined)
  }
}
