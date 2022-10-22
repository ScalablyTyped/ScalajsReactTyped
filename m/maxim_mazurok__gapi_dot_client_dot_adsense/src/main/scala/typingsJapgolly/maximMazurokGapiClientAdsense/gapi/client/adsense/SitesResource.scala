package typingsJapgolly.maximMazurokGapiClientAdsense.gapi.client.adsense

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdsense.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientAdsense.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitesResource extends StObject {
  
  /** Gets information about the selected site. */
  def get(): Request[Site] = js.native
  def get(request: Accesstoken): Request[Site] = js.native
  
  /** Lists all the sites available in an account. */
  def list(): Request[ListSitesResponse] = js.native
  def list(request: Alt): Request[ListSitesResponse] = js.native
}
