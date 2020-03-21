package typingsJapgolly.gapiClientGamesmanagement.gapi.client.gamesmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGamesmanagement.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomsResource extends js.Object {
  /**
    * Reset all rooms for the currently authenticated player for your application. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def reset(request: AnonAlt): Request_[Unit]
  /**
    * Deletes rooms where the only room participants are from whitelisted tester accounts for your application. This method is only available to user
    * accounts for your developer console.
    */
  def resetForAllPlayers(request: AnonAlt): Request_[Unit]
}

object RoomsResource {
  @scala.inline
  def apply(
    reset: AnonAlt => CallbackTo[Request_[Unit]],
    resetForAllPlayers: AnonAlt => CallbackTo[Request_[Unit]]
  ): RoomsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => reset(t0).runNow()))
    __obj.updateDynamic("resetForAllPlayers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesmanagement.AnonAlt) => resetForAllPlayers(t0).runNow()))
    __obj.asInstanceOf[RoomsResource]
  }
}

