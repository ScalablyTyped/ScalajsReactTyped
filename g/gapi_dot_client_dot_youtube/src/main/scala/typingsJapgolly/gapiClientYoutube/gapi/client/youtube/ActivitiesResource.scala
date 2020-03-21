package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonAlt
import typingsJapgolly.gapiClientYoutube.AnonChannelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /**
    * Posts a bulletin for a specific channel. (The user submitting the request must be authorized to act on the channel's behalf.)
    *
    * Note: Even though an activity resource can contain information about actions like a user rating a video or marking a video as a favorite, you need to
    * use other API methods to generate those activity resources. For example, you would use the API's videos.rate() method to rate a video and the
    * playlistItems.insert() method to mark a video as a favorite.
    */
  def insert(request: AnonAlt): Request_[Activity]
  /**
    * Returns a list of channel activity events that match the request criteria. For example, you can retrieve events associated with a particular channel,
    * events associated with the user's subscriptions and Google+ friends, or the YouTube home page feed, which is customized for each user.
    */
  def list(request: AnonChannelId): Request_[ActivityListResponse]
}

object ActivitiesResource {
  @scala.inline
  def apply(
    insert: AnonAlt => CallbackTo[Request_[Activity]],
    list: AnonChannelId => CallbackTo[Request_[ActivityListResponse]]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAlt) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonChannelId) => list(t0).runNow()))
    __obj.asInstanceOf[ActivitiesResource]
  }
}

