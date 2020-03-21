package typingsJapgolly.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutubeanalytics.AnonAlt
import typingsJapgolly.gapiClientYoutubeanalytics.AnonFields
import typingsJapgolly.gapiClientYoutubeanalytics.AnonGroupId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItemsResource extends js.Object {
  /** Removes an item from a group. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Creates a group item. */
  def insert(request: AnonFields): Request_[GroupItem]
  /** Returns a collection of group items that match the API request parameters. */
  def list(request: AnonGroupId): Request_[GroupItemListResponse]
}

object GroupItemsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    insert: AnonFields => CallbackTo[Request_[GroupItem]],
    list: AnonGroupId => CallbackTo[Request_[GroupItemListResponse]]
  ): GroupItemsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubeanalytics.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubeanalytics.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubeanalytics.AnonGroupId) => list(t0).runNow()))
    __obj.asInstanceOf[GroupItemsResource]
  }
}

