package typingsJapgolly.braintree.mod

import typingsJapgolly.braintree.anon.AbstractTransactable
import typingsJapgolly.braintree.anon.AccountNotAuthorizedContactUs
import typingsJapgolly.braintree.anon.AmexPayWithPoints
import typingsJapgolly.braintree.anon.Authorize
import typingsJapgolly.braintree.anon.CountryOfIssuance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "Test")
@js.native
open class Test () extends StObject {
  
  var CreditCardDefaults: CountryOfIssuance = js.native
  
  var CreditCardNumbers: AmexPayWithPoints = js.native
  
  var MerchantAccountTest: AccountNotAuthorizedContactUs = js.native
  
  var Nonces: AbstractTransactable = js.native
  
  var TransactionAmounts: Authorize = js.native
}
