package typingsJapgolly.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterDbRevisionMessage extends StObject {
  
  /**
    * The unique identifier of a cluster whose database revision you want to modify.  Example: examplecluster 
    */
  var ClusterIdentifier: String
  
  /**
    * The identifier of the database revision. You can retrieve this value from the response to the DescribeClusterDbRevisions request.
    */
  var RevisionTarget: String
}
object ModifyClusterDbRevisionMessage {
  
  inline def apply(ClusterIdentifier: String, RevisionTarget: String): ModifyClusterDbRevisionMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], RevisionTarget = RevisionTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterDbRevisionMessage]
  }
  
  extension [Self <: ModifyClusterDbRevisionMessage](x: Self) {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRevisionTarget(value: String): Self = StObject.set(x, "RevisionTarget", value.asInstanceOf[js.Any])
  }
}
