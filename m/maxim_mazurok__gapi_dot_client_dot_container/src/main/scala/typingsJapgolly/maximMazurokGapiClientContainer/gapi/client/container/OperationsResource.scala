package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContainer.anon.Callback
import typingsJapgolly.maximMazurokGapiClientContainer.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientContainer.anon.NameOauthtokenOperationId
import typingsJapgolly.maximMazurokGapiClientContainer.anon.NameOauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientContainer.anon.OauthtokenOperationId
import typingsJapgolly.maximMazurokGapiClientContainer.anon.OauthtokenParent
import typingsJapgolly.maximMazurokGapiClientContainer.anon.OperationId
import typingsJapgolly.maximMazurokGapiClientContainer.anon.OperationIdPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends StObject {
  
  def cancel(request: Callback, body: CancelOperationRequest): Request[js.Object] = js.native
  /** Cancels the specified operation. */
  def cancel(request: NameOauthtokenPrettyPrint): Request[js.Object] = js.native
  /** Cancels the specified operation. */
  def cancel(request: OauthtokenOperationId): Request[js.Object] = js.native
  def cancel(request: OperationIdPrettyPrint, body: CancelOperationRequest): Request[js.Object] = js.native
  
  /** Gets the specified operation. */
  def get(): Request[Operation] = js.native
  def get(request: NameOauthtokenOperationId): Request[Operation] = js.native
  def get(request: OperationId): Request[Operation] = js.native
  
  /** Lists all operations in a project in a specific zone or all zones. */
  def list(): Request[ListOperationsResponse] = js.native
  def list(request: KeyOauthtoken): Request[ListOperationsResponse] = js.native
  def list(request: OauthtokenParent): Request[ListOperationsResponse] = js.native
}
