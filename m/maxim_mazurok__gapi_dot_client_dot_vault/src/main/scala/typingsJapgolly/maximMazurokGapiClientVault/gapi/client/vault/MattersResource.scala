package typingsJapgolly.maximMazurokGapiClientVault.gapi.client.vault

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientVault.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientVault.anon.Alt
import typingsJapgolly.maximMazurokGapiClientVault.anon.AltCallback
import typingsJapgolly.maximMazurokGapiClientVault.anon.CallbackFields
import typingsJapgolly.maximMazurokGapiClientVault.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientVault.anon.KeyMatterId
import typingsJapgolly.maximMazurokGapiClientVault.anon.MatterIdOauthtoken
import typingsJapgolly.maximMazurokGapiClientVault.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientVault.anon.PageToken
import typingsJapgolly.maximMazurokGapiClientVault.anon.Uploadprotocol
import typingsJapgolly.maximMazurokGapiClientVault.anon.View
import typingsJapgolly.maximMazurokGapiClientVault.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MattersResource extends StObject {
  
  def addPermissions(request: Alt, body: AddMatterPermissionsRequest): Request[MatterPermission] = js.native
  /** Adds an account as a matter collaborator. */
  def addPermissions(request: Uploadprotocol): Request[MatterPermission] = js.native
  
  def close(request: Alt, body: CloseMatterRequest): Request[CloseMatterResponse] = js.native
  /** Closes the specified matter. Returns the matter with updated state. */
  def close(request: Xgafv): Request[CloseMatterResponse] = js.native
  
  /** Counts the accounts processed by the specified query. */
  def count(request: AccesstokenAlt): Request[Operation] = js.native
  def count(request: Alt, body: CountArtifactsRequest): Request[Operation] = js.native
  
  /** Creates a matter with the given name and description. The initial state is open, and the owner is the method caller. Returns the created matter with default view. */
  def create(request: AltCallback): Request[Matter] = js.native
  def create(request: CallbackFields, body: Matter): Request[Matter] = js.native
  
  /** Deletes the specified matter. Returns the matter with updated state. */
  def delete(): Request[Matter] = js.native
  def delete(request: Alt): Request[Matter] = js.native
  
  var exports: ExportsResource = js.native
  
  /** Gets the specified matter. */
  def get(): Request[Matter] = js.native
  def get(request: View): Request[Matter] = js.native
  
  var holds: HoldsResource = js.native
  
  /** Lists matters the requestor has access to. */
  def list(): Request[ListMattersResponse] = js.native
  def list(request: PageToken): Request[ListMattersResponse] = js.native
  
  def removePermissions(request: Alt, body: RemoveMatterPermissionsRequest): Request[js.Object] = js.native
  /** Removes an account as a matter collaborator. */
  def removePermissions(request: FieldsKey): Request[js.Object] = js.native
  
  def reopen(request: Alt, body: ReopenMatterRequest): Request[ReopenMatterResponse] = js.native
  /** Reopens the specified matter. Returns the matter with updated state. */
  def reopen(request: KeyMatterId): Request[ReopenMatterResponse] = js.native
  
  var savedQueries: SavedQueriesResource = js.native
  
  def undelete(request: Alt, body: UndeleteMatterRequest): Request[Matter] = js.native
  /** Undeletes the specified matter. Returns the matter with updated state. */
  def undelete(request: MatterIdOauthtoken): Request[Matter] = js.native
  
  def update(request: Alt, body: Matter): Request[Matter] = js.native
  /**
    * Updates the specified matter. This updates only the name and description of the matter, identified by matter ID. Changes to any other fields are ignored. Returns the default view of
    * the matter.
    */
  def update(request: OauthtokenPrettyPrint): Request[Matter] = js.native
}
