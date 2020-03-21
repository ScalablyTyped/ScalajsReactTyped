package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonRegionUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionsResource extends js.Object {
  /** Returns the specified Region resource. Get a list of available regions by making a list() request. */
  def get(request: AnonRegionUserIp): Request_[Region]
  /** Retrieves the list of region resources available to the specified project. */
  def list(request: AnonAlt): Request_[RegionList]
}

object RegionsResource {
  @scala.inline
  def apply(
    get: AnonRegionUserIp => CallbackTo[Request_[Region]],
    list: AnonAlt => CallbackTo[Request_[RegionList]]
  ): RegionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRegionUserIp) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[RegionsResource]
  }
}

