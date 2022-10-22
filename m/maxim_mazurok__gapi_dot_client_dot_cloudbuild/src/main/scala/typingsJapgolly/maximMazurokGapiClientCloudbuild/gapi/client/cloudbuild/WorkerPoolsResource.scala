package typingsJapgolly.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.AllowMissing
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.Fields
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.PageToken
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.PrettyPrintQuotaUser
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.QuotaUserUpdateMask
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.ValidateOnly
import typingsJapgolly.maximMazurokGapiClientCloudbuild.anon.WorkerPoolId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerPoolsResource extends StObject {
  
  /** Creates a `WorkerPool`. */
  def create(request: ValidateOnly): Request[Operation] = js.native
  def create(request: WorkerPoolId, body: WorkerPool): Request[Operation] = js.native
  
  /** Deletes a `WorkerPool`. */
  def delete(): Request[Operation] = js.native
  def delete(request: AllowMissing): Request[Operation] = js.native
  
  /** Returns details of a `WorkerPool`. */
  def get(): Request[WorkerPool] = js.native
  def get(request: Fields): Request[WorkerPool] = js.native
  
  /** Lists `WorkerPool`s. */
  def list(): Request[ListWorkerPoolsResponse] = js.native
  def list(request: PageToken): Request[ListWorkerPoolsResponse] = js.native
  
  /** Updates a `WorkerPool`. */
  def patch(request: PrettyPrintQuotaUser): Request[Operation] = js.native
  def patch(request: QuotaUserUpdateMask, body: WorkerPool): Request[Operation] = js.native
}
