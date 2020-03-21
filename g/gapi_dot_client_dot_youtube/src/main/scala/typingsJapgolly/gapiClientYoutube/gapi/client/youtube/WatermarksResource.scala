package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonChannelIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatermarksResource extends js.Object {
  /** Uploads a watermark image to YouTube and sets it for a channel. */
  def set(request: AnonChannelIdFields): Request_[Unit]
  /** Deletes a channel's watermark image. */
  def unset(request: AnonChannelIdFields): Request_[Unit]
}

object WatermarksResource {
  @scala.inline
  def apply(
    set: AnonChannelIdFields => CallbackTo[Request_[Unit]],
    unset: AnonChannelIdFields => CallbackTo[Request_[Unit]]
  ): WatermarksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonChannelIdFields) => set(t0).runNow()))
    __obj.updateDynamic("unset")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonChannelIdFields) => unset(t0).runNow()))
    __obj.asInstanceOf[WatermarksResource]
  }
}

