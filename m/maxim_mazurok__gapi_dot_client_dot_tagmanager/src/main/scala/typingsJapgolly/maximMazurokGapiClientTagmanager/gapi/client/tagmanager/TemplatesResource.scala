package typingsJapgolly.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Alt
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Callback
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.CallbackFields
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Fields
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.FieldsFingerprint
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplatesResource extends StObject {
  
  def create(request: Alt, body: CustomTemplate): Request[CustomTemplate] = js.native
  /** Creates a GTM Custom Template. */
  def create(request: CallbackFields): Request[CustomTemplate] = js.native
  
  /** Deletes a GTM Template. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a GTM Template. */
  def get(): Request[CustomTemplate] = js.native
  def get(request: Callback): Request[CustomTemplate] = js.native
  
  /** Lists all GTM Templates of a GTM container workspace. */
  def list(): Request[ListTemplatesResponse] = js.native
  def list(request: Fields): Request[ListTemplatesResponse] = js.native
  
  /** Reverts changes to a GTM Template in a GTM Workspace. */
  def revert(): Request[RevertTemplateResponse] = js.native
  def revert(request: Oauthtoken): Request[RevertTemplateResponse] = js.native
  
  /** Updates a GTM Template. */
  def update(request: FieldsFingerprint): Request[CustomTemplate] = js.native
  def update(request: Oauthtoken, body: CustomTemplate): Request[CustomTemplate] = js.native
}
