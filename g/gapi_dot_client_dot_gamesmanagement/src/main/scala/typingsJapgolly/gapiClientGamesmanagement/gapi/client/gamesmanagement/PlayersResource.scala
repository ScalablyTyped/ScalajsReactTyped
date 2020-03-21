package typingsJapgolly.gapiClientGamesmanagement.gapi.client.gamesmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGamesmanagement.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayersResource extends js.Object {
  /** Hide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def hide(request: AnonFields): Request_[Unit]
  /** Unhide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def unhide(request: AnonFields): Request_[Unit]
}

object PlayersResource {
  @scala.inline
  def apply(hide: AnonFields => CallbackTo[Request_[Unit]], unhide: AnonFields => CallbackTo[Request_[Unit]]): PlayersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonFields) => hide(t0).runNow()))
    __obj.updateDynamic("unhide")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonFields) => unhide(t0).runNow()))
    __obj.asInstanceOf[PlayersResource]
  }
}

