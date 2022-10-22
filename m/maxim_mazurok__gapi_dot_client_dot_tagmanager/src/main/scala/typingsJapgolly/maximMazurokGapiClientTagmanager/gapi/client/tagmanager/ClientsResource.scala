package typingsJapgolly.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Alt
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Callback
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Fields
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Resource
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientsResource extends StObject {
  
  def create(request: Alt, body: Client): Request[Client] = js.native
  /** Creates a GTM Client. */
  def create(request: Resource): Request[Client] = js.native
  
  /** Deletes a GTM Client. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a GTM Client. */
  def get(): Request[Client] = js.native
  def get(request: Callback): Request[Client] = js.native
  
  /** Lists all GTM Clients of a GTM container workspace. */
  def list(): Request[ListClientsResponse] = js.native
  def list(request: Fields): Request[ListClientsResponse] = js.native
  
  /** Reverts changes to a GTM Client in a GTM Workspace. */
  def revert(): Request[RevertClientResponse] = js.native
  def revert(request: Oauthtoken): Request[RevertClientResponse] = js.native
  
  def update(request: Oauthtoken, body: Client): Request[Client] = js.native
  /** Updates a GTM Client. */
  def update(request: UploadType): Request[Client] = js.native
}
