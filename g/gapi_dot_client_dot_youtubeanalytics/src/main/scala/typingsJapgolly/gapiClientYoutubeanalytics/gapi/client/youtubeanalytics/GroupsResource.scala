package typingsJapgolly.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutubeanalytics.AnonAlt
import typingsJapgolly.gapiClientYoutubeanalytics.AnonFields
import typingsJapgolly.gapiClientYoutubeanalytics.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Deletes a group. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Creates a group. */
  def insert(request: AnonFields): Request_[Group]
  /**
    * Returns a collection of groups that match the API request parameters. For example, you can retrieve all groups that the authenticated user owns, or you
    * can retrieve one or more groups by their unique IDs.
    */
  def list(request: AnonKey): Request_[GroupListResponse]
  /** Modifies a group. For example, you could change a group's title. */
  def update(request: AnonFields): Request_[Group]
}

object GroupsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    insert: AnonFields => CallbackTo[Request_[Group]],
    list: AnonKey => CallbackTo[Request_[GroupListResponse]],
    update: AnonFields => CallbackTo[Request_[Group]]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubeanalytics.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubeanalytics.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubeanalytics.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubeanalytics.AnonFields) => update(t0).runNow()))
    __obj.asInstanceOf[GroupsResource]
  }
}

