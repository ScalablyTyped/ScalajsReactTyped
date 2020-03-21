package typingsJapgolly.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGamesconfiguration.AnonAlt
import typingsJapgolly.gapiClientGamesconfiguration.AnonApplicationId
import typingsJapgolly.gapiClientGamesconfiguration.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardConfigurationsResource extends js.Object {
  /** Delete the leaderboard configuration with the given ID. */
  def delete(request: AnonKey): Request_[Unit]
  /** Retrieves the metadata of the leaderboard configuration with the given ID. */
  def get(request: AnonKey): Request_[LeaderboardConfiguration]
  /** Insert a new leaderboard configuration in this application. */
  def insert(request: AnonAlt): Request_[LeaderboardConfiguration]
  /** Returns a list of the leaderboard configurations in this application. */
  def list(request: AnonApplicationId): Request_[LeaderboardConfigurationListResponse]
  /** Update the metadata of the leaderboard configuration with the given ID. This method supports patch semantics. */
  def patch(request: AnonKey): Request_[LeaderboardConfiguration]
  /** Update the metadata of the leaderboard configuration with the given ID. */
  def update(request: AnonKey): Request_[LeaderboardConfiguration]
}

object LeaderboardConfigurationsResource {
  @scala.inline
  def apply(
    delete: AnonKey => CallbackTo[Request_[Unit]],
    get: AnonKey => CallbackTo[Request_[LeaderboardConfiguration]],
    insert: AnonAlt => CallbackTo[Request_[LeaderboardConfiguration]],
    list: AnonApplicationId => CallbackTo[Request_[LeaderboardConfigurationListResponse]],
    patch: AnonKey => CallbackTo[Request_[LeaderboardConfiguration]],
    update: AnonKey => CallbackTo[Request_[LeaderboardConfiguration]]
  ): LeaderboardConfigurationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesconfiguration.AnonKey) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesconfiguration.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesconfiguration.AnonAlt) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesconfiguration.AnonApplicationId) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesconfiguration.AnonKey) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGamesconfiguration.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[LeaderboardConfigurationsResource]
  }
}

