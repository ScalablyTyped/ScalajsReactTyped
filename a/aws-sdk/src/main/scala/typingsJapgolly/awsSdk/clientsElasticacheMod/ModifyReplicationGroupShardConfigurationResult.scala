package typingsJapgolly.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyReplicationGroupShardConfigurationResult extends StObject {
  
  var ReplicationGroup: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticacheMod.ReplicationGroup] = js.undefined
}
object ModifyReplicationGroupShardConfigurationResult {
  
  inline def apply(): ModifyReplicationGroupShardConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReplicationGroupShardConfigurationResult]
  }
  
  extension [Self <: ModifyReplicationGroupShardConfigurationResult](x: Self) {
    
    inline def setReplicationGroup(value: ReplicationGroup): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
  }
}
