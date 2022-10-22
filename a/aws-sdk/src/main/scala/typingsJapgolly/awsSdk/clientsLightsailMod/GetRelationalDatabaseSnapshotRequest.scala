package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseSnapshotRequest extends StObject {
  
  /**
    * The name of the database snapshot for which to get information.
    */
  var relationalDatabaseSnapshotName: ResourceName
}
object GetRelationalDatabaseSnapshotRequest {
  
  inline def apply(relationalDatabaseSnapshotName: ResourceName): GetRelationalDatabaseSnapshotRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseSnapshotName = relationalDatabaseSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotRequest]
  }
  
  extension [Self <: GetRelationalDatabaseSnapshotRequest](x: Self) {
    
    inline def setRelationalDatabaseSnapshotName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseSnapshotName", value.asInstanceOf[js.Any])
  }
}
