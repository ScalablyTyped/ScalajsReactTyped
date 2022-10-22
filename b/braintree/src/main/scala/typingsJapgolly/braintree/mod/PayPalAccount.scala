package typingsJapgolly.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "PayPalAccount")
@js.native
open class PayPalAccount ()
  extends StObject
     with PaymentMethod {
  
  var default: Boolean = js.native
  
  var billingAgreementId: String = js.native
  
  var createdAt: String = js.native
  
  var customerId: String = js.native
  
  var email: String = js.native
  
  var imageUrl: String = js.native
  
  var payerId: String = js.native
  
  var revokedAt: String = js.native
  
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
  
  var token: String = js.native
  
  var updatedAt: String = js.native
}
