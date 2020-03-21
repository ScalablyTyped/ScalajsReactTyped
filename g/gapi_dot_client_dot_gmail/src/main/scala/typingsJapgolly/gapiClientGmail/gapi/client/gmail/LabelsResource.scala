package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGmail.AnonAlt
import typingsJapgolly.gapiClientGmail.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsResource extends js.Object {
  /** Creates a new label. */
  def create(request: AnonAlt): Request_[Label]
  /** Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets the specified label. */
  def get(request: AnonFields): Request_[Label]
  /** Lists all labels in the user's mailbox. */
  def list(request: AnonAlt): Request_[ListLabelsResponse]
  /** Updates the specified label. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Label]
  /** Updates the specified label. */
  def update(request: AnonFields): Request_[Label]
}

object LabelsResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[Label]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[Label]],
    list: AnonAlt => CallbackTo[Request_[ListLabelsResponse]],
    patch: AnonFields => CallbackTo[Request_[Label]],
    update: AnonFields => CallbackTo[Request_[Label]]
  ): LabelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonFields) => update(t0).runNow()))
    __obj.asInstanceOf[LabelsResource]
  }
}

