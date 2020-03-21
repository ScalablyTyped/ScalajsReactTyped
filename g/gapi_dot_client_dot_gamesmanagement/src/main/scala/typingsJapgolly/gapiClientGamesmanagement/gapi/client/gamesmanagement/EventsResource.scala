package typingsJapgolly.gapiClientGamesmanagement.gapi.client.gamesmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGamesmanagement.AnonAlt
import typingsJapgolly.gapiClientGamesmanagement.AnonEventId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /**
    * Resets all player progress on the event with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
    * accounts for your application. All quests for this player that use the event will also be reset.
    */
  def reset(request: AnonEventId): Request_[Unit]
  /**
    * Resets all player progress on all events for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application. All quests for this player will also be reset.
    */
  def resetAll(request: AnonAlt): Request_[Unit]
  /**
    * Resets all draft events for all players. This method is only available to user accounts for your developer console. All quests that use any of these
    * events will also be reset.
    */
  def resetAllForAllPlayers(request: AnonAlt): Request_[Unit]
  /**
    * Resets the event with the given ID for all players. This method is only available to user accounts for your developer console. Only draft events can be
    * reset. All quests that use the event will also be reset.
    */
  def resetForAllPlayers(request: AnonEventId): Request_[Unit]
  /**
    * Resets events with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft events may be
    * reset. All quests that use any of the events will also be reset.
    */
  def resetMultipleForAllPlayers(request: AnonAlt): Request_[Unit]
}

object EventsResource {
  @scala.inline
  def apply(
    reset: AnonEventId => CallbackTo[Request_[Unit]],
    resetAll: AnonAlt => CallbackTo[Request_[Unit]],
    resetAllForAllPlayers: AnonAlt => CallbackTo[Request_[Unit]],
    resetForAllPlayers: AnonEventId => CallbackTo[Request_[Unit]],
    resetMultipleForAllPlayers: AnonAlt => CallbackTo[Request_[Unit]]
  ): EventsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonEventId) => reset(t0).runNow()))
    __obj.updateDynamic("resetAll")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => resetAll(t0).runNow()))
    __obj.updateDynamic("resetAllForAllPlayers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => resetAllForAllPlayers(t0).runNow()))
    __obj.updateDynamic("resetForAllPlayers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonEventId) => resetForAllPlayers(t0).runNow()))
    __obj.updateDynamic("resetMultipleForAllPlayers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => resetMultipleForAllPlayers(t0).runNow()))
    __obj.asInstanceOf[EventsResource]
  }
}

