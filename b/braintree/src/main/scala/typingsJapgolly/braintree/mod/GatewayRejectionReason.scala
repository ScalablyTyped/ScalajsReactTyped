package typingsJapgolly.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.braintreeStrings.application_incomplete
  - typingsJapgolly.braintree.braintreeStrings.avs
  - typingsJapgolly.braintree.braintreeStrings.avs_and_cvv
  - typingsJapgolly.braintree.braintreeStrings.cvv
  - typingsJapgolly.braintree.braintreeStrings.duplicate
  - typingsJapgolly.braintree.braintreeStrings.fraud
  - typingsJapgolly.braintree.braintreeStrings.risk_threshold
  - typingsJapgolly.braintree.braintreeStrings.three_d_secure
  - typingsJapgolly.braintree.braintreeStrings.token_issuance
*/
trait GatewayRejectionReason extends js.Object

object GatewayRejectionReason {
  @scala.inline
  def application_incomplete: typingsJapgolly.braintree.braintreeStrings.application_incomplete = this.cast("application_incomplete")
  @scala.inline
  def avs: typingsJapgolly.braintree.braintreeStrings.avs = this.cast("avs")
  @scala.inline
  def avs_and_cvv: typingsJapgolly.braintree.braintreeStrings.avs_and_cvv = this.cast("avs_and_cvv")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cvv: typingsJapgolly.braintree.braintreeStrings.cvv = this.cast("cvv")
  @scala.inline
  def duplicate: typingsJapgolly.braintree.braintreeStrings.duplicate = this.cast("duplicate")
  @scala.inline
  def fraud: typingsJapgolly.braintree.braintreeStrings.fraud = this.cast("fraud")
  @scala.inline
  def risk_threshold: typingsJapgolly.braintree.braintreeStrings.risk_threshold = this.cast("risk_threshold")
  @scala.inline
  def three_d_secure: typingsJapgolly.braintree.braintreeStrings.three_d_secure = this.cast("three_d_secure")
  @scala.inline
  def token_issuance: typingsJapgolly.braintree.braintreeStrings.token_issuance = this.cast("token_issuance")
}

