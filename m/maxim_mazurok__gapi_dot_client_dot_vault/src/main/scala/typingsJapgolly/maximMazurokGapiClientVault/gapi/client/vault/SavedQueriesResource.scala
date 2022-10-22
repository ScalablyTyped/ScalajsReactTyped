package typingsJapgolly.maximMazurokGapiClientVault.gapi.client.vault

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientVault.anon.Alt
import typingsJapgolly.maximMazurokGapiClientVault.anon.Fields
import typingsJapgolly.maximMazurokGapiClientVault.anon.SavedQueryId
import typingsJapgolly.maximMazurokGapiClientVault.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedQueriesResource extends StObject {
  
  def create(request: Alt, body: SavedQuery): Request[SavedQuery] = js.native
  /** Creates a saved query. */
  def create(request: UploadType): Request[SavedQuery] = js.native
  
  /** Deletes the specified saved query. */
  def delete(): Request[js.Object] = js.native
  def delete(request: SavedQueryId): Request[js.Object] = js.native
  
  /** Retrieves the specified saved query. */
  def get(): Request[SavedQuery] = js.native
  def get(request: SavedQueryId): Request[SavedQuery] = js.native
  
  /** Lists the saved queries in a matter. */
  def list(): Request[ListSavedQueriesResponse] = js.native
  def list(request: Fields): Request[ListSavedQueriesResponse] = js.native
}
