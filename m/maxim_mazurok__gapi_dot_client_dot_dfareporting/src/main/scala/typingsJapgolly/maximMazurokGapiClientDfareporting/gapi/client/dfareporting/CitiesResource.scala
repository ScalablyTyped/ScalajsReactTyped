package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.CountryDartIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CitiesResource extends StObject {
  
  /** Retrieves a list of cities, possibly filtered. */
  def list(): Request[CitiesListResponse] = js.native
  def list(request: CountryDartIds): Request[CitiesListResponse] = js.native
}
