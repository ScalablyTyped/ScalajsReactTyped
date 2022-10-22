package typingsJapgolly.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyEventSubscriptionResponse extends StObject {
  
  /**
    * The modified event subscription.
    */
  var EventSubscription: js.UndefOr[typingsJapgolly.awsSdk.clientsDmsMod.EventSubscription] = js.undefined
}
object ModifyEventSubscriptionResponse {
  
  inline def apply(): ModifyEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyEventSubscriptionResponse]
  }
  
  extension [Self <: ModifyEventSubscriptionResponse](x: Self) {
    
    inline def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    inline def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
