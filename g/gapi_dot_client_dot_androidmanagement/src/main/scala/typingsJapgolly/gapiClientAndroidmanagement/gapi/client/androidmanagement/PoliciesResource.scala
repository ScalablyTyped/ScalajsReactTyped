package typingsJapgolly.gapiClientAndroidmanagement.gapi.client.androidmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidmanagement.AnonAlt
import typingsJapgolly.gapiClientAndroidmanagement.AnonCallback
import typingsJapgolly.gapiClientAndroidmanagement.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoliciesResource extends js.Object {
  /** Deletes a policy. This operation is only permitted if no devices are currently referencing the policy. */
  def delete(request: AnonAlt): Request_[js.Object]
  /** Gets a policy. */
  def get(request: AnonAlt): Request_[Policy]
  /** Lists policies for a given enterprise. */
  def list(request: AnonCallback): Request_[ListPoliciesResponse]
  /** Updates or creates a policy. */
  def patch(request: AnonFields): Request_[Policy]
}

object PoliciesResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[js.Object]],
    get: AnonAlt => CallbackTo[Request_[Policy]],
    list: AnonCallback => CallbackTo[Request_[ListPoliciesResponse]],
    patch: AnonFields => CallbackTo[Request_[Policy]]
  ): PoliciesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonCallback) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonFields) => patch(t0).runNow()))
    __obj.asInstanceOf[PoliciesResource]
  }
}

