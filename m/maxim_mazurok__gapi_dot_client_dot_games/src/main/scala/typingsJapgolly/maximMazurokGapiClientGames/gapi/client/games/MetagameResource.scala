package typingsJapgolly.maximMazurokGapiClientGames.gapi.client.games

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientGames.anon.Collection
import typingsJapgolly.maximMazurokGapiClientGames.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetagameResource extends StObject {
  
  /** Return the metagame configuration data for the calling application. */
  def getMetagameConfig(): Request[MetagameConfig] = js.native
  def getMetagameConfig(request: Oauthtoken): Request[MetagameConfig] = js.native
  
  /** List play data aggregated per category for the player corresponding to `playerId`. */
  def listCategoriesByPlayer(): Request[CategoryListResponse] = js.native
  def listCategoriesByPlayer(request: Collection): Request[CategoryListResponse] = js.native
}
