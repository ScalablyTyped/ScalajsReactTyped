package typingsJapgolly.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFromGlobalClusterResult extends StObject {
  
  var GlobalCluster: js.UndefOr[typingsJapgolly.awsSdk.clientsDocdbMod.GlobalCluster] = js.undefined
}
object RemoveFromGlobalClusterResult {
  
  inline def apply(): RemoveFromGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFromGlobalClusterResult]
  }
  
  extension [Self <: RemoveFromGlobalClusterResult](x: Self) {
    
    inline def setGlobalCluster(value: GlobalCluster): Self = StObject.set(x, "GlobalCluster", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterUndefined: Self = StObject.set(x, "GlobalCluster", js.undefined)
  }
}
