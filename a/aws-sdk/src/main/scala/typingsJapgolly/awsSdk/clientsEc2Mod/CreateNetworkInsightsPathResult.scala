package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkInsightsPathResult extends StObject {
  
  /**
    * Information about the path.
    */
  var NetworkInsightsPath: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.NetworkInsightsPath] = js.undefined
}
object CreateNetworkInsightsPathResult {
  
  inline def apply(): CreateNetworkInsightsPathResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkInsightsPathResult]
  }
  
  extension [Self <: CreateNetworkInsightsPathResult](x: Self) {
    
    inline def setNetworkInsightsPath(value: NetworkInsightsPath): Self = StObject.set(x, "NetworkInsightsPath", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsPathUndefined: Self = StObject.set(x, "NetworkInsightsPath", js.undefined)
  }
}
