package typingsJapgolly.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSqladmin.anon.Callback
import typingsJapgolly.maximMazurokGapiClientSqladmin.anon.FieldsHost
import typingsJapgolly.maximMazurokGapiClientSqladmin.anon.Host
import typingsJapgolly.maximMazurokGapiClientSqladmin.anon.Name
import typingsJapgolly.maximMazurokGapiClientSqladmin.anon.ResourceUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends StObject {
  
  /** Deletes a user from a Cloud SQL instance. */
  def delete(): Request[Operation] = js.native
  def delete(request: Host): Request[Operation] = js.native
  
  /** Retrieves a resource containing information about a user. */
  def get(): Request[User] = js.native
  def get(request: Name): Request[User] = js.native
  
  def insert(request: Callback, body: User): Request[Operation] = js.native
  /** Creates a new user in a Cloud SQL instance. */
  def insert(request: ResourceUploadType): Request[Operation] = js.native
  
  /** Lists users in the specified Cloud SQL instance. */
  def list(): Request[UsersListResponse] = js.native
  def list(request: Callback): Request[UsersListResponse] = js.native
  
  /** Updates an existing user in a Cloud SQL instance. */
  def update(request: FieldsHost): Request[Operation] = js.native
  def update(request: Host, body: User): Request[Operation] = js.native
}
