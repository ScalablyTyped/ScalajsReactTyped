package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonMaxResults
import typingsJapgolly.gapiClientGames.AnonPlayerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayersResource extends js.Object {
  /** Retrieves the Player resource with the given ID. To retrieve the player for the currently authenticated user, set playerId to me. */
  def get(request: AnonPlayerId): Request_[Player]
  /** Get the collection of players for the currently authenticated user. */
  def list(request: AnonMaxResults): Request_[PlayerListResponse]
}

object PlayersResource {
  @scala.inline
  def apply(
    get: AnonPlayerId => CallbackTo[Request_[Player]],
    list: AnonMaxResults => CallbackTo[Request_[PlayerListResponse]]
  ): PlayersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonPlayerId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonMaxResults) => list(t0).runNow()))
    __obj.asInstanceOf[PlayersResource]
  }
}

