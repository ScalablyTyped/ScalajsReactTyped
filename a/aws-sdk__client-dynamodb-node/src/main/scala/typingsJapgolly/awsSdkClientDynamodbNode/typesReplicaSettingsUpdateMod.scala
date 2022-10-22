package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import typingsJapgolly.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod.UnmarshalledAutoScalingSettingsUpdate
import typingsJapgolly.awsSdkClientDynamodbNode.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.ReplicaGlobalSecondaryIndexSettingsUpdate
import typingsJapgolly.awsSdkClientDynamodbNode.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicaSettingsUpdateMod {
  
  trait ReplicaSettingsUpdate extends StObject {
    
    /**
      * <p>The region of the replica to be added.</p>
      */
    var RegionName: String
    
    /**
      * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
      */
    var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
        (js.Array[
          typingsJapgolly.awsSdkClientDynamodbNode.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.ReplicaGlobalSecondaryIndexSettingsUpdate
        ]) | (js.Iterable[
          typingsJapgolly.awsSdkClientDynamodbNode.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.ReplicaGlobalSecondaryIndexSettingsUpdate
        ])
      ] = js.undefined
    
    /**
      * <p>Autoscaling settings for managing a global table replica's read capacity units.</p>
      */
    var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    
    /**
      * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
      */
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined
  }
  object ReplicaSettingsUpdate {
    
    inline def apply(RegionName: String): ReplicaSettingsUpdate = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaSettingsUpdate]
    }
    
    extension [Self <: ReplicaSettingsUpdate](x: Self) {
      
      inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      inline def setReplicaGlobalSecondaryIndexSettingsUpdate(
        value: js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate] | js.Iterable[ReplicaGlobalSecondaryIndexSettingsUpdate]
      ): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setReplicaGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.undefined)
      
      inline def setReplicaGlobalSecondaryIndexSettingsUpdateVarargs(value: ReplicaGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.Array(value*))
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
      
      inline def setReplicaProvisionedReadCapacityUnits(value: Double): Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", js.undefined)
    }
  }
  
  trait UnmarshalledReplicaSettingsUpdate
    extends StObject
       with ReplicaSettingsUpdate {
    
    /**
      * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
      */
    @JSName("ReplicaGlobalSecondaryIndexSettingsUpdate")
    var ReplicaGlobalSecondaryIndexSettingsUpdate_UnmarshalledReplicaSettingsUpdate: js.UndefOr[js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate]] = js.undefined
    
    /**
      * <p>Autoscaling settings for managing a global table replica's read capacity units.</p>
      */
    @JSName("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate")
    var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate_UnmarshalledReplicaSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingSettingsUpdate] = js.undefined
  }
  object UnmarshalledReplicaSettingsUpdate {
    
    inline def apply(RegionName: String): UnmarshalledReplicaSettingsUpdate = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledReplicaSettingsUpdate]
    }
    
    extension [Self <: UnmarshalledReplicaSettingsUpdate](x: Self) {
      
      inline def setReplicaGlobalSecondaryIndexSettingsUpdate(value: js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate]): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setReplicaGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.undefined)
      
      inline def setReplicaGlobalSecondaryIndexSettingsUpdateVarargs(value: UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.Array(value*))
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(value: UnmarshalledAutoScalingSettingsUpdate): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
    }
  }
}
