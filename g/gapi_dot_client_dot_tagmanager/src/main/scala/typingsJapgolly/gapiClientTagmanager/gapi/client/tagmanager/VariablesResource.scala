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

trait VariablesResource extends js.Object {
  /** Creates a GTM Variable. */
  def create(request: AnonAlt): Request_[Variable]
  /** Deletes a GTM Variable. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a GTM Variable. */
  def get(request: AnonFields): Request_[Variable]
  /** Lists all GTM Variables of a Container. */
  def list(request: AnonKey): Request_[ListVariablesResponse]
  /** Reverts changes to a GTM Variable in a GTM Workspace. */
  def revert(request: AnonFingerprint): Request_[RevertVariableResponse]
  /** Updates a GTM Variable. */
  def update(request: AnonFingerprint): Request_[Variable]
}

object VariablesResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[Variable]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[Variable]],
    list: AnonKey => CallbackTo[Request_[ListVariablesResponse]],
    revert: AnonFingerprint => CallbackTo[Request_[RevertVariableResponse]],
    update: AnonFingerprint => CallbackTo[Request_[Variable]]
  ): VariablesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("revert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => revert(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => update(t0).runNow()))
    __obj.asInstanceOf[VariablesResource]
  }
}

