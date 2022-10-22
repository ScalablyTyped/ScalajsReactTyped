package typingsJapgolly.maximMazurokGapiClientAdsense.gapi.client.adsense

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdsense.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertsResource extends StObject {
  
  /** Lists all the alerts available in an account. */
  def list(): Request[ListAlertsResponse] = js.native
  def list(request: Callback): Request[ListAlertsResponse] = js.native
}
