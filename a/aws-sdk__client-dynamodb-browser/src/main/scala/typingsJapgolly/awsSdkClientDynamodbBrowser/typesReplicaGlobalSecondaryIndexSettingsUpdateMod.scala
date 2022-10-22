package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.UnmarshalledAutoScalingSettingsUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicaGlobalSecondaryIndexSettingsUpdateMod {
  
  trait ReplicaGlobalSecondaryIndexSettingsUpdate extends StObject {
    
    /**
      * <p>The name of the global secondary index. The name must be unique among all other indexes on this table.</p>
      */
    var IndexName: String
    
    /**
      * <p>Autoscaling settings for managing a global secondary index replica's read capacity units.</p>
      */
    var ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    
    /**
      * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
      */
    var ProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined
  }
  object ReplicaGlobalSecondaryIndexSettingsUpdate {
    
    inline def apply(IndexName: String): ReplicaGlobalSecondaryIndexSettingsUpdate = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsUpdate]
    }
    
    extension [Self <: ReplicaGlobalSecondaryIndexSettingsUpdate](x: Self) {
      
      inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
      
      inline def setProvisionedReadCapacityUnits(value: Double): Self = StObject.set(x, "ProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityUnits", js.undefined)
    }
  }
  
  trait UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate
    extends StObject
       with ReplicaGlobalSecondaryIndexSettingsUpdate {
    
    /**
      * <p>Autoscaling settings for managing a global secondary index replica's read capacity units.</p>
      */
    @JSName("ProvisionedReadCapacityAutoScalingSettingsUpdate")
    var ProvisionedReadCapacityAutoScalingSettingsUpdate_UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingSettingsUpdate] = js.undefined
  }
  object UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate {
    
    inline def apply(IndexName: String): UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate]
    }
    
    extension [Self <: UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate](x: Self) {
      
      inline def setProvisionedReadCapacityAutoScalingSettingsUpdate(value: UnmarshalledAutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
    }
  }
}
