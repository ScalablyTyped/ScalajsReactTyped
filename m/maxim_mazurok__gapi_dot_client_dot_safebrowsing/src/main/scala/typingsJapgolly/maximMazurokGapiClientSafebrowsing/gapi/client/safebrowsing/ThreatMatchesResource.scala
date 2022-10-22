package typingsJapgolly.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSafebrowsing.anon.Callback
import typingsJapgolly.maximMazurokGapiClientSafebrowsing.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatMatchesResource extends StObject {
  
  def find(request: Callback, body: GoogleSecuritySafebrowsingV4FindThreatMatchesRequest): Request[GoogleSecuritySafebrowsingV4FindThreatMatchesResponse] = js.native
  /** Finds the threat entries that match the Safe Browsing lists. */
  def find(request: Oauthtoken): Request[GoogleSecuritySafebrowsingV4FindThreatMatchesResponse] = js.native
}
