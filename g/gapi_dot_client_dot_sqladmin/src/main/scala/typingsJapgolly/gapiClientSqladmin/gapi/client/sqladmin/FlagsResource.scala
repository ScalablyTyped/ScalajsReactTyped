package typingsJapgolly.gapiClientSqladmin.gapi.client.sqladmin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSqladmin.AnonDatabaseVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagsResource extends js.Object {
  /** List all available database flags for Google Cloud SQL instances. */
  def list(request: AnonDatabaseVersion): Request_[FlagsListResponse]
}

object FlagsResource {
  @scala.inline
  def apply(list: AnonDatabaseVersion => CallbackTo[Request_[FlagsListResponse]]): FlagsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonDatabaseVersion) => list(t0).runNow()))
    __obj.asInstanceOf[FlagsResource]
  }
}

