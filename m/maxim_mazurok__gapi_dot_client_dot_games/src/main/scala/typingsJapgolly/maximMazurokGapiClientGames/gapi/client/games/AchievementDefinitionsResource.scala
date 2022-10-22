package typingsJapgolly.maximMazurokGapiClientGames.gapi.client.games

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientGames.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementDefinitionsResource extends StObject {
  
  /** Lists all the achievement definitions for your application. */
  def list(): Request[AchievementDefinitionsListResponse] = js.native
  def list(request: Accesstoken): Request[AchievementDefinitionsListResponse] = js.native
}
