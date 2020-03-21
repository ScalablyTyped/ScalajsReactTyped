package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementDefinitionsResource extends js.Object {
  /** Lists all the achievement definitions for your application. */
  def list(request: AnonAlt): Request_[AchievementDefinitionsListResponse]
}

object AchievementDefinitionsResource {
  @scala.inline
  def apply(list: AnonAlt => CallbackTo[Request_[AchievementDefinitionsListResponse]]): AchievementDefinitionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[AchievementDefinitionsResource]
  }
}

