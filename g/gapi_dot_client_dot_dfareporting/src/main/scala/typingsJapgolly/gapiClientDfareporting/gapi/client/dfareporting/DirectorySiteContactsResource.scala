package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonDirectorySiteIds
import typingsJapgolly.gapiClientDfareporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySiteContactsResource extends js.Object {
  /** Gets one directory site contact by ID. */
  def get(request: AnonFields): Request_[DirectorySiteContact]
  /** Retrieves a list of directory site contacts, possibly filtered. This method supports paging. */
  def list(request: AnonDirectorySiteIds): Request_[DirectorySiteContactsListResponse]
}

object DirectorySiteContactsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[DirectorySiteContact]],
    list: AnonDirectorySiteIds => CallbackTo[Request_[DirectorySiteContactsListResponse]]
  ): DirectorySiteContactsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonDirectorySiteIds) => list(t0).runNow()))
    __obj.asInstanceOf[DirectorySiteContactsResource]
  }
}

