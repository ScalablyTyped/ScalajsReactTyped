package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonQuotaUser
import typingsJapgolly.gapiClientAnalytics.AnonRemarketingAudienceId
import typingsJapgolly.gapiClientAnalytics.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudienceResource extends js.Object {
  /** Delete a remarketing audience. */
  def delete(request: AnonRemarketingAudienceId): Request_[Unit]
  /** Gets a remarketing audience to which the user has access. */
  def get(request: AnonRemarketingAudienceId): Request_[RemarketingAudience]
  /** Creates a new remarketing audience. */
  def insert(request: AnonQuotaUser): Request_[RemarketingAudience]
  /** Lists remarketing audiences to which the user has access. */
  def list(request: AnonType): Request_[RemarketingAudiences]
  /** Updates an existing remarketing audience. This method supports patch semantics. */
  def patch(request: AnonRemarketingAudienceId): Request_[RemarketingAudience]
  /** Updates an existing remarketing audience. */
  def update(request: AnonRemarketingAudienceId): Request_[RemarketingAudience]
}

object RemarketingAudienceResource {
  @scala.inline
  def apply(
    delete: AnonRemarketingAudienceId => CallbackTo[Request_[Unit]],
    get: AnonRemarketingAudienceId => CallbackTo[Request_[RemarketingAudience]],
    insert: AnonQuotaUser => CallbackTo[Request_[RemarketingAudience]],
    list: AnonType => CallbackTo[Request_[RemarketingAudiences]],
    patch: AnonRemarketingAudienceId => CallbackTo[Request_[RemarketingAudience]],
    update: AnonRemarketingAudienceId => CallbackTo[Request_[RemarketingAudience]]
  ): RemarketingAudienceResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonRemarketingAudienceId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonRemarketingAudienceId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonQuotaUser) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonType) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonRemarketingAudienceId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonRemarketingAudienceId) => update(t0).runNow()))
    __obj.asInstanceOf[RemarketingAudienceResource]
  }
}

