package typingsJapgolly.braintree.mod

import typingsJapgolly.braintree.AnonAbstractTransactable
import typingsJapgolly.braintree.AnonAccountNotAuthorizedContactUs
import typingsJapgolly.braintree.AnonAmexPayWithPoints
import typingsJapgolly.braintree.AnonAuthorize
import typingsJapgolly.braintree.AnonIssuingBank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "Test")
@js.native
class Test () extends js.Object {
  var CreditCardDefaults: AnonIssuingBank = js.native
  var CreditCardNumbers: AnonAmexPayWithPoints = js.native
  var MerchantAccountTest: AnonAccountNotAuthorizedContactUs = js.native
  var Nonces: AnonAbstractTransactable = js.native
  var TransactionAmounts: AnonAuthorize = js.native
}

