package typingsJapgolly.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationGroupResult extends StObject {
  
  var ReplicationGroup: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticacheMod.ReplicationGroup] = js.undefined
}
object DeleteReplicationGroupResult {
  
  inline def apply(): DeleteReplicationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReplicationGroupResult]
  }
  
  extension [Self <: DeleteReplicationGroupResult](x: Self) {
    
    inline def setReplicationGroup(value: ReplicationGroup): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
  }
}
