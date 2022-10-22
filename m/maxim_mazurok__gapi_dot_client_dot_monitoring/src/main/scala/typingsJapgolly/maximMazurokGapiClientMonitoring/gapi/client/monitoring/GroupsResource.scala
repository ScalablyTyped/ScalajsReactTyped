package typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientMonitoring.anon.AncestorsOfGroup
import typingsJapgolly.maximMazurokGapiClientMonitoring.anon.Callback
import typingsJapgolly.maximMazurokGapiClientMonitoring.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientMonitoring.anon.Recursive
import typingsJapgolly.maximMazurokGapiClientMonitoring.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupsResource extends StObject {
  
  /** Creates a new group. */
  def create(request: QuotaUser): Request[Group] = js.native
  def create(request: UploadType, body: Group): Request[Group] = js.native
  
  /** Deletes an existing group. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Recursive): Request[js.Object] = js.native
  
  /** Gets a single group. */
  def get(): Request[Group] = js.native
  def get(request: Callback): Request[Group] = js.native
  
  /** Lists the existing groups. */
  def list(): Request[ListGroupsResponse] = js.native
  def list(request: AncestorsOfGroup): Request[ListGroupsResponse] = js.native
  
  var members: MembersResource = js.native
  
  /** Updates an existing group. You can change any group attributes except name. */
  def update(request: QuotaUser): Request[Group] = js.native
  def update(request: UploadType, body: Group): Request[Group] = js.native
}
