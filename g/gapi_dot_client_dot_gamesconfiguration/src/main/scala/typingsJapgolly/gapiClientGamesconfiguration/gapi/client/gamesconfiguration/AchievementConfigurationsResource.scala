package typingsJapgolly.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGamesconfiguration.AnonAchievementId
import typingsJapgolly.gapiClientGamesconfiguration.AnonAlt
import typingsJapgolly.gapiClientGamesconfiguration.AnonApplicationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementConfigurationsResource extends js.Object {
  /** Delete the achievement configuration with the given ID. */
  def delete(request: AnonAchievementId): Request_[Unit]
  /** Retrieves the metadata of the achievement configuration with the given ID. */
  def get(request: AnonAchievementId): Request_[AchievementConfiguration]
  /** Insert a new achievement configuration in this application. */
  def insert(request: AnonAlt): Request_[AchievementConfiguration]
  /** Returns a list of the achievement configurations in this application. */
  def list(request: AnonApplicationId): Request_[AchievementConfigurationListResponse]
  /** Update the metadata of the achievement configuration with the given ID. This method supports patch semantics. */
  def patch(request: AnonAchievementId): Request_[AchievementConfiguration]
  /** Update the metadata of the achievement configuration with the given ID. */
  def update(request: AnonAchievementId): Request_[AchievementConfiguration]
}

object AchievementConfigurationsResource {
  @scala.inline
  def apply(
    delete: AnonAchievementId => CallbackTo[Request_[Unit]],
    get: AnonAchievementId => CallbackTo[Request_[AchievementConfiguration]],
    insert: AnonAlt => CallbackTo[Request_[AchievementConfiguration]],
    list: AnonApplicationId => CallbackTo[Request_[AchievementConfigurationListResponse]],
    patch: AnonAchievementId => CallbackTo[Request_[AchievementConfiguration]],
    update: AnonAchievementId => CallbackTo[Request_[AchievementConfiguration]]
  ): AchievementConfigurationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesconfiguration.AnonAchievementId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesconfiguration.AnonAchievementId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesconfiguration.AnonAlt) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesconfiguration.AnonApplicationId) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesconfiguration.AnonAchievementId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesconfiguration.AnonAchievementId) => update(t0).runNow()))
    __obj.asInstanceOf[AchievementConfigurationsResource]
  }
}

