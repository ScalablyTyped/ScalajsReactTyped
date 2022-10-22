package typingsJapgolly.maximMazurokGapiClientFile.gapi.client.file

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientFile.anon.Callback
import typingsJapgolly.maximMazurokGapiClientFile.anon.Fields
import typingsJapgolly.maximMazurokGapiClientFile.anon.Name
import typingsJapgolly.maximMazurokGapiClientFile.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientFile.anon.Parent
import typingsJapgolly.maximMazurokGapiClientFile.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotsResource extends StObject {
  
  /** Creates a snapshot. */
  def create(request: Oauthtoken): Request[Operation] = js.native
  def create(request: Parent, body: Snapshot): Request[Operation] = js.native
  
  /** Deletes a snapshot. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets the details of a specific snapshot. */
  def get(): Request[Snapshot] = js.native
  def get(request: Callback): Request[Snapshot] = js.native
  
  /** Lists all snapshots in a project for either a specified location or for all locations. */
  def list(): Request[ListSnapshotsResponse] = js.native
  def list(request: Fields): Request[ListSnapshotsResponse] = js.native
  
  def patch(request: Name, body: Snapshot): Request[Operation] = js.native
  /** Updates the settings of a specific snapshot. */
  def patch(request: PrettyPrint): Request[Operation] = js.native
}
