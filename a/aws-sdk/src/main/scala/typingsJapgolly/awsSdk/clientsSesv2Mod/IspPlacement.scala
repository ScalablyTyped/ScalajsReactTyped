package typingsJapgolly.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IspPlacement extends StObject {
  
  /**
    * The name of the email provider that the inbox placement data applies to.
    */
  var IspName: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.IspName] = js.undefined
  
  /**
    * An object that contains inbox placement metrics for a specific email provider.
    */
  var PlacementStatistics: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.PlacementStatistics] = js.undefined
}
object IspPlacement {
  
  inline def apply(): IspPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IspPlacement]
  }
  
  extension [Self <: IspPlacement](x: Self) {
    
    inline def setIspName(value: IspName): Self = StObject.set(x, "IspName", value.asInstanceOf[js.Any])
    
    inline def setIspNameUndefined: Self = StObject.set(x, "IspName", js.undefined)
    
    inline def setPlacementStatistics(value: PlacementStatistics): Self = StObject.set(x, "PlacementStatistics", value.asInstanceOf[js.Any])
    
    inline def setPlacementStatisticsUndefined: Self = StObject.set(x, "PlacementStatistics", js.undefined)
  }
}
