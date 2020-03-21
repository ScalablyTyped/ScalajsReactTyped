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

trait EnvironmentsResource extends js.Object {
  /** Creates a GTM Environment. */
  def create(request: AnonAlt): Request_[Environment]
  /** Deletes a GTM Environment. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a GTM Environment. */
  def get(request: AnonFields): Request_[Environment]
  /** Lists all GTM Environments of a GTM Container. */
  def list(request: AnonKey): Request_[ListEnvironmentsResponse]
  /** Updates a GTM Environment. This method supports patch semantics. */
  def patch(request: AnonFingerprint): Request_[Environment]
  /** Re-generates the authorization code for a GTM Environment. */
  def reauthorize(request: AnonFields): Request_[Environment]
  /** Updates a GTM Environment. */
  def update(request: AnonFingerprint): Request_[Environment]
}

object EnvironmentsResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[Environment]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[Environment]],
    list: AnonKey => CallbackTo[Request_[ListEnvironmentsResponse]],
    patch: AnonFingerprint => CallbackTo[Request_[Environment]],
    reauthorize: AnonFields => CallbackTo[Request_[Environment]],
    update: AnonFingerprint => CallbackTo[Request_[Environment]]
  ): EnvironmentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => patch(t0).runNow()))
    __obj.updateDynamic("reauthorize")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => reauthorize(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => update(t0).runNow()))
    __obj.asInstanceOf[EnvironmentsResource]
  }
}

