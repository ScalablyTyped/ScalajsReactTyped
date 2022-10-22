package typingsJapgolly.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSafebrowsing.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatListsResource extends StObject {
  
  /** Lists the Safe Browsing threat lists available for download. */
  def list(): Request[GoogleSecuritySafebrowsingV4ListThreatListsResponse] = js.native
  def list(request: Callback): Request[GoogleSecuritySafebrowsingV4ListThreatListsResponse] = js.native
}
