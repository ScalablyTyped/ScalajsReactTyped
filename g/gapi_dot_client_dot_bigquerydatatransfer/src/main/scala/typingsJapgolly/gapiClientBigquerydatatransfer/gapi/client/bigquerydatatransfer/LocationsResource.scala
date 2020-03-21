package typingsJapgolly.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBigquerydatatransfer.AnonAccesstoken
import typingsJapgolly.gapiClientBigquerydatatransfer.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var dataSources: DataSourcesResource
  var transferConfigs: TransferConfigsResource
  /** Get information about a location. */
  def get(request: AnonAccesstoken): Request_[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: AnonFilter): Request_[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    dataSources: DataSourcesResource,
    get: AnonAccesstoken => CallbackTo[Request_[Location]],
    list: AnonFilter => CallbackTo[Request_[ListLocationsResponse]],
    transferConfigs: TransferConfigsResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(dataSources = dataSources.asInstanceOf[js.Any], transferConfigs = transferConfigs.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[LocationsResource]
  }
}

