package typingsJapgolly.braintree.anon

import typingsJapgolly.braintree.braintreeStrings.active_
import typingsJapgolly.braintree.braintreeStrings.pending_
import typingsJapgolly.braintree.braintreeStrings.suspended_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active extends StObject {
  
  var Active: active_
  
  var Pending: pending_
  
  var Suspended: suspended_
}
object Active {
  
  inline def apply(): Active = {
    val __obj = js.Dynamic.literal(Active = "active", Pending = "pending", Suspended = "suspended")
    __obj.asInstanceOf[Active]
  }
  
  extension [Self <: Active](x: Self) {
    
    inline def setActive(value: active_): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setPending(value: pending_): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
    
    inline def setSuspended(value: suspended_): Self = StObject.set(x, "Suspended", value.asInstanceOf[js.Any])
  }
}
