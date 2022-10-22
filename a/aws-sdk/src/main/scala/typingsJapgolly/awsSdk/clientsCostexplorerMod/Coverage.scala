package typingsJapgolly.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coverage extends StObject {
  
  /**
    * The amount of cost that the reservation covered.
    */
  var CoverageCost: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.CoverageCost] = js.undefined
  
  /**
    * The amount of instance usage that the reservation covered, in hours.
    */
  var CoverageHours: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.CoverageHours] = js.undefined
  
  /**
    * The amount of instance usage that the reservation covered, in normalized units.
    */
  var CoverageNormalizedUnits: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.CoverageNormalizedUnits] = js.undefined
}
object Coverage {
  
  inline def apply(): Coverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coverage]
  }
  
  extension [Self <: Coverage](x: Self) {
    
    inline def setCoverageCost(value: CoverageCost): Self = StObject.set(x, "CoverageCost", value.asInstanceOf[js.Any])
    
    inline def setCoverageCostUndefined: Self = StObject.set(x, "CoverageCost", js.undefined)
    
    inline def setCoverageHours(value: CoverageHours): Self = StObject.set(x, "CoverageHours", value.asInstanceOf[js.Any])
    
    inline def setCoverageHoursUndefined: Self = StObject.set(x, "CoverageHours", js.undefined)
    
    inline def setCoverageNormalizedUnits(value: CoverageNormalizedUnits): Self = StObject.set(x, "CoverageNormalizedUnits", value.asInstanceOf[js.Any])
    
    inline def setCoverageNormalizedUnitsUndefined: Self = StObject.set(x, "CoverageNormalizedUnits", js.undefined)
  }
}
