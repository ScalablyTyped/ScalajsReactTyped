package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.CallbackExternalChannelId
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.ExternalChannelIdFields
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.LinkingToken
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyLinksResource extends StObject {
  
  /** Deletes a resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: LinkingToken): Request[Unit] = js.native
  
  def insert(request: CallbackExternalChannelId, body: ThirdPartyLink): Request[ThirdPartyLink] = js.native
  /** Inserts a new resource into this collection. */
  def insert(request: ExternalChannelIdFields): Request[ThirdPartyLink] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[ThirdPartyLinkListResponse] = js.native
  def list(request: Type): Request[ThirdPartyLinkListResponse] = js.native
  
  def update(request: CallbackExternalChannelId, body: ThirdPartyLink): Request[ThirdPartyLink] = js.native
  /** Updates an existing resource. */
  def update(request: ExternalChannelIdFields): Request[ThirdPartyLink] = js.native
}
