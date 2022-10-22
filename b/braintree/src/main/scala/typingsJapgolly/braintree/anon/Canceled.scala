package typingsJapgolly.braintree.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.braintree.braintreeStrings.Expired
import typingsJapgolly.braintree.braintreeStrings.Pending
import typingsJapgolly.braintree.braintreeStrings.`Past Due`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canceled extends StObject {
  
  var Active: typingsJapgolly.braintree.braintreeStrings.Active
  
  def All(): js.Array[String]
  
  var Canceled: typingsJapgolly.braintree.braintreeStrings.Canceled
  
  var Expired: typingsJapgolly.braintree.braintreeStrings.Expired
  
  var PastDue: `Past Due`
  
  var Pending: typingsJapgolly.braintree.braintreeStrings.Pending
}
object Canceled {
  
  inline def apply(All: CallbackTo[js.Array[String]]): Canceled = {
    val __obj = js.Dynamic.literal(Active = "Active", All = All.toJsFn, Canceled = "Canceled", Expired = "Expired", PastDue = "Past Due", Pending = "Pending")
    __obj.asInstanceOf[Canceled]
  }
  
  extension [Self <: Canceled](x: Self) {
    
    inline def setActive(value: typingsJapgolly.braintree.braintreeStrings.Active): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setAll(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "All", value.toJsFn)
    
    inline def setCanceled(value: typingsJapgolly.braintree.braintreeStrings.Canceled): Self = StObject.set(x, "Canceled", value.asInstanceOf[js.Any])
    
    inline def setExpired(value: Expired): Self = StObject.set(x, "Expired", value.asInstanceOf[js.Any])
    
    inline def setPastDue(value: `Past Due`): Self = StObject.set(x, "PastDue", value.asInstanceOf[js.Any])
    
    inline def setPending(value: Pending): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
  }
}
