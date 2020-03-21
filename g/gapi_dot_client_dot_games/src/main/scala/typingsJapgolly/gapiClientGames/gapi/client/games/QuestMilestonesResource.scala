package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonMilestoneId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestMilestonesResource extends js.Object {
  /**
    * Report that a reward for the milestone corresponding to milestoneId for the quest corresponding to questId has been claimed by the currently authorized
    * user.
    */
  def claim(request: AnonMilestoneId): Request_[Unit]
}

object QuestMilestonesResource {
  @scala.inline
  def apply(claim: AnonMilestoneId => CallbackTo[Request_[Unit]]): QuestMilestonesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("claim")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonMilestoneId) => claim(t0).runNow()))
    __obj.asInstanceOf[QuestMilestonesResource]
  }
}

