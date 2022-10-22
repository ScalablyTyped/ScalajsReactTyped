package typingsJapgolly.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdsensehost.anon.AccountId
import typingsJapgolly.maximMazurokGapiClientAdsensehost.anon.AdClientId
import typingsJapgolly.maximMazurokGapiClientAdsensehost.anon.Alt
import typingsJapgolly.maximMazurokGapiClientAdsensehost.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdclientsResource extends StObject {
  
  /** Get information about one of the ad clients in the specified publisher's AdSense account. */
  def get(): Request[AdClient] = js.native
  def get(request: AccountId): Request[AdClient] = js.native
  def get(request: AdClientId): Request[AdClient] = js.native
  
  /** List all hosted ad clients in the specified hosted account. */
  def list(): Request[AdClients] = js.native
  def list(request: Alt): Request[AdClients] = js.native
  def list(request: Fields): Request[AdClients] = js.native
}
