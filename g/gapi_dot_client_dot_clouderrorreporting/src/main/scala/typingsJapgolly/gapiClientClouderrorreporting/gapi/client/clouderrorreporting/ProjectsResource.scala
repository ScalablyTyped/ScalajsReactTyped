package typingsJapgolly.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientClouderrorreporting.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var events: EventsResource
  var groupStats: GroupStatsResource
  var groups: GroupsResource
  /** Deletes all error events of a given project. */
  def deleteEvents(request: AnonAlt): Request_[js.Object]
}

object ProjectsResource {
  @scala.inline
  def apply(
    deleteEvents: AnonAlt => CallbackTo[Request_[js.Object]],
    events: EventsResource,
    groupStats: GroupStatsResource,
    groups: GroupsResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], groupStats = groupStats.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any])
    __obj.updateDynamic("deleteEvents")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouderrorreporting.AnonAlt) => deleteEvents(t0).runNow()))
    __obj.asInstanceOf[ProjectsResource]
  }
}

