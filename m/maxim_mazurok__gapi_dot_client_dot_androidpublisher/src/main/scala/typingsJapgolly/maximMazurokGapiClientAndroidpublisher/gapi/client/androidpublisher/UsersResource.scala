package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.KeyName
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.Name
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.OauthtokenPageSize
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.OauthtokenParent
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends StObject {
  
  /** Grant access for a user to the given developer account. */
  def create(request: OauthtokenParent): Request[User] = js.native
  def create(request: Xgafv, body: User): Request[User] = js.native
  
  /** Removes all access for the user to the given developer account. */
  def delete(): Request[Unit] = js.native
  def delete(request: Name): Request[Unit] = js.native
  
  /** Lists all users with access to a developer account. */
  def list(): Request[ListUsersResponse] = js.native
  def list(request: OauthtokenPageSize): Request[ListUsersResponse] = js.native
  
  def patch(request: AccesstokenAlt, body: User): Request[User] = js.native
  /** Updates access for the user to the developer account. */
  def patch(request: KeyName): Request[User] = js.native
}
