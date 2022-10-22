package typingsJapgolly.maximMazurokGapiClientGameservices.gapi.client.gameservices

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientGameservices.anon.Fields
import typingsJapgolly.maximMazurokGapiClientGameservices.anon.IncludeUnrevealedLocations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var gameServerDeployments: GameServerDeploymentsResource = js.native
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Fields): Request[Location] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: IncludeUnrevealedLocations): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
}
