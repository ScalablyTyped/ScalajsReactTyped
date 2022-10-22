package typingsJapgolly.maximMazurokGapiClientFile.gapi.client.file

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientFile.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientFile.anon.Alt
import typingsJapgolly.maximMazurokGapiClientFile.anon.Callback
import typingsJapgolly.maximMazurokGapiClientFile.anon.Fields
import typingsJapgolly.maximMazurokGapiClientFile.anon.Key
import typingsJapgolly.maximMazurokGapiClientFile.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupsResource extends StObject {
  
  /** Creates a backup. */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: Backup): Request[Operation] = js.native
  
  /** Deletes a backup. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets the details of a specific backup. */
  def get(): Request[Backup] = js.native
  def get(request: Callback): Request[Backup] = js.native
  
  /** Lists all backups in a project for either a specified location or for all locations. */
  def list(): Request[ListBackupsResponse] = js.native
  def list(request: Fields): Request[ListBackupsResponse] = js.native
  
  /** Updates the settings of a specific backup. */
  def patch(request: Key): Request[Operation] = js.native
  def patch(request: Name, body: Backup): Request[Operation] = js.native
}
