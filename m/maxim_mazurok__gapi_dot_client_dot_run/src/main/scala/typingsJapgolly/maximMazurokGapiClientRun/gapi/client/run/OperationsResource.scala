package typingsJapgolly.maximMazurokGapiClientRun.gapi.client.run

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientRun.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientRun.anon.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends StObject {
  
  /**
    * Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't
    * support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service. */
  def get(): Request[GoogleLongrunningOperation] = js.native
  def get(request: Accesstoken): Request[GoogleLongrunningOperation] = js.native
  
  /**
    * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE: the `name` binding allows API services
    * to override the binding to use different resource name schemes, such as `users/ *‍/operations`. To override the binding, API services can add a binding such as
    * `"/v1/{name=users/ *}/operations"` to their service configuration. For backwards compatibility, the default name includes the operations collection id, however overriding users must
    * ensure the name binding is the parent resource, without the operations collection id.
    */
  def list(): Request[GoogleLongrunningListOperationsResponse] = js.native
  def list(request: Filter): Request[GoogleLongrunningListOperationsResponse] = js.native
}
