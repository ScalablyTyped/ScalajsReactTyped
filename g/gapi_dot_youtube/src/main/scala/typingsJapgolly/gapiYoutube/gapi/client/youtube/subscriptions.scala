package typingsJapgolly.gapiYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiYoutube.AnonForChannelId
import typingsJapgolly.gapiYoutube.AnonId
import typingsJapgolly.gapiYoutube.AnonPartRequestBody
import typingsJapgolly.gapiYoutube.GoogleApiYouTubePaginationInfo
import typingsJapgolly.gapiYoutube.GoogleApiYouTubeSubscriptionResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscriptions extends js.Object {
  /**
    * Deletes a subscription.
    */
  def delete(`object`: AnonId): HttpRequest[GoogleApiYouTubeSubscriptionResource]
  /**
    * Adds a subscription for the authenticated user's channel.
    */
  def insert(`object`: AnonPartRequestBody): HttpRequest[GoogleApiYouTubeSubscriptionResource]
  /**
    * Returns subscription resources that match the API request criteria.
    */
  def list(`object`: AnonForChannelId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]]
}

object subscriptions {
  @scala.inline
  def apply(
    delete: AnonId => CallbackTo[HttpRequest[GoogleApiYouTubeSubscriptionResource]],
    insert: AnonPartRequestBody => CallbackTo[HttpRequest[GoogleApiYouTubeSubscriptionResource]],
    list: AnonForChannelId => CallbackTo[
      HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]]
    ]
  ): subscriptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonId) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonPartRequestBody) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonForChannelId) => list(t0).runNow()))
    __obj.asInstanceOf[subscriptions]
  }
}

