package typingsJapgolly.gapiClientStoragetransfer.gapi.client.storagetransfer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientStoragetransfer.AnonAlt
import typingsJapgolly.gapiClientStoragetransfer.AnonBearertoken
import typingsJapgolly.gapiClientStoragetransfer.AnonCallback
import typingsJapgolly.gapiClientStoragetransfer.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferJobsResource extends js.Object {
  /** Creates a transfer job that runs periodically. */
  def create(request: AnonAlt): Request_[TransferJob]
  /** Gets a transfer job. */
  def get(request: AnonBearertoken): Request_[TransferJob]
  /** Lists transfer jobs. */
  def list(request: AnonCallback): Request_[ListTransferJobsResponse]
  /**
    * Updates a transfer job. Updating a job's transfer spec does not affect
    * transfer operations that are running already. Updating the scheduling
    * of a job is not allowed.
    */
  def patch(request: AnonFields): Request_[TransferJob]
}

object TransferJobsResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[TransferJob]],
    get: AnonBearertoken => CallbackTo[Request_[TransferJob]],
    list: AnonCallback => CallbackTo[Request_[ListTransferJobsResponse]],
    patch: AnonFields => CallbackTo[Request_[TransferJob]]
  ): TransferJobsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStoragetransfer.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStoragetransfer.AnonBearertoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStoragetransfer.AnonCallback) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStoragetransfer.AnonFields) => patch(t0).runNow()))
    __obj.asInstanceOf[TransferJobsResource]
  }
}

