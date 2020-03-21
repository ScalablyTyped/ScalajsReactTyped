package typingsJapgolly.gapiClientAdsensehost.gapi.client.adsensehost

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdsensehost.AnonOauthtoken
import typingsJapgolly.gapiClientAdsensehost.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationsessionsResource extends js.Object {
  /** Create an association session for initiating an association with an AdSense user. */
  def start(request: AnonOauthtoken): Request_[AssociationSession]
  /** Verify an association session after the association callback returns from AdSense signup. */
  def verify(request: AnonPrettyPrint): Request_[AssociationSession]
}

object AssociationsessionsResource {
  @scala.inline
  def apply(
    start: AnonOauthtoken => CallbackTo[Request_[AssociationSession]],
    verify: AnonPrettyPrint => CallbackTo[Request_[AssociationSession]]
  ): AssociationsessionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("start")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonOauthtoken) => start(t0).runNow()))
    __obj.updateDynamic("verify")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdsensehost.AnonPrettyPrint) => verify(t0).runNow()))
    __obj.asInstanceOf[AssociationsessionsResource]
  }
}

