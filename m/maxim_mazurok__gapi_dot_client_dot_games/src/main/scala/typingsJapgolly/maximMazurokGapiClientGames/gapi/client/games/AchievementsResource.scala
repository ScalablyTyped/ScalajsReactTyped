package typingsJapgolly.maximMazurokGapiClientGames.gapi.client.games

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientGames.anon.AchievementId
import typingsJapgolly.maximMazurokGapiClientGames.anon.Alt
import typingsJapgolly.maximMazurokGapiClientGames.anon.Callback
import typingsJapgolly.maximMazurokGapiClientGames.anon.Fields
import typingsJapgolly.maximMazurokGapiClientGames.anon.Key
import typingsJapgolly.maximMazurokGapiClientGames.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementsResource extends StObject {
  
  /** Increments the steps of the achievement with the given ID for the currently authenticated player. */
  def increment(): Request[AchievementIncrementResponse] = js.native
  def increment(request: AchievementId): Request[AchievementIncrementResponse] = js.native
  
  /** Lists the progress for all your application's achievements for the currently authenticated player. */
  def list(): Request[PlayerAchievementListResponse] = js.native
  def list(request: Alt): Request[PlayerAchievementListResponse] = js.native
  
  /** Sets the state of the achievement with the given ID to `REVEALED` for the currently authenticated player. */
  def reveal(): Request[AchievementRevealResponse] = js.native
  def reveal(request: Callback): Request[AchievementRevealResponse] = js.native
  
  /**
    * Sets the steps for the currently authenticated player towards unlocking an achievement. If the steps parameter is less than the current number of steps that the player already
    * gained for the achievement, the achievement is not modified.
    */
  def setStepsAtLeast(): Request[AchievementSetStepsAtLeastResponse] = js.native
  def setStepsAtLeast(request: Fields): Request[AchievementSetStepsAtLeastResponse] = js.native
  
  /** Unlocks this achievement for the currently authenticated player. */
  def unlock(): Request[AchievementUnlockResponse] = js.native
  def unlock(request: Callback): Request[AchievementUnlockResponse] = js.native
  
  /** Updates multiple achievements for the currently authenticated player. */
  def updateMultiple(request: Key): Request[AchievementUpdateMultipleResponse] = js.native
  def updateMultiple(request: Oauthtoken, body: AchievementUpdateMultipleRequest): Request[AchievementUpdateMultipleResponse] = js.native
}
