package typingsJapgolly.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientNotebooks.anon.Callback
import typingsJapgolly.maximMazurokGapiClientNotebooks.anon.ExecutionId
import typingsJapgolly.maximMazurokGapiClientNotebooks.anon.Filter
import typingsJapgolly.maximMazurokGapiClientNotebooks.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionsResource extends StObject {
  
  /** Creates a new Execution in a given project and location. */
  def create(request: ExecutionId): Request[Operation] = js.native
  def create(request: Key, body: Execution): Request[Operation] = js.native
  
  /** Deletes execution */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets details of executions */
  def get(): Request[Execution] = js.native
  def get(request: Callback): Request[Execution] = js.native
  
  /** Lists executions in a given project and location */
  def list(): Request[ListExecutionsResponse] = js.native
  def list(request: Filter): Request[ListExecutionsResponse] = js.native
}
