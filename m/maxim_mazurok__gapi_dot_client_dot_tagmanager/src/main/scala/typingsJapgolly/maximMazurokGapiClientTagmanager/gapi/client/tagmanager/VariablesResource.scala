package typingsJapgolly.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Alt
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Callback
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Fields
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.OauthtokenPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariablesResource extends StObject {
  
  def create(request: Alt, body: Variable): Request[Variable] = js.native
  /** Creates a GTM Variable. */
  def create(request: KeyOauthtoken): Request[Variable] = js.native
  
  /** Deletes a GTM Variable. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a GTM Variable. */
  def get(): Request[Variable] = js.native
  def get(request: Callback): Request[Variable] = js.native
  
  /** Lists all GTM Variables of a Container. */
  def list(): Request[ListVariablesResponse] = js.native
  def list(request: Fields): Request[ListVariablesResponse] = js.native
  
  /** Reverts changes to a GTM Variable in a GTM Workspace. */
  def revert(): Request[RevertVariableResponse] = js.native
  def revert(request: Oauthtoken): Request[RevertVariableResponse] = js.native
  
  /** Updates a GTM Variable. */
  def update(request: OauthtokenPath): Request[Variable] = js.native
  def update(request: Oauthtoken, body: Variable): Request[Variable] = js.native
}
