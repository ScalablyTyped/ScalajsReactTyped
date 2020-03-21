package typingsJapgolly.gapiClientPlus.gapi.client.plus

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlus.AnonActivityId
import typingsJapgolly.gapiClientPlus.AnonAlt
import typingsJapgolly.gapiClientPlus.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: AnonActivityId): Request_[Activity]
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: AnonAlt): Request_[ActivityFeed]
  /** Search public activities. */
  def search(request: AnonFields): Request_[ActivityFeed]
}

object ActivitiesResource {
  @scala.inline
  def apply(
    get: AnonActivityId => CallbackTo[Request_[Activity]],
    list: AnonAlt => CallbackTo[Request_[ActivityFeed]],
    search: AnonFields => CallbackTo[Request_[ActivityFeed]]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlus.AnonActivityId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlus.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlus.AnonFields) => search(t0).runNow()))
    __obj.asInstanceOf[ActivitiesResource]
  }
}

