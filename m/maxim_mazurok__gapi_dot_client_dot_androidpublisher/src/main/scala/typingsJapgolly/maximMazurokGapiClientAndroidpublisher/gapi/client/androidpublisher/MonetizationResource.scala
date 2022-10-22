package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.QuotaUserResource
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonetizationResource extends StObject {
  
  /** Calculates the region prices, using today's exchange rate and country-specific pricing patterns, based on the price in the request for a set of regions. */
  def convertRegionPrices(request: QuotaUserResource): Request[ConvertRegionPricesResponse] = js.native
  def convertRegionPrices(request: Uploadprotocol, body: ConvertRegionPricesRequest): Request[ConvertRegionPricesResponse] = js.native
  
  var subscriptions: SubscriptionsResource = js.native
}
