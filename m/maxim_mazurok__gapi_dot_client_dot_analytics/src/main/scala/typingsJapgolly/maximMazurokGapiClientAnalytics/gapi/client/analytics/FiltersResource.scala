package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.FieldsFilterId
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.FilterId
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.Maxresults
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FiltersResource extends StObject {
  
  /** Delete a filter. */
  def delete(): Request[Filter] = js.native
  def delete(request: FilterId): Request[Filter] = js.native
  
  /** Returns filters to which the user has access. */
  def get(): Request[Filter] = js.native
  def get(request: FilterId): Request[Filter] = js.native
  
  /** Create a new filter. */
  def insert(request: KeyOauthtoken): Request[Filter] = js.native
  def insert(request: PrettyPrint, body: Filter): Request[Filter] = js.native
  
  /** Lists all filters for an account */
  def list(): Request[Filters] = js.native
  def list(request: Maxresults): Request[Filters] = js.native
  
  /** Updates an existing filter. This method supports patch semantics. */
  def patch(request: FieldsFilterId): Request[Filter] = js.native
  def patch(request: FilterId, body: Filter): Request[Filter] = js.native
  
  /** Updates an existing filter. */
  def update(request: FieldsFilterId): Request[Filter] = js.native
  def update(request: FilterId, body: Filter): Request[Filter] = js.native
}
