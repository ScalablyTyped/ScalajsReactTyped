package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.CategoryId
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.Part
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends StObject {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[ChannelListResponse] = js.native
  def list(request: CategoryId): Request[ChannelListResponse] = js.native
  
  /** Updates an existing resource. */
  def update(request: Part): Request[Channel] = js.native
  def update(request: PrettyPrint, body: Channel): Request[Channel] = js.native
}
