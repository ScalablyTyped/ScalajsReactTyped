package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonActiveAdvertiserId
import typingsJapgolly.gapiClientDfareporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetableRemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: AnonFields): Request_[TargetableRemarketingList]
  /** Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging. */
  def list(request: AnonActiveAdvertiserId): Request_[TargetableRemarketingListsListResponse]
}

object TargetableRemarketingListsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[TargetableRemarketingList]],
    list: AnonActiveAdvertiserId => CallbackTo[Request_[TargetableRemarketingListsListResponse]]
  ): TargetableRemarketingListsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonActiveAdvertiserId) => list(t0).runNow()))
    __obj.asInstanceOf[TargetableRemarketingListsResource]
  }
}

