package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGmail.AnonFields
import typingsJapgolly.gapiClientGmail.AnonKey
import typingsJapgolly.gapiClientGmail.AnonLabelIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadsResource extends js.Object {
  /** Immediately and permanently deletes the specified thread. This operation cannot be undone. Prefer threads.trash instead. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets the specified thread. */
  def get(request: AnonKey): Request_[Thread]
  /** Lists the threads in the user's mailbox. */
  def list(request: AnonLabelIds): Request_[ListThreadsResponse]
  /** Modifies the labels applied to the thread. This applies to all messages in the thread. */
  def modify(request: AnonFields): Request_[Thread]
  /** Moves the specified thread to the trash. */
  def trash(request: AnonFields): Request_[Thread]
  /** Removes the specified thread from the trash. */
  def untrash(request: AnonFields): Request_[Thread]
}

object ThreadsResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonKey => CallbackTo[Request_[Thread]],
    list: AnonLabelIds => CallbackTo[Request_[ListThreadsResponse]],
    modify: AnonFields => CallbackTo[Request_[Thread]],
    trash: AnonFields => CallbackTo[Request_[Thread]],
    untrash: AnonFields => CallbackTo[Request_[Thread]]
  ): ThreadsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonLabelIds) => list(t0).runNow()))
    __obj.updateDynamic("modify")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => modify(t0).runNow()))
    __obj.updateDynamic("trash")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => trash(t0).runNow()))
    __obj.updateDynamic("untrash")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => untrash(t0).runNow()))
    __obj.asInstanceOf[ThreadsResource]
  }
}

