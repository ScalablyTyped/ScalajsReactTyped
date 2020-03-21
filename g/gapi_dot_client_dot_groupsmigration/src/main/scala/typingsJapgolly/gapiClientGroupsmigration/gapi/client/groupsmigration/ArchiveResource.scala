package typingsJapgolly.gapiClientGroupsmigration.gapi.client.groupsmigration

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGroupsmigration.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveResource extends js.Object {
  /** Inserts a new mail into the archive of the Google group. */
  def insert(request: AnonAlt): Request_[Groups]
}

object ArchiveResource {
  @scala.inline
  def apply(insert: AnonAlt => CallbackTo[Request_[Groups]]): ArchiveResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGroupsmigration.AnonAlt) => insert(t0).runNow()))
    __obj.asInstanceOf[ArchiveResource]
  }
}

