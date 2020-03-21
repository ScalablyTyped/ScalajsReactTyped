package typingsJapgolly.gapiClientGamesmanagement.gapi.client.gamesmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGamesmanagement.AnonAlt
import typingsJapgolly.gapiClientGamesmanagement.AnonLeaderboardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoresResource extends js.Object {
  /**
    * Resets scores for the leaderboard with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
    * accounts for your application.
    */
  def reset(request: AnonLeaderboardId): Request_[PlayerScoreResetResponse]
  /**
    * Resets all scores for all leaderboards for the currently authenticated players. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def resetAll(request: AnonAlt): Request_[PlayerScoreResetAllResponse]
  /** Resets scores for all draft leaderboards for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: AnonAlt): Request_[Unit]
  /**
    * Resets scores for the leaderboard with the given ID for all players. This method is only available to user accounts for your developer console. Only
    * draft leaderboards can be reset.
    */
  def resetForAllPlayers(request: AnonLeaderboardId): Request_[Unit]
  /**
    * Resets scores for the leaderboards with the given IDs for all players. This method is only available to user accounts for your developer console. Only
    * draft leaderboards may be reset.
    */
  def resetMultipleForAllPlayers(request: AnonAlt): Request_[Unit]
}

object ScoresResource {
  @scala.inline
  def apply(
    reset: AnonLeaderboardId => CallbackTo[Request_[PlayerScoreResetResponse]],
    resetAll: AnonAlt => CallbackTo[Request_[PlayerScoreResetAllResponse]],
    resetAllForAllPlayers: AnonAlt => CallbackTo[Request_[Unit]],
    resetForAllPlayers: AnonLeaderboardId => CallbackTo[Request_[Unit]],
    resetMultipleForAllPlayers: AnonAlt => CallbackTo[Request_[Unit]]
  ): ScoresResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonLeaderboardId) => reset(t0).runNow()))
    __obj.updateDynamic("resetAll")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => resetAll(t0).runNow()))
    __obj.updateDynamic("resetAllForAllPlayers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => resetAllForAllPlayers(t0).runNow()))
    __obj.updateDynamic("resetForAllPlayers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonLeaderboardId) => resetForAllPlayers(t0).runNow()))
    __obj.updateDynamic("resetMultipleForAllPlayers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => resetMultipleForAllPlayers(t0).runNow()))
    __obj.asInstanceOf[ScoresResource]
  }
}

