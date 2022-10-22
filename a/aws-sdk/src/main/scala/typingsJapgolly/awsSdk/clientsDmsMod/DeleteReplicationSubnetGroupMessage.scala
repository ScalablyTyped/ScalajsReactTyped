package typingsJapgolly.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationSubnetGroupMessage extends StObject {
  
  /**
    * The subnet group name of the replication instance.
    */
  var ReplicationSubnetGroupIdentifier: String
}
object DeleteReplicationSubnetGroupMessage {
  
  inline def apply(ReplicationSubnetGroupIdentifier: String): DeleteReplicationSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationSubnetGroupMessage]
  }
  
  extension [Self <: DeleteReplicationSubnetGroupMessage](x: Self) {
    
    inline def setReplicationSubnetGroupIdentifier(value: String): Self = StObject.set(x, "ReplicationSubnetGroupIdentifier", value.asInstanceOf[js.Any])
  }
}
