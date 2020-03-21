package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGmail.AnonAlt
import typingsJapgolly.gapiClientGmail.AnonFields
import typingsJapgolly.gapiClientGmail.AnonFormat
import typingsJapgolly.gapiClientGmail.AnonIncludeSpamTrash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftsResource extends js.Object {
  /** Creates a new draft with the DRAFT label. */
  def create(request: AnonAlt): Request_[Draft]
  /** Immediately and permanently deletes the specified draft. Does not simply trash it. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets the specified draft. */
  def get(request: AnonFormat): Request_[Draft]
  /** Lists the drafts in the user's mailbox. */
  def list(request: AnonIncludeSpamTrash): Request_[ListDraftsResponse]
  /** Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers. */
  def send(request: AnonAlt): Request_[Message]
  /** Replaces a draft's content. */
  def update(request: AnonFields): Request_[Draft]
}

object DraftsResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[Draft]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFormat => CallbackTo[Request_[Draft]],
    list: AnonIncludeSpamTrash => CallbackTo[Request_[ListDraftsResponse]],
    send: AnonAlt => CallbackTo[Request_[Message]],
    update: AnonFields => CallbackTo[Request_[Draft]]
  ): DraftsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFormat) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonIncludeSpamTrash) => list(t0).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => send(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => update(t0).runNow()))
    __obj.asInstanceOf[DraftsResource]
  }
}

