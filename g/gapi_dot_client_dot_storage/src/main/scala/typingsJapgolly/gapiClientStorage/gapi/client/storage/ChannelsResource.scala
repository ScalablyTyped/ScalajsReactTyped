package typingsJapgolly.gapiClientStorage.gapi.client.storage

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientStorage.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Stop watching resources through this channel */
  def stop(request: AnonPrettyPrint): Request_[Unit]
}

object ChannelsResource {
  @scala.inline
  def apply(stop: AnonPrettyPrint => CallbackTo[Request_[Unit]]): ChannelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonPrettyPrint) => stop(t0).runNow()))
    __obj.asInstanceOf[ChannelsResource]
  }
}

