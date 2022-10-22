package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveThingFromBillingGroupRequest extends StObject {
  
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined
  
  /**
    * The name of the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
  
  /**
    * The ARN of the thing to be removed from the billing group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  
  /**
    * The name of the thing to be removed from the billing group.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}
object RemoveThingFromBillingGroupRequest {
  
  inline def apply(): RemoveThingFromBillingGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveThingFromBillingGroupRequest]
  }
  
  extension [Self <: RemoveThingFromBillingGroupRequest](x: Self) {
    
    inline def setBillingGroupArn(value: BillingGroupArn): Self = StObject.set(x, "billingGroupArn", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupArnUndefined: Self = StObject.set(x, "billingGroupArn", js.undefined)
    
    inline def setBillingGroupName(value: BillingGroupName): Self = StObject.set(x, "billingGroupName", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupNameUndefined: Self = StObject.set(x, "billingGroupName", js.undefined)
    
    inline def setThingArn(value: ThingArn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
