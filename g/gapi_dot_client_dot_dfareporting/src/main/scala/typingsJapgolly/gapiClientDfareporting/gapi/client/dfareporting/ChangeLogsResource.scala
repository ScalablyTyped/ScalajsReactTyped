package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonAction
import typingsJapgolly.gapiClientDfareporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeLogsResource extends js.Object {
  /** Gets one change log by ID. */
  def get(request: AnonFields): Request_[ChangeLog]
  /** Retrieves a list of change logs. This method supports paging. */
  def list(request: AnonAction): Request_[ChangeLogsListResponse]
}

object ChangeLogsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[ChangeLog]],
    list: AnonAction => CallbackTo[Request_[ChangeLogsListResponse]]
  ): ChangeLogsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAction) => list(t0).runNow()))
    __obj.asInstanceOf[ChangeLogsResource]
  }
}

