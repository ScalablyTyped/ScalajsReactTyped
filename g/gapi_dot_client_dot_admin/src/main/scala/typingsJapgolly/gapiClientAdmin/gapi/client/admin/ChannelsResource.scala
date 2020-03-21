package typingsJapgolly.gapiClientAdmin.gapi.client.admin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdmin.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Stop watching resources through this channel */
  def stop(request: AnonAlt): Request_[Unit]
}

object ChannelsResource {
  @scala.inline
  def apply(stop: AnonAlt => CallbackTo[Request_[Unit]]): ChannelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdmin.AnonAlt) => stop(t0).runNow()))
    __obj.asInstanceOf[ChannelsResource]
  }
}

