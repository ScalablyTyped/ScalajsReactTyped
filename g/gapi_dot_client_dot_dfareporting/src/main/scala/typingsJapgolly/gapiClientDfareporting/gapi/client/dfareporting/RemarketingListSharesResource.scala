package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonKey
import typingsJapgolly.gapiClientDfareporting.AnonRemarketingListId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListSharesResource extends js.Object {
  /** Gets one remarketing list share by remarketing list ID. */
  def get(request: AnonRemarketingListId): Request_[RemarketingListShare]
  /** Updates an existing remarketing list share. This method supports patch semantics. */
  def patch(request: AnonRemarketingListId): Request_[RemarketingListShare]
  /** Updates an existing remarketing list share. */
  def update(request: AnonKey): Request_[RemarketingListShare]
}

object RemarketingListSharesResource {
  @scala.inline
  def apply(
    get: AnonRemarketingListId => CallbackTo[Request_[RemarketingListShare]],
    patch: AnonRemarketingListId => CallbackTo[Request_[RemarketingListShare]],
    update: AnonKey => CallbackTo[Request_[RemarketingListShare]]
  ): RemarketingListSharesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonRemarketingListId) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonRemarketingListId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[RemarketingListSharesResource]
  }
}

