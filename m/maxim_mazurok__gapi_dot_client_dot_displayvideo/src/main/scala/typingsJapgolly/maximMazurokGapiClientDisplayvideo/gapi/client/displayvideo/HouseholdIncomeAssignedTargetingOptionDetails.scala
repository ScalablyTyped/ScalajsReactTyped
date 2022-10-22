package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HouseholdIncomeAssignedTargetingOptionDetails extends StObject {
  
  /** The household income of the audience. Output only in v1. Required in v2. */
  var householdIncome: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_HOUSEHOLD_INCOME`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object HouseholdIncomeAssignedTargetingOptionDetails {
  
  inline def apply(): HouseholdIncomeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HouseholdIncomeAssignedTargetingOptionDetails]
  }
  
  extension [Self <: HouseholdIncomeAssignedTargetingOptionDetails](x: Self) {
    
    inline def setHouseholdIncome(value: String): Self = StObject.set(x, "householdIncome", value.asInstanceOf[js.Any])
    
    inline def setHouseholdIncomeUndefined: Self = StObject.set(x, "householdIncome", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
