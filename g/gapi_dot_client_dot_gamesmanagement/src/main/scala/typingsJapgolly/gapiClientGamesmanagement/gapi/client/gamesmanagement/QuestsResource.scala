package typingsJapgolly.gapiClientGamesmanagement.gapi.client.gamesmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGamesmanagement.AnonAlt
import typingsJapgolly.gapiClientGamesmanagement.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestsResource extends js.Object {
  /**
    * Resets all player progress on the quest with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
    * accounts for your application.
    */
  def reset(request: AnonKey): Request_[Unit]
  /**
    * Resets all player progress on all quests for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def resetAll(request: AnonAlt): Request_[Unit]
  /** Resets all draft quests for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: AnonAlt): Request_[Unit]
  /**
    * Resets all player progress on the quest with the given ID for all players. This method is only available to user accounts for your developer console.
    * Only draft quests can be reset.
    */
  def resetForAllPlayers(request: AnonKey): Request_[Unit]
  /**
    * Resets quests with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft quests may be
    * reset.
    */
  def resetMultipleForAllPlayers(request: AnonAlt): Request_[Unit]
}

object QuestsResource {
  @scala.inline
  def apply(
    reset: AnonKey => CallbackTo[Request_[Unit]],
    resetAll: AnonAlt => CallbackTo[Request_[Unit]],
    resetAllForAllPlayers: AnonAlt => CallbackTo[Request_[Unit]],
    resetForAllPlayers: AnonKey => CallbackTo[Request_[Unit]],
    resetMultipleForAllPlayers: AnonAlt => CallbackTo[Request_[Unit]]
  ): QuestsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonKey) => reset(t0).runNow()))
    __obj.updateDynamic("resetAll")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => resetAll(t0).runNow()))
    __obj.updateDynamic("resetAllForAllPlayers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => resetAllForAllPlayers(t0).runNow()))
    __obj.updateDynamic("resetForAllPlayers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonKey) => resetForAllPlayers(t0).runNow()))
    __obj.updateDynamic("resetMultipleForAllPlayers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => resetMultipleForAllPlayers(t0).runNow()))
    __obj.asInstanceOf[QuestsResource]
  }
}

