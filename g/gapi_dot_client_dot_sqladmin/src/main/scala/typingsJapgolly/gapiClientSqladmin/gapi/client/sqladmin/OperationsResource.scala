package typingsJapgolly.gapiClientSqladmin.gapi.client.sqladmin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSqladmin.AnonInstance
import typingsJapgolly.gapiClientSqladmin.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Retrieves an instance operation that has been performed on an instance. */
  def get(request: AnonOauthtoken): Request_[Operation]
  /** Lists all instance operations that have been performed on the given Cloud SQL instance in the reverse chronological order of the start time. */
  def list(request: AnonInstance): Request_[OperationsListResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => CallbackTo[Request_[Operation]],
    list: AnonInstance => CallbackTo[Request_[OperationsListResponse]]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonOauthtoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonInstance) => list(t0).runNow()))
    __obj.asInstanceOf[OperationsResource]
  }
}

