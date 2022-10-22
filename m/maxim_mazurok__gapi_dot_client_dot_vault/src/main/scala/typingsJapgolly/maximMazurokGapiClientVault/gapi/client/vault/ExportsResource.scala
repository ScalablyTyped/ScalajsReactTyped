package typingsJapgolly.maximMazurokGapiClientVault.gapi.client.vault

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientVault.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientVault.anon.Alt
import typingsJapgolly.maximMazurokGapiClientVault.anon.Callback
import typingsJapgolly.maximMazurokGapiClientVault.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportsResource extends StObject {
  
  /** Creates an export. */
  def create(request: Accesstoken): Request[Export] = js.native
  def create(request: Alt, body: Export): Request[Export] = js.native
  
  /** Deletes an export. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets an export. */
  def get(): Request[Export] = js.native
  def get(request: Callback): Request[Export] = js.native
  
  /** Lists details about the exports in the specified matter. */
  def list(): Request[ListExportsResponse] = js.native
  def list(request: Fields): Request[ListExportsResponse] = js.native
}
