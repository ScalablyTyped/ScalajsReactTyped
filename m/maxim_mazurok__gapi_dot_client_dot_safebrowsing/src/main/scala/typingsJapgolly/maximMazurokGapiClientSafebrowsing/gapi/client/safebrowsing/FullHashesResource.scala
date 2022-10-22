package typingsJapgolly.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSafebrowsing.anon.Alt
import typingsJapgolly.maximMazurokGapiClientSafebrowsing.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullHashesResource extends StObject {
  
  /** Finds the full hashes that match the requested hash prefixes. */
  def find(request: Alt): Request[GoogleSecuritySafebrowsingV4FindFullHashesResponse] = js.native
  def find(request: Callback, body: GoogleSecuritySafebrowsingV4FindFullHashesRequest): Request[GoogleSecuritySafebrowsingV4FindFullHashesResponse] = js.native
}
