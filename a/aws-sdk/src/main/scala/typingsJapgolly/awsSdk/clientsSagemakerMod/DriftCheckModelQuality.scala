package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriftCheckModelQuality extends StObject {
  
  /**
    * The drift check model quality constraints.
    */
  var Constraints: js.UndefOr[MetricsSource] = js.undefined
  
  /**
    * The drift check model quality statistics.
    */
  var Statistics: js.UndefOr[MetricsSource] = js.undefined
}
object DriftCheckModelQuality {
  
  inline def apply(): DriftCheckModelQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriftCheckModelQuality]
  }
  
  extension [Self <: DriftCheckModelQuality](x: Self) {
    
    inline def setConstraints(value: MetricsSource): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
    
    inline def setStatistics(value: MetricsSource): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "Statistics", js.undefined)
  }
}
