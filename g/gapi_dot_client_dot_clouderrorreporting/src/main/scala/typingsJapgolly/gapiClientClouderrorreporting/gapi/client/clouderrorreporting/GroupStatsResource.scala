package typingsJapgolly.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientClouderrorreporting.AnonAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupStatsResource extends js.Object {
  /** Lists the specified groups. */
  def list(request: AnonAlignment): Request_[ListGroupStatsResponse]
}

object GroupStatsResource {
  @scala.inline
  def apply(list: AnonAlignment => CallbackTo[Request_[ListGroupStatsResponse]]): GroupStatsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouderrorreporting.AnonAlignment) => list(t0).runNow()))
    __obj.asInstanceOf[GroupStatsResource]
  }
}

