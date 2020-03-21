package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonGoalId
import typingsJapgolly.gapiClientAnalytics.AnonProfileId
import typingsJapgolly.gapiClientAnalytics.AnonStartindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalsResource extends js.Object {
  /** Gets a goal to which the user has access. */
  def get(request: AnonGoalId): Request_[Goal]
  /** Create a new goal. */
  def insert(request: AnonProfileId): Request_[Goal]
  /** Lists goals to which the user has access. */
  def list(request: AnonStartindex): Request_[Goals]
  /** Updates an existing goal. This method supports patch semantics. */
  def patch(request: AnonGoalId): Request_[Goal]
  /** Updates an existing goal. */
  def update(request: AnonGoalId): Request_[Goal]
}

object GoalsResource {
  @scala.inline
  def apply(
    get: AnonGoalId => CallbackTo[Request_[Goal]],
    insert: AnonProfileId => CallbackTo[Request_[Goal]],
    list: AnonStartindex => CallbackTo[Request_[Goals]],
    patch: AnonGoalId => CallbackTo[Request_[Goal]],
    update: AnonGoalId => CallbackTo[Request_[Goal]]
  ): GoalsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonGoalId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonProfileId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonStartindex) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonGoalId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonGoalId) => update(t0).runNow()))
    __obj.asInstanceOf[GoalsResource]
  }
}

