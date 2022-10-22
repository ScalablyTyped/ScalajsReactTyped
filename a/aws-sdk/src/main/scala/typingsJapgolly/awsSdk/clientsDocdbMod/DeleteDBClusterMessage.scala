package typingsJapgolly.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBClusterMessage extends StObject {
  
  /**
    * The cluster identifier for the cluster to be deleted. This parameter isn't case sensitive. Constraints:   Must match an existing DBClusterIdentifier.  
    */
  var DBClusterIdentifier: String
  
  /**
    *  The cluster snapshot identifier of the new cluster snapshot created when SkipFinalSnapshot is set to false.    Specifying this parameter and also setting the SkipFinalShapshot parameter to true results in an error.   Constraints:   Must be from 1 to 255 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    *  Determines whether a final cluster snapshot is created before the cluster is deleted. If true is specified, no cluster snapshot is created. If false is specified, a cluster snapshot is created before the DB cluster is deleted.   If SkipFinalSnapshot is false, you must specify a FinalDBSnapshotIdentifier parameter.  Default: false 
    */
  var SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
}
object DeleteDBClusterMessage {
  
  inline def apply(DBClusterIdentifier: String): DeleteDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBClusterMessage]
  }
  
  extension [Self <: DeleteDBClusterMessage](x: Self) {
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setFinalDBSnapshotIdentifier(value: String): Self = StObject.set(x, "FinalDBSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setFinalDBSnapshotIdentifierUndefined: Self = StObject.set(x, "FinalDBSnapshotIdentifier", js.undefined)
    
    inline def setSkipFinalSnapshot(value: Boolean): Self = StObject.set(x, "SkipFinalSnapshot", value.asInstanceOf[js.Any])
    
    inline def setSkipFinalSnapshotUndefined: Self = StObject.set(x, "SkipFinalSnapshot", js.undefined)
  }
}
