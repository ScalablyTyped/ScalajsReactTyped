package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.Hl
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.OnBehalfOfContentOwnerChannel
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.Resource
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelSectionsResource extends StObject {
  
  /** Deletes a resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: QuotaUser): Request[Unit] = js.native
  
  /** Inserts a new resource into this collection. */
  def insert(request: OnBehalfOfContentOwnerChannel): Request[ChannelSection] = js.native
  def insert(request: UploadType, body: ChannelSection): Request[ChannelSection] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[ChannelSectionListResponse] = js.native
  def list(request: Hl): Request[ChannelSectionListResponse] = js.native
  
  def update(request: PrettyPrint, body: ChannelSection): Request[ChannelSection] = js.native
  /** Updates an existing resource. */
  def update(request: Resource): Request[ChannelSection] = js.native
}
