package typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDrive.anon.AllowItemDeletion
import typingsJapgolly.maximMazurokGapiClientDrive.anon.PageToken
import typingsJapgolly.maximMazurokGapiClientDrive.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientDrive.anon.RequestId
import typingsJapgolly.maximMazurokGapiClientDrive.anon.Resource
import typingsJapgolly.maximMazurokGapiClientDrive.anon.UseDomainAdminAccess
import typingsJapgolly.maximMazurokGapiClientDrive.anon.UserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrivesResource extends StObject {
  
  /** Creates a new shared drive. */
  def create(request: QuotaUser): Request[Drive] = js.native
  def create(request: RequestId, body: Drive): Request[Drive] = js.native
  
  /** Permanently deletes a shared drive for which the user is an organizer. The shared drive cannot contain any untrashed items. */
  def delete(): Request[Unit] = js.native
  def delete(request: AllowItemDeletion): Request[Unit] = js.native
  
  /** Gets a shared drive's metadata by ID. */
  def get(): Request[Drive] = js.native
  def get(request: UseDomainAdminAccess): Request[Drive] = js.native
  
  /** Hides a shared drive from the default view. */
  def hide(): Request[Drive] = js.native
  def hide(request: UserIp): Request[Drive] = js.native
  
  /** Lists the user's shared drives. */
  def list(): Request[DriveList] = js.native
  def list(request: PageToken): Request[DriveList] = js.native
  
  /** Restores a shared drive to the default view. */
  def unhide(): Request[Drive] = js.native
  def unhide(request: UserIp): Request[Drive] = js.native
  
  /** Updates the metadate for a shared drive. */
  def update(request: Resource): Request[Drive] = js.native
  def update(request: UseDomainAdminAccess, body: Drive): Request[Drive] = js.native
}
