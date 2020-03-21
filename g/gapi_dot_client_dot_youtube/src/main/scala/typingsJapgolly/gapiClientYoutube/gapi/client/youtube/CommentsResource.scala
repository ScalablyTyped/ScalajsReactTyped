package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonAlt
import typingsJapgolly.gapiClientYoutube.AnonBanAuthor
import typingsJapgolly.gapiClientYoutube.AnonMaxResults
import typingsJapgolly.gapiClientYoutube.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Deletes a comment. */
  def delete(request: AnonQuotaUser): Request_[Unit]
  /** Creates a reply to an existing comment. Note: To create a top-level comment, use the commentThreads.insert method. */
  def insert(request: AnonAlt): Request_[Comment]
  /** Returns a list of comments that match the API request parameters. */
  def list(request: AnonMaxResults): Request_[CommentListResponse]
  /** Expresses the caller's opinion that one or more comments should be flagged as spam. */
  def markAsSpam(request: AnonQuotaUser): Request_[Unit]
  /**
    * Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the
    * comments.
    */
  def setModerationStatus(request: AnonBanAuthor): Request_[Unit]
  /** Modifies a comment. */
  def update(request: AnonAlt): Request_[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => CallbackTo[Request_[Unit]],
    insert: AnonAlt => CallbackTo[Request_[Comment]],
    list: AnonMaxResults => CallbackTo[Request_[CommentListResponse]],
    markAsSpam: AnonQuotaUser => CallbackTo[Request_[Unit]],
    setModerationStatus: AnonBanAuthor => CallbackTo[Request_[Unit]],
    update: AnonAlt => CallbackTo[Request_[Comment]]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonQuotaUser) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAlt) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonMaxResults) => list(t0).runNow()))
    __obj.updateDynamic("markAsSpam")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonQuotaUser) => markAsSpam(t0).runNow()))
    __obj.updateDynamic("setModerationStatus")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonBanAuthor) => setModerationStatus(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[CommentsResource]
  }
}

