package typingsJapgolly.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyReplicationTaskResponse extends StObject {
  
  /**
    * The replication task that was modified.
    */
  var ReplicationTask: js.UndefOr[typingsJapgolly.awsSdk.clientsDmsMod.ReplicationTask] = js.undefined
}
object ModifyReplicationTaskResponse {
  
  inline def apply(): ModifyReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReplicationTaskResponse]
  }
  
  extension [Self <: ModifyReplicationTaskResponse](x: Self) {
    
    inline def setReplicationTask(value: ReplicationTask): Self = StObject.set(x, "ReplicationTask", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskUndefined: Self = StObject.set(x, "ReplicationTask", js.undefined)
  }
}
