package typingsJapgolly.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBillingGroupsFilter extends StObject {
  
  /**
    * The list of billing group Amazon Resource Names (ARNs) to retrieve information. 
    */
  var Arns: js.UndefOr[BillingGroupArnList] = js.undefined
  
  /**
    * The pricing plan Amazon Resource Names (ARNs) to retrieve information. 
    */
  var PricingPlan: js.UndefOr[PricingPlanFullArn] = js.undefined
}
object ListBillingGroupsFilter {
  
  inline def apply(): ListBillingGroupsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBillingGroupsFilter]
  }
  
  extension [Self <: ListBillingGroupsFilter](x: Self) {
    
    inline def setArns(value: BillingGroupArnList): Self = StObject.set(x, "Arns", value.asInstanceOf[js.Any])
    
    inline def setArnsUndefined: Self = StObject.set(x, "Arns", js.undefined)
    
    inline def setArnsVarargs(value: BillingGroupArn*): Self = StObject.set(x, "Arns", js.Array(value*))
    
    inline def setPricingPlan(value: PricingPlanFullArn): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
  }
}
