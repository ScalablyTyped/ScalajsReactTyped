package typingsJapgolly.gapiClientDrive.gapi.client.drive

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDrive.AnonFields
import typingsJapgolly.gapiClientDrive.AnonIncludeCorpusRemovals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResource extends js.Object {
  /** Gets the starting pageToken for listing future changes. */
  def getStartPageToken(request: AnonFields): Request_[StartPageToken]
  /** Lists the changes for a user or Team Drive. */
  def list(request: AnonIncludeCorpusRemovals): Request_[ChangeList]
  /** Subscribes to changes for a user. */
  def watch(request: AnonIncludeCorpusRemovals): Request_[Channel]
}

object ChangesResource {
  @scala.inline
  def apply(
    getStartPageToken: AnonFields => CallbackTo[Request_[StartPageToken]],
    list: AnonIncludeCorpusRemovals => CallbackTo[Request_[ChangeList]],
    watch: AnonIncludeCorpusRemovals => CallbackTo[Request_[Channel]]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStartPageToken")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonFields) => getStartPageToken(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonIncludeCorpusRemovals) => list(t0).runNow()))
    __obj.updateDynamic("watch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonIncludeCorpusRemovals) => watch(t0).runNow()))
    __obj.asInstanceOf[ChangesResource]
  }
}

