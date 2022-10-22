package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByCachePolicyIdResult extends StObject {
  
  /**
    * A list of distribution IDs.
    */
  var DistributionIdList: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.DistributionIdList] = js.undefined
}
object ListDistributionsByCachePolicyIdResult {
  
  inline def apply(): ListDistributionsByCachePolicyIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByCachePolicyIdResult]
  }
  
  extension [Self <: ListDistributionsByCachePolicyIdResult](x: Self) {
    
    inline def setDistributionIdList(value: DistributionIdList): Self = StObject.set(x, "DistributionIdList", value.asInstanceOf[js.Any])
    
    inline def setDistributionIdListUndefined: Self = StObject.set(x, "DistributionIdList", js.undefined)
  }
}
