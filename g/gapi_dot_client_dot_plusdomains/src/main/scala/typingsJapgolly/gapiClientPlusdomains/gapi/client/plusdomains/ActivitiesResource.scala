package typingsJapgolly.gapiClientPlusdomains.gapi.client.plusdomains

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlusdomains.AnonActivityId
import typingsJapgolly.gapiClientPlusdomains.AnonAlt
import typingsJapgolly.gapiClientPlusdomains.AnonCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: AnonActivityId): Request_[Activity]
  /** Create a new activity for the authenticated user. */
  def insert(request: AnonAlt): Request_[Activity]
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: AnonCollection): Request_[ActivityFeed]
}

object ActivitiesResource {
  @scala.inline
  def apply(
    get: AnonActivityId => CallbackTo[Request_[Activity]],
    insert: AnonAlt => CallbackTo[Request_[Activity]],
    list: AnonCollection => CallbackTo[Request_[ActivityFeed]]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonActivityId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonAlt) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonCollection) => list(t0).runNow()))
    __obj.asInstanceOf[ActivitiesResource]
  }
}

