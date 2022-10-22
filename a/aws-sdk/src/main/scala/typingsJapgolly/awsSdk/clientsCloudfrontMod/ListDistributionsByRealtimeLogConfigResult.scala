package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByRealtimeLogConfigResult extends StObject {
  
  var DistributionList: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.DistributionList] = js.undefined
}
object ListDistributionsByRealtimeLogConfigResult {
  
  inline def apply(): ListDistributionsByRealtimeLogConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByRealtimeLogConfigResult]
  }
  
  extension [Self <: ListDistributionsByRealtimeLogConfigResult](x: Self) {
    
    inline def setDistributionList(value: DistributionList): Self = StObject.set(x, "DistributionList", value.asInstanceOf[js.Any])
    
    inline def setDistributionListUndefined: Self = StObject.set(x, "DistributionList", js.undefined)
  }
}
