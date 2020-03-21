package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGmail.AnonAlt
import typingsJapgolly.gapiClientGmail.AnonDeleted
import typingsJapgolly.gapiClientGmail.AnonFields
import typingsJapgolly.gapiClientGmail.AnonInternalDateSource
import typingsJapgolly.gapiClientGmail.AnonKey
import typingsJapgolly.gapiClientGmail.AnonLabelIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagesResource extends js.Object {
  var attachments: AttachmentsResource
  /** Deletes many messages by message ID. Provides no guarantees that messages were not already deleted or even existed at all. */
  def batchDelete(request: AnonAlt): Request_[Unit]
  /** Modifies the labels on the specified messages. */
  def batchModify(request: AnonAlt): Request_[Unit]
  /** Immediately and permanently deletes the specified message. This operation cannot be undone. Prefer messages.trash instead. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets the specified message. */
  def get(request: AnonKey): Request_[Message]
  /**
    * Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. Does not send
    * a message.
    */
  def `import`(request: AnonDeleted): Request_[Message]
  /** Directly inserts a message into only this user's mailbox similar to IMAP APPEND, bypassing most scanning and classification. Does not send a message. */
  def insert(request: AnonInternalDateSource): Request_[Message]
  /** Lists the messages in the user's mailbox. */
  def list(request: AnonLabelIds): Request_[ListMessagesResponse]
  /** Modifies the labels on the specified message. */
  def modify(request: AnonFields): Request_[Message]
  /** Sends the specified message to the recipients in the To, Cc, and Bcc headers. */
  def send(request: AnonAlt): Request_[Message]
  /** Moves the specified message to the trash. */
  def trash(request: AnonFields): Request_[Message]
  /** Removes the specified message from the trash. */
  def untrash(request: AnonFields): Request_[Message]
}

object MessagesResource {
  @scala.inline
  def apply(
    attachments: AttachmentsResource,
    batchDelete: AnonAlt => CallbackTo[Request_[Unit]],
    batchModify: AnonAlt => CallbackTo[Request_[Unit]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonKey => CallbackTo[Request_[Message]],
    `import`: AnonDeleted => CallbackTo[Request_[Message]],
    insert: AnonInternalDateSource => CallbackTo[Request_[Message]],
    list: AnonLabelIds => CallbackTo[Request_[ListMessagesResponse]],
    modify: AnonFields => CallbackTo[Request_[Message]],
    send: AnonAlt => CallbackTo[Request_[Message]],
    trash: AnonFields => CallbackTo[Request_[Message]],
    untrash: AnonFields => CallbackTo[Request_[Message]]
  ): MessagesResource = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any])
    __obj.updateDynamic("batchDelete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => batchDelete(t0).runNow()))
    __obj.updateDynamic("batchModify")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => batchModify(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("import")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonDeleted) => `import`(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonInternalDateSource) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonLabelIds) => list(t0).runNow()))
    __obj.updateDynamic("modify")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => modify(t0).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => send(t0).runNow()))
    __obj.updateDynamic("trash")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => trash(t0).runNow()))
    __obj.updateDynamic("untrash")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => untrash(t0).runNow()))
    __obj.asInstanceOf[MessagesResource]
  }
}

