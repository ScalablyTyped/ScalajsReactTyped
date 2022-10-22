package typingsJapgolly.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.AccesstokenAltCallback
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Alt
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.AltCallbackFields
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Callback
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPermissionsResource extends StObject {
  
  /** Creates a user's Account & Container access. */
  def create(request: AccesstokenAltCallback): Request[UserPermission] = js.native
  def create(request: Alt, body: UserPermission): Request[UserPermission] = js.native
  
  /** Removes a user from the account, revoking access to it and all of its containers. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a user's Account & Container access. */
  def get(): Request[UserPermission] = js.native
  def get(request: Callback): Request[UserPermission] = js.native
  
  /** List all users that have access to the account along with Account and Container user access granted to each of them. */
  def list(): Request[ListUserPermissionsResponse] = js.native
  def list(request: Fields): Request[ListUserPermissionsResponse] = js.native
  
  /** Updates a user's Account & Container access. */
  def update(request: AltCallbackFields): Request[UserPermission] = js.native
  def update(request: Callback, body: UserPermission): Request[UserPermission] = js.native
}
