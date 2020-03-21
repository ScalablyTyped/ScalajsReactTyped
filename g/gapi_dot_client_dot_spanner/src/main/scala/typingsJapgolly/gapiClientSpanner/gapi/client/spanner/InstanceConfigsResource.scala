package typingsJapgolly.gapiClientSpanner.gapi.client.spanner

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSpanner.AnonAccesstoken
import typingsJapgolly.gapiClientSpanner.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceConfigsResource extends js.Object {
  /** Gets information about a particular instance configuration. */
  def get(request: AnonAccesstoken): Request_[InstanceConfig]
  /** Lists the supported instance configurations for a given project. */
  def list(request: AnonAlt): Request_[ListInstanceConfigsResponse]
}

object InstanceConfigsResource {
  @scala.inline
  def apply(
    get: AnonAccesstoken => CallbackTo[Request_[InstanceConfig]],
    list: AnonAlt => CallbackTo[Request_[ListInstanceConfigsResponse]]
  ): InstanceConfigsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpanner.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpanner.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[InstanceConfigsResource]
  }
}

