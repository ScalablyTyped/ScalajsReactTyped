package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGmail.AnonAlt
import typingsJapgolly.gapiClientGmail.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAsResource extends js.Object {
  var smimeInfo: SmimeInfoResource
  /**
    * Creates a custom "from" send-as alias. If an SMTP MSA is specified, Gmail will attempt to connect to the SMTP service to validate the configuration
    * before creating the alias. If ownership verification is required for the alias, a message will be sent to the email address and the resource's
    * verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted. If a signature is
    * provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def create(request: AnonAlt): Request_[SendAs]
  /**
    * Deletes the specified send-as alias. Revokes any verification that may have been required for using it.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def delete(request: AnonPrettyPrint): Request_[Unit]
  /** Gets the specified send-as alias. Fails with an HTTP 404 error if the specified address is not a member of the collection. */
  def get(request: AnonPrettyPrint): Request_[SendAs]
  /**
    * Lists the send-as aliases for the specified account. The result includes the primary send-as address associated with the account as well as any custom
    * "from" aliases.
    */
  def list(request: AnonAlt): Request_[ListSendAsResponse]
  /**
    * Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
    * This method supports patch semantics.
    */
  def patch(request: AnonPrettyPrint): Request_[SendAs]
  /**
    * Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
    */
  def update(request: AnonPrettyPrint): Request_[SendAs]
  /**
    * Sends a verification email to the specified send-as alias address. The verification status must be pending.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def verify(request: AnonPrettyPrint): Request_[Unit]
}

object SendAsResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[SendAs]],
    delete: AnonPrettyPrint => CallbackTo[Request_[Unit]],
    get: AnonPrettyPrint => CallbackTo[Request_[SendAs]],
    list: AnonAlt => CallbackTo[Request_[ListSendAsResponse]],
    patch: AnonPrettyPrint => CallbackTo[Request_[SendAs]],
    smimeInfo: SmimeInfoResource,
    update: AnonPrettyPrint => CallbackTo[Request_[SendAs]],
    verify: AnonPrettyPrint => CallbackTo[Request_[Unit]]
  ): SendAsResource = {
    val __obj = js.Dynamic.literal(smimeInfo = smimeInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonPrettyPrint) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonPrettyPrint) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonPrettyPrint) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonPrettyPrint) => update(t0).runNow()))
    __obj.updateDynamic("verify")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonPrettyPrint) => verify(t0).runNow()))
    __obj.asInstanceOf[SendAsResource]
  }
}

