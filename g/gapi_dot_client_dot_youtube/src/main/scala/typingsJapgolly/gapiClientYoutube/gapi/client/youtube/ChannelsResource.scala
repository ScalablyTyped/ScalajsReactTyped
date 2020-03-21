package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonCategoryId
import typingsJapgolly.gapiClientYoutube.AnonPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Returns a collection of zero or more channel resources that match the request criteria. */
  def list(request: AnonCategoryId): Request_[ChannelListResponse]
  /**
    * Updates a channel's metadata. Note that this method currently only supports updates to the channel resource's brandingSettings and invideoPromotion
    * objects and their child properties.
    */
  def update(request: AnonPart): Request_[Channel]
}

object ChannelsResource {
  @scala.inline
  def apply(
    list: AnonCategoryId => CallbackTo[Request_[ChannelListResponse]],
    update: AnonPart => CallbackTo[Request_[Channel]]
  ): ChannelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonCategoryId) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPart) => update(t0).runNow()))
    __obj.asInstanceOf[ChannelsResource]
  }
}

