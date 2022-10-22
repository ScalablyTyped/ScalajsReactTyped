package typingsJapgolly.maximMazurokGapiClientAdsense.gapi.client.adsense

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdsense.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentsResource extends StObject {
  
  /** Lists all the payments available for an account. */
  def list(): Request[ListPaymentsResponse] = js.native
  def list(request: Fields): Request[ListPaymentsResponse] = js.native
}
