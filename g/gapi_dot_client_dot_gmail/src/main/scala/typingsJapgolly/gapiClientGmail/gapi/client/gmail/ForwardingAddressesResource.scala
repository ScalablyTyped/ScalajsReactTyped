package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGmail.AnonAlt
import typingsJapgolly.gapiClientGmail.AnonForwardingEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardingAddressesResource extends js.Object {
  /**
    * Creates a forwarding address. If ownership verification is required, a message will be sent to the recipient and the resource's verification status
    * will be set to pending; otherwise, the resource will be created with verification status set to accepted.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def create(request: AnonAlt): Request_[ForwardingAddress]
  /**
    * Deletes the specified forwarding address and revokes any verification that may have been required.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def delete(request: AnonForwardingEmail): Request_[Unit]
  /** Gets the specified forwarding address. */
  def get(request: AnonForwardingEmail): Request_[ForwardingAddress]
  /** Lists the forwarding addresses for the specified account. */
  def list(request: AnonAlt): Request_[ListForwardingAddressesResponse]
}

object ForwardingAddressesResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[ForwardingAddress]],
    delete: AnonForwardingEmail => CallbackTo[Request_[Unit]],
    get: AnonForwardingEmail => CallbackTo[Request_[ForwardingAddress]],
    list: AnonAlt => CallbackTo[Request_[ListForwardingAddressesResponse]]
  ): ForwardingAddressesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonForwardingEmail) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonForwardingEmail) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[ForwardingAddressesResource]
  }
}

