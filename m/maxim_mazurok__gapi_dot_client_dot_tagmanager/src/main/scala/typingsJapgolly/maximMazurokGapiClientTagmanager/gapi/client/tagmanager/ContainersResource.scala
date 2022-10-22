package typingsJapgolly.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Alt
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Callback
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Fields
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.UploadTypeUploadprotocol
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.UploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainersResource extends StObject {
  
  def create(request: Alt, body: Container): Request[Container] = js.native
  /** Creates a Container. */
  def create(request: UploadTypeUploadprotocol): Request[Container] = js.native
  
  /** Deletes a Container. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  var environments: EnvironmentsResource = js.native
  
  /** Gets a Container. */
  def get(): Request[Container] = js.native
  def get(request: Callback): Request[Container] = js.native
  
  /** Lists all Containers that belongs to a GTM Account. */
  def list(): Request[ListContainersResponse] = js.native
  def list(request: Fields): Request[ListContainersResponse] = js.native
  
  def update(request: Oauthtoken, body: Container): Request[Container] = js.native
  /** Updates a Container. */
  def update(request: UploadprotocolXgafv): Request[Container] = js.native
  
  var version_headers: VersionHeadersResource = js.native
  
  var versions: VersionsResource = js.native
  
  var workspaces: WorkspacesResource = js.native
}
