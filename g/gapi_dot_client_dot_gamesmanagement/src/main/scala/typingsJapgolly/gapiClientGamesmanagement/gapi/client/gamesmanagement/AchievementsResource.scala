package typingsJapgolly.gapiClientGamesmanagement.gapi.client.gamesmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGamesmanagement.AnonAchievementId
import typingsJapgolly.gapiClientGamesmanagement.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementsResource extends js.Object {
  /**
    * Resets the achievement with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def reset(request: AnonAchievementId): Request_[AchievementResetResponse]
  /**
    * Resets all achievements for the currently authenticated player for your application. This method is only accessible to whitelisted tester accounts for
    * your application.
    */
  def resetAll(request: AnonAlt): Request_[AchievementResetAllResponse]
  /** Resets all draft achievements for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: AnonAlt): Request_[Unit]
  /**
    * Resets the achievement with the given ID for all players. This method is only available to user accounts for your developer console. Only draft
    * achievements can be reset.
    */
  def resetForAllPlayers(request: AnonAchievementId): Request_[Unit]
  /**
    * Resets achievements with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft
    * achievements may be reset.
    */
  def resetMultipleForAllPlayers(request: AnonAlt): Request_[Unit]
}

object AchievementsResource {
  @scala.inline
  def apply(
    reset: AnonAchievementId => CallbackTo[Request_[AchievementResetResponse]],
    resetAll: AnonAlt => CallbackTo[Request_[AchievementResetAllResponse]],
    resetAllForAllPlayers: AnonAlt => CallbackTo[Request_[Unit]],
    resetForAllPlayers: AnonAchievementId => CallbackTo[Request_[Unit]],
    resetMultipleForAllPlayers: AnonAlt => CallbackTo[Request_[Unit]]
  ): AchievementsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAchievementId) => reset(t0).runNow()))
    __obj.updateDynamic("resetAll")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => resetAll(t0).runNow()))
    __obj.updateDynamic("resetAllForAllPlayers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => resetAllForAllPlayers(t0).runNow()))
    __obj.updateDynamic("resetForAllPlayers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAchievementId) => resetForAllPlayers(t0).runNow()))
    __obj.updateDynamic("resetMultipleForAllPlayers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => resetMultipleForAllPlayers(t0).runNow()))
    __obj.asInstanceOf[AchievementsResource]
  }
}

