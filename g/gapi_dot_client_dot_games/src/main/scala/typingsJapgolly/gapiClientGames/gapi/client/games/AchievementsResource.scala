package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonAchievementId
import typingsJapgolly.gapiClientGames.AnonConsistencyToken
import typingsJapgolly.gapiClientGames.AnonFields
import typingsJapgolly.gapiClientGames.AnonKey
import typingsJapgolly.gapiClientGames.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementsResource extends js.Object {
  /** Increments the steps of the achievement with the given ID for the currently authenticated player. */
  def increment(request: AnonAchievementId): Request_[AchievementIncrementResponse]
  /** Lists the progress for all your application's achievements for the currently authenticated player. */
  def list(request: AnonConsistencyToken): Request_[PlayerAchievementListResponse]
  /** Sets the state of the achievement with the given ID to REVEALED for the currently authenticated player. */
  def reveal(request: AnonFields): Request_[AchievementRevealResponse]
  /**
    * Sets the steps for the currently authenticated player towards unlocking an achievement. If the steps parameter is less than the current number of steps
    * that the player already gained for the achievement, the achievement is not modified.
    */
  def setStepsAtLeast(request: AnonKey): Request_[AchievementSetStepsAtLeastResponse]
  /** Unlocks this achievement for the currently authenticated player. */
  def unlock(request: AnonFields): Request_[AchievementUnlockResponse]
  /** Updates multiple achievements for the currently authenticated player. */
  def updateMultiple(request: AnonOauthtoken): Request_[AchievementUpdateMultipleResponse]
}

object AchievementsResource {
  @scala.inline
  def apply(
    increment: AnonAchievementId => CallbackTo[Request_[AchievementIncrementResponse]],
    list: AnonConsistencyToken => CallbackTo[Request_[PlayerAchievementListResponse]],
    reveal: AnonFields => CallbackTo[Request_[AchievementRevealResponse]],
    setStepsAtLeast: AnonKey => CallbackTo[Request_[AchievementSetStepsAtLeastResponse]],
    unlock: AnonFields => CallbackTo[Request_[AchievementUnlockResponse]],
    updateMultiple: AnonOauthtoken => CallbackTo[Request_[AchievementUpdateMultipleResponse]]
  ): AchievementsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("increment")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonAchievementId) => increment(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonConsistencyToken) => list(t0).runNow()))
    __obj.updateDynamic("reveal")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonFields) => reveal(t0).runNow()))
    __obj.updateDynamic("setStepsAtLeast")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonKey) => setStepsAtLeast(t0).runNow()))
    __obj.updateDynamic("unlock")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonFields) => unlock(t0).runNow()))
    __obj.updateDynamic("updateMultiple")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonOauthtoken) => updateMultiple(t0).runNow()))
    __obj.asInstanceOf[AchievementsResource]
  }
}

