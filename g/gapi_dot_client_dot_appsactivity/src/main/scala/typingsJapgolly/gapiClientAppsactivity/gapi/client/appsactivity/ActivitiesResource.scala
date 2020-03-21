package typingsJapgolly.gapiClientAppsactivity.gapi.client.appsactivity

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAppsactivity.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /**
    * Returns a list of activities visible to the current logged in user. Visible activities are determined by the visiblity settings of the object that was
    * acted on, e.g. Drive files a user can see. An activity is a record of past events. Multiple events may be merged if they are similar. A request is
    * scoped to activities from a given Google service using the source parameter.
    */
  def list(request: AnonAlt): Request_[ListActivitiesResponse]
}

object ActivitiesResource {
  @scala.inline
  def apply(list: AnonAlt => CallbackTo[Request_[ListActivitiesResponse]]): ActivitiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppsactivity.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[ActivitiesResource]
  }
}

