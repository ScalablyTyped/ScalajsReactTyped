package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonReviewId
import typingsJapgolly.gapiClientAndroidpublisher.AnonToken
import typingsJapgolly.gapiClientAndroidpublisher.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsResource extends js.Object {
  /** Returns a single review. */
  def get(request: AnonReviewId): Request_[Review]
  /** Returns a list of reviews. Only reviews from last week will be returned. */
  def list(request: AnonToken): Request_[ReviewsListResponse]
  /** Reply to a single review, or update an existing reply. */
  def reply(request: AnonUserIp): Request_[ReviewsReplyResponse]
}

object ReviewsResource {
  @scala.inline
  def apply(
    get: AnonReviewId => CallbackTo[Request_[Review]],
    list: AnonToken => CallbackTo[Request_[ReviewsListResponse]],
    reply: AnonUserIp => CallbackTo[Request_[ReviewsReplyResponse]]
  ): ReviewsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonReviewId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonToken) => list(t0).runNow()))
    __obj.updateDynamic("reply")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonUserIp) => reply(t0).runNow()))
    __obj.asInstanceOf[ReviewsResource]
  }
}

