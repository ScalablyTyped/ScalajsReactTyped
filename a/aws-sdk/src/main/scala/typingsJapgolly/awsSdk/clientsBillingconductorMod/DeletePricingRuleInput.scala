package typingsJapgolly.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePricingRuleInput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the pricing rule you are deleting. 
    */
  var Arn: PricingRuleArn
}
object DeletePricingRuleInput {
  
  inline def apply(Arn: PricingRuleArn): DeletePricingRuleInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePricingRuleInput]
  }
  
  extension [Self <: DeletePricingRuleInput](x: Self) {
    
    inline def setArn(value: PricingRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
