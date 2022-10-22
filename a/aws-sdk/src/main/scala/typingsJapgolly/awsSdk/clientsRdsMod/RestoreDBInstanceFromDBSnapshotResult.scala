package typingsJapgolly.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBInstanceFromDBSnapshotResult extends StObject {
  
  var DBInstance: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsMod.DBInstance] = js.undefined
}
object RestoreDBInstanceFromDBSnapshotResult {
  
  inline def apply(): RestoreDBInstanceFromDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBInstanceFromDBSnapshotResult]
  }
  
  extension [Self <: RestoreDBInstanceFromDBSnapshotResult](x: Self) {
    
    inline def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
