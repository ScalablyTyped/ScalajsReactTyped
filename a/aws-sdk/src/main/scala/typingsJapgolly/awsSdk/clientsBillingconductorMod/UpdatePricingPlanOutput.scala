package typingsJapgolly.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePricingPlanOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated pricing plan. 
    */
  var Arn: js.UndefOr[PricingPlanArn] = js.undefined
  
  /**
    *  The new description for the pricing rule. 
    */
  var Description: js.UndefOr[PricingPlanDescription] = js.undefined
  
  /**
    *  The most recent time the pricing plan was modified. 
    */
  var LastModifiedTime: js.UndefOr[Instant] = js.undefined
  
  /**
    *  The name of the pricing plan. The name must be unique to each pricing plan. 
    */
  var Name: js.UndefOr[PricingPlanName] = js.undefined
  
  /**
    *  The pricing rules count currently associated with this pricing plan list. 
    */
  var Size: js.UndefOr[NumberOfAssociatedPricingRules] = js.undefined
}
object UpdatePricingPlanOutput {
  
  inline def apply(): UpdatePricingPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePricingPlanOutput]
  }
  
  extension [Self <: UpdatePricingPlanOutput](x: Self) {
    
    inline def setArn(value: PricingPlanArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: PricingPlanDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedTime(value: Instant): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: PricingPlanName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSize(value: NumberOfAssociatedPricingRules): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
