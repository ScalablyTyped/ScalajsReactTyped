package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonSearchString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Gets one project by ID. */
  def get(request: AnonFields): Request_[Project]
  /** Retrieves a list of projects, possibly filtered. This method supports paging. */
  def list(request: AnonSearchString): Request_[ProjectsListResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[Project]],
    list: AnonSearchString => CallbackTo[Request_[ProjectsListResponse]]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonSearchString) => list(t0).runNow()))
    __obj.asInstanceOf[ProjectsResource]
  }
}

