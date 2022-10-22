package typingsJapgolly.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDoubleclickbidmanager.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDoubleclickbidmanager.anon.Fields
import typingsJapgolly.maximMazurokGapiClientDoubleclickbidmanager.anon.Key
import typingsJapgolly.maximMazurokGapiClientDoubleclickbidmanager.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientDoubleclickbidmanager.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientDoubleclickbidmanager.anon.QueryId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueriesResource extends StObject {
  
  /** Creates a query. */
  def create(request: Callback): Request[Query] = js.native
  def create(request: Fields, body: Query): Request[Query] = js.native
  
  /** Deletes a query as well as the associated reports. */
  def delete(): Request[Unit] = js.native
  def delete(request: Key): Request[Unit] = js.native
  
  /** Retrieves a query. */
  def get(): Request[Query] = js.native
  def get(request: Key): Request[Query] = js.native
  
  /** Lists queries created by the current user. */
  def list(): Request[ListQueriesResponse] = js.native
  def list(request: Oauthtoken): Request[ListQueriesResponse] = js.native
  
  var reports: ReportsResource = js.native
  
  /** Runs a stored query to generate a report. */
  def run(request: PrettyPrint): Request[Report] = js.native
  def run(request: QueryId, body: RunQueryRequest): Request[Report] = js.native
}
