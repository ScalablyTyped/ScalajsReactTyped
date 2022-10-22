package typingsJapgolly.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromoteReadReplicaResult extends StObject {
  
  var DBInstance: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsMod.DBInstance] = js.undefined
}
object PromoteReadReplicaResult {
  
  inline def apply(): PromoteReadReplicaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromoteReadReplicaResult]
  }
  
  extension [Self <: PromoteReadReplicaResult](x: Self) {
    
    inline def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
