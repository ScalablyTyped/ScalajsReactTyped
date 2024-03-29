package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPermissionGroupsResource extends StObject {
  
  /** Gets one account permission group by ID. */
  def get(): Request[AccountPermissionGroup] = js.native
  def get(request: Alt): Request[AccountPermissionGroup] = js.native
  
  /** Retrieves the list of account permission groups. */
  def list(): Request[AccountPermissionGroupsListResponse] = js.native
  def list(request: Callback): Request[AccountPermissionGroupsListResponse] = js.native
}
