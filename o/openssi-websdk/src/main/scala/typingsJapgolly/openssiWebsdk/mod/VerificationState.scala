package typingsJapgolly.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.outbound_verification_request
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.inbound_verification_request
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.outbound_proof_request
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.inbound_proof_request
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.proof_generated
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.proof_shared
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.passed
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.failed
*/
trait VerificationState extends js.Object

object VerificationState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.failed = this.cast("failed")
  @scala.inline
  def inbound_proof_request: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.inbound_proof_request = this.cast("inbound_proof_request")
  @scala.inline
  def inbound_verification_request: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.inbound_verification_request = this.cast("inbound_verification_request")
  @scala.inline
  def outbound_proof_request: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.outbound_proof_request = this.cast("outbound_proof_request")
  @scala.inline
  def outbound_verification_request: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.outbound_verification_request = this.cast("outbound_verification_request")
  @scala.inline
  def passed: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.passed = this.cast("passed")
  @scala.inline
  def proof_generated: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.proof_generated = this.cast("proof_generated")
  @scala.inline
  def proof_shared: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.proof_shared = this.cast("proof_shared")
}

