package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonAcceptsInStreamVideoPlacements
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySitesResource extends js.Object {
  /** Gets one directory site by ID. */
  def get(request: AnonFields): Request_[DirectorySite]
  /** Inserts a new directory site. */
  def insert(request: AnonKey): Request_[DirectorySite]
  /** Retrieves a list of directory sites, possibly filtered. This method supports paging. */
  def list(request: AnonAcceptsInStreamVideoPlacements): Request_[DirectorySitesListResponse]
}

object DirectorySitesResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[DirectorySite]],
    insert: AnonKey => CallbackTo[Request_[DirectorySite]],
    list: AnonAcceptsInStreamVideoPlacements => CallbackTo[Request_[DirectorySitesListResponse]]
  ): DirectorySitesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAcceptsInStreamVideoPlacements) => list(t0).runNow()))
    __obj.asInstanceOf[DirectorySitesResource]
  }
}

