package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonCollection
import typingsJapgolly.gapiClientGames.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetagameResource extends js.Object {
  /** Return the metagame configuration data for the calling application. */
  def getMetagameConfig(request: AnonOauthtoken): Request_[MetagameConfig]
  /** List play data aggregated per category for the player corresponding to playerId. */
  def listCategoriesByPlayer(request: AnonCollection): Request_[CategoryListResponse]
}

object MetagameResource {
  @scala.inline
  def apply(
    getMetagameConfig: AnonOauthtoken => CallbackTo[Request_[MetagameConfig]],
    listCategoriesByPlayer: AnonCollection => CallbackTo[Request_[CategoryListResponse]]
  ): MetagameResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMetagameConfig")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonOauthtoken) => getMetagameConfig(t0).runNow()))
    __obj.updateDynamic("listCategoriesByPlayer")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonCollection) => listCategoriesByPlayer(t0).runNow()))
    __obj.asInstanceOf[MetagameResource]
  }
}

