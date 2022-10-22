package typingsJapgolly.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDBClusterResult extends StObject {
  
  var DBCluster: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsMod.DBCluster] = js.undefined
}
object StopDBClusterResult {
  
  inline def apply(): StopDBClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDBClusterResult]
  }
  
  extension [Self <: StopDBClusterResult](x: Self) {
    
    inline def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    inline def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
