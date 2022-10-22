package typingsJapgolly.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateShardCountInput extends StObject {
  
  /**
    * The scaling type. Uniform scaling creates shards of equal size.
    */
  var ScalingType: typingsJapgolly.awsSdk.clientsKinesisMod.ScalingType
  
  /**
    * The name of the stream.
    */
  var StreamName: typingsJapgolly.awsSdk.clientsKinesisMod.StreamName
  
  /**
    * The new number of shards. This value has the following default limits. By default, you cannot do the following:    Set this value to more than double your current shard count for a stream.   Set this value below half your current shard count for a stream.   Set this value to more than 10000 shards in a stream (the default limit for shard count per stream is 10000 per account per region), unless you request a limit increase.   Scale a stream with more than 10000 shards down unless you set this value to less than 10000 shards.  
    */
  var TargetShardCount: PositiveIntegerObject
}
object UpdateShardCountInput {
  
  inline def apply(ScalingType: ScalingType, StreamName: StreamName, TargetShardCount: PositiveIntegerObject): UpdateShardCountInput = {
    val __obj = js.Dynamic.literal(ScalingType = ScalingType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], TargetShardCount = TargetShardCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShardCountInput]
  }
  
  extension [Self <: UpdateShardCountInput](x: Self) {
    
    inline def setScalingType(value: ScalingType): Self = StObject.set(x, "ScalingType", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setTargetShardCount(value: PositiveIntegerObject): Self = StObject.set(x, "TargetShardCount", value.asInstanceOf[js.Any])
  }
}
