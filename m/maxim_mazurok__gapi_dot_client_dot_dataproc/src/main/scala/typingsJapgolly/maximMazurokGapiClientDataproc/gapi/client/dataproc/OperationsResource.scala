package typingsJapgolly.maximMazurokGapiClientDataproc.gapi.client.dataproc

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.Fields
import typingsJapgolly.maximMazurokGapiClientDataproc.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends StObject {
  
  /**
    * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support
    * this method, it returns google.rpc.Code.UNIMPLEMENTED. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation
    * completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a
    * google.rpc.Status.code of 1, corresponding to Code.CANCELLED.
    */
  def cancel(): Request[js.Object] = js.native
  def cancel(request: Callback): Request[js.Object] = js.native
  
  /**
    * Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't
    * support this method, it returns google.rpc.Code.UNIMPLEMENTED.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service. */
  def get(): Request[Operation] = js.native
  def get(request: Callback): Request[Operation] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(request: Fields, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns UNIMPLEMENTED.NOTE: the name binding allows API services to
    * override the binding to use different resource name schemes, such as users/ *‍/operations. To override the binding, API services can add a binding such as
    * "/v1/{name=users/ *}/operations" to their service configuration. For backwards compatibility, the default name includes the operations collection id, however overriding users must
    * ensure the name binding is the parent resource, without the operations collection id.
    */
  def list(): Request[ListOperationsResponse] = js.native
  def list(request: PageSize): Request[ListOperationsResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors. */
  def setIamPolicy(request: Fields, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Fields, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
