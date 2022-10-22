package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.DartId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountriesResource extends StObject {
  
  /** Gets one country by ID. */
  def get(): Request[Country] = js.native
  def get(request: DartId): Request[Country] = js.native
  
  /** Retrieves a list of countries. */
  def list(): Request[CountriesListResponse] = js.native
  def list(request: Callback): Request[CountriesListResponse] = js.native
}
