package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonClientRevision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionsResource extends js.Object {
  /** Checks whether the games client is out of date. */
  def check(request: AnonClientRevision): Request_[RevisionCheckResponse]
}

object RevisionsResource {
  @scala.inline
  def apply(check: AnonClientRevision => CallbackTo[Request_[RevisionCheckResponse]]): RevisionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonClientRevision) => check(t0).runNow()))
    __obj.asInstanceOf[RevisionsResource]
  }
}

