package typingsJapgolly.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSafebrowsing.anon.Callback
import typingsJapgolly.maximMazurokGapiClientSafebrowsing.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatListUpdatesResource extends StObject {
  
  def fetch(request: Callback, body: GoogleSecuritySafebrowsingV4FetchThreatListUpdatesRequest): Request[GoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse] = js.native
  /** Fetches the most recent threat list updates. A client can request updates for multiple lists at once. */
  def fetch(request: Key): Request[GoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse] = js.native
}
