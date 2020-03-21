package typingsJapgolly.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBigquerydatatransfer.AnonAccesstoken
import typingsJapgolly.gapiClientBigquerydatatransfer.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunsResource extends js.Object {
  var transferLogs: TransferLogsResource
  /** Deletes the specified transfer run. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Returns information about the particular transfer run. */
  def get(request: AnonAccesstoken): Request_[TransferRun]
  /** Returns information about running and completed jobs. */
  def list(request: AnonCallback): Request_[ListTransferRunsResponse]
}

object RunsResource {
  @scala.inline
  def apply(
    delete: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    get: AnonAccesstoken => CallbackTo[Request_[TransferRun]],
    list: AnonCallback => CallbackTo[Request_[ListTransferRunsResponse]],
    transferLogs: TransferLogsResource
  ): RunsResource = {
    val __obj = js.Dynamic.literal(transferLogs = transferLogs.asInstanceOf[js.Any])
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonAccesstoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonCallback) => list(t0).runNow()))
    __obj.asInstanceOf[RunsResource]
  }
}

