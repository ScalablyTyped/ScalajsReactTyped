package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
import typingsJapgolly.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateGlobalTableSettingsInputMod {
  
  trait UpdateGlobalTableSettingsInput
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
      * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
      */
    var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
        (js.Array[
          typingsJapgolly.awsSdkClientDynamodbBrowser.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
        ]) | (js.Iterable[
          typingsJapgolly.awsSdkClientDynamodbBrowser.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
        ])
      ] = js.undefined
    
    /**
      * <p>The name of the global table</p>
      */
    var GlobalTableName: String
    
    /**
      * <p>AutoScaling settings for managing provisioned write capacity for the global table.</p>
      */
    var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    
    /**
      * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException.</code> </p>
      */
    var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Represents the settings for a global table in a region that will be modified.</p>
      */
    var ReplicaSettingsUpdate: js.UndefOr[
        (js.Array[
          typingsJapgolly.awsSdkClientDynamodbBrowser.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
        ]) | (js.Iterable[
          typingsJapgolly.awsSdkClientDynamodbBrowser.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
        ])
      ] = js.undefined
  }
  object UpdateGlobalTableSettingsInput {
    
    inline def apply(GlobalTableName: String): UpdateGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalTableSettingsInput]
    }
    
    extension [Self <: UpdateGlobalTableSettingsInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setGlobalTableGlobalSecondaryIndexSettingsUpdate(
        value: js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate] | js.Iterable[GlobalTableGlobalSecondaryIndexSettingsUpdate]
      ): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.undefined)
      
      inline def setGlobalTableGlobalSecondaryIndexSettingsUpdateVarargs(value: GlobalTableGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.Array(value*))
      
      inline def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
      
      inline def setGlobalTableProvisionedWriteCapacityUnits(value: Double): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", js.undefined)
      
      inline def setReplicaSettingsUpdate(value: js.Array[ReplicaSettingsUpdate] | js.Iterable[ReplicaSettingsUpdate]): Self = StObject.set(x, "ReplicaSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setReplicaSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaSettingsUpdate", js.undefined)
      
      inline def setReplicaSettingsUpdateVarargs(value: ReplicaSettingsUpdate*): Self = StObject.set(x, "ReplicaSettingsUpdate", js.Array(value*))
    }
  }
}
