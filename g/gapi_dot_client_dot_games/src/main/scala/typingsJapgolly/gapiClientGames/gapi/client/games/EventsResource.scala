package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonAlt
import typingsJapgolly.gapiClientGames.AnonLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /** Returns a list showing the current progress on events in this application for the currently authenticated user. */
  def listByPlayer(request: AnonAlt): Request_[PlayerEventListResponse]
  /** Returns a list of the event definitions in this application. */
  def listDefinitions(request: AnonAlt): Request_[EventDefinitionListResponse]
  /** Records a batch of changes to the number of times events have occurred for the currently authenticated user of this application. */
  def record(request: AnonLanguage): Request_[EventUpdateResponse]
}

object EventsResource {
  @scala.inline
  def apply(
    listByPlayer: AnonAlt => CallbackTo[Request_[PlayerEventListResponse]],
    listDefinitions: AnonAlt => CallbackTo[Request_[EventDefinitionListResponse]],
    record: AnonLanguage => CallbackTo[Request_[EventUpdateResponse]]
  ): EventsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listByPlayer")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonAlt) => listByPlayer(t0).runNow()))
    __obj.updateDynamic("listDefinitions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonAlt) => listDefinitions(t0).runNow()))
    __obj.updateDynamic("record")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonLanguage) => record(t0).runNow()))
    __obj.asInstanceOf[EventsResource]
  }
}

