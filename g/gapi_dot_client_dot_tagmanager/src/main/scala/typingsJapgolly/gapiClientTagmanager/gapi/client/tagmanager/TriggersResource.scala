package typingsJapgolly.gapiClientTagmanager.gapi.client.tagmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTagmanager.AnonAlt
import typingsJapgolly.gapiClientTagmanager.AnonFields
import typingsJapgolly.gapiClientTagmanager.AnonFingerprint
import typingsJapgolly.gapiClientTagmanager.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggersResource extends js.Object {
  /** Creates a GTM Trigger. */
  def create(request: AnonAlt): Request_[Trigger]
  /** Deletes a GTM Trigger. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a GTM Trigger. */
  def get(request: AnonFields): Request_[Trigger]
  /** Lists all GTM Triggers of a Container. */
  def list(request: AnonKey): Request_[ListTriggersResponse]
  /** Reverts changes to a GTM Trigger in a GTM Workspace. */
  def revert(request: AnonFingerprint): Request_[RevertTriggerResponse]
  /** Updates a GTM Trigger. */
  def update(request: AnonFingerprint): Request_[Trigger]
}

object TriggersResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[Trigger]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[Trigger]],
    list: AnonKey => CallbackTo[Request_[ListTriggersResponse]],
    revert: AnonFingerprint => CallbackTo[Request_[RevertTriggerResponse]],
    update: AnonFingerprint => CallbackTo[Request_[Trigger]]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("revert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => revert(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => update(t0).runNow()))
    __obj.asInstanceOf[TriggersResource]
  }
}

