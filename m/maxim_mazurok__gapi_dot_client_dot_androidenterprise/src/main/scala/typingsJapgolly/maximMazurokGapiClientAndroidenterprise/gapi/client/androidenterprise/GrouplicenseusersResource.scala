package typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.anon.GroupLicenseId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrouplicenseusersResource extends StObject {
  
  /** Retrieves the IDs of the users who have been granted entitlements under the license. */
  def list(): Request[GroupLicenseUsersListResponse] = js.native
  def list(request: GroupLicenseId): Request[GroupLicenseUsersListResponse] = js.native
}
