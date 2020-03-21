package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonAlt
import typingsJapgolly.gapiClientGames.AnonLeaderboardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardsResource extends js.Object {
  /** Retrieves the metadata of the leaderboard with the given ID. */
  def get(request: AnonLeaderboardId): Request_[Leaderboard]
  /** Lists all the leaderboard metadata for your application. */
  def list(request: AnonAlt): Request_[LeaderboardListResponse]
}

object LeaderboardsResource {
  @scala.inline
  def apply(
    get: AnonLeaderboardId => CallbackTo[Request_[Leaderboard]],
    list: AnonAlt => CallbackTo[Request_[LeaderboardListResponse]]
  ): LeaderboardsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonLeaderboardId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[LeaderboardsResource]
  }
}

