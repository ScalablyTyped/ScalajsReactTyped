package typingsJapgolly.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.outbound_request
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.inbound_request
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.outbound_offer
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.inbound_offer
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.accepted
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.rejected
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.issued
  - typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.stored
*/
trait CredentialState extends js.Object

object CredentialState {
  @scala.inline
  def accepted: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inbound_offer: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.inbound_offer = this.cast("inbound_offer")
  @scala.inline
  def inbound_request: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.inbound_request = this.cast("inbound_request")
  @scala.inline
  def issued: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.issued = this.cast("issued")
  @scala.inline
  def outbound_offer: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.outbound_offer = this.cast("outbound_offer")
  @scala.inline
  def outbound_request: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.outbound_request = this.cast("outbound_request")
  @scala.inline
  def rejected: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.rejected = this.cast("rejected")
  @scala.inline
  def stored: typingsJapgolly.openssiWebsdk.openssiWebsdkStrings.stored = this.cast("stored")
}

