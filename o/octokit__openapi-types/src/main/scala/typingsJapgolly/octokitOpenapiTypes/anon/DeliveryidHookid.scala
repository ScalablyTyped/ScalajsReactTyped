package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryidHookid extends StObject {
  
  var delivery_id: Double
  
  /** The unique identifier of the hook. */
  var hook_id: Double
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
}
object DeliveryidHookid {
  
  inline def apply(delivery_id: Double, hook_id: Double, org_ : String): DeliveryidHookid = {
    val __obj = js.Dynamic.literal(delivery_id = delivery_id.asInstanceOf[js.Any], hook_id = hook_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryidHookid]
  }
  
  extension [Self <: DeliveryidHookid](x: Self) {
    
    inline def setDelivery_id(value: Double): Self = StObject.set(x, "delivery_id", value.asInstanceOf[js.Any])
    
    inline def setHook_id(value: Double): Self = StObject.set(x, "hook_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
