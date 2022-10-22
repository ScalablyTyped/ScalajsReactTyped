package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRolePermissionGroupsResource extends StObject {
  
  /** Gets one user role permission group by ID. */
  def get(): Request[UserRolePermissionGroup] = js.native
  def get(request: Alt): Request[UserRolePermissionGroup] = js.native
  
  /** Gets a list of all supported user role permission groups. */
  def list(): Request[UserRolePermissionGroupsListResponse] = js.native
  def list(request: Callback): Request[UserRolePermissionGroupsListResponse] = js.native
}
