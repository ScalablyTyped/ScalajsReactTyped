package typingsJapgolly.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBInstanceFromS3Result extends StObject {
  
  var DBInstance: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsMod.DBInstance] = js.undefined
}
object RestoreDBInstanceFromS3Result {
  
  inline def apply(): RestoreDBInstanceFromS3Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBInstanceFromS3Result]
  }
  
  extension [Self <: RestoreDBInstanceFromS3Result](x: Self) {
    
    inline def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
