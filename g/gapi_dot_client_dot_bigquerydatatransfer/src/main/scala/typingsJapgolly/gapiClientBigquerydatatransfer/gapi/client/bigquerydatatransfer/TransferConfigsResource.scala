package typingsJapgolly.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBigquerydatatransfer.AnonAccesstoken
import typingsJapgolly.gapiClientBigquerydatatransfer.AnonAuthorizationCode
import typingsJapgolly.gapiClientBigquerydatatransfer.AnonDataSourceIds
import typingsJapgolly.gapiClientBigquerydatatransfer.AnonFields
import typingsJapgolly.gapiClientBigquerydatatransfer.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferConfigsResource extends js.Object {
  var runs: RunsResource
  /** Creates a new data transfer configuration. */
  def create(request: AnonAuthorizationCode): Request_[TransferConfig]
  /**
    * Deletes a data transfer configuration,
    * including any associated transfer runs and logs.
    */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Returns information about a data transfer config. */
  def get(request: AnonAccesstoken): Request_[TransferConfig]
  /** Returns information about all data transfers in the project. */
  def list(request: AnonDataSourceIds): Request_[ListTransferConfigsResponse]
  /**
    * Updates a data transfer configuration.
    * All fields must be set, even if they are not updated.
    */
  def patch(request: AnonFields): Request_[TransferConfig]
  /**
    * Creates transfer runs for a time range [range_start_time, range_end_time].
    * For each date - or whatever granularity the data source supports - in the
    * range, one transfer run is created.
    * Note that runs are created per UTC time in the time range.
    */
  def scheduleRuns(request: AnonKey): Request_[ScheduleTransferRunsResponse]
}

object TransferConfigsResource {
  @scala.inline
  def apply(
    create: AnonAuthorizationCode => CallbackTo[Request_[TransferConfig]],
    delete: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    get: AnonAccesstoken => CallbackTo[Request_[TransferConfig]],
    list: AnonDataSourceIds => CallbackTo[Request_[ListTransferConfigsResponse]],
    patch: AnonFields => CallbackTo[Request_[TransferConfig]],
    runs: RunsResource,
    scheduleRuns: AnonKey => CallbackTo[Request_[ScheduleTransferRunsResponse]]
  ): TransferConfigsResource = {
    val __obj = js.Dynamic.literal(runs = runs.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonAuthorizationCode) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonAccesstoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonDataSourceIds) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("scheduleRuns")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonKey) => scheduleRuns(t0).runNow()))
    __obj.asInstanceOf[TransferConfigsResource]
  }
}

