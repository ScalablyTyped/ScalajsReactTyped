package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonPageToken
import typingsJapgolly.gapiClientGames.AnonQuestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestsResource extends js.Object {
  /** Indicates that the currently authorized user will participate in the quest. */
  def accept(request: AnonQuestId): Request_[Quest]
  /** Get a list of quests for your application and the currently authenticated player. */
  def list(request: AnonPageToken): Request_[QuestListResponse]
}

object QuestsResource {
  @scala.inline
  def apply(
    accept: AnonQuestId => CallbackTo[Request_[Quest]],
    list: AnonPageToken => CallbackTo[Request_[QuestListResponse]]
  ): QuestsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonQuestId) => accept(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonPageToken) => list(t0).runNow()))
    __obj.asInstanceOf[QuestsResource]
  }
}

