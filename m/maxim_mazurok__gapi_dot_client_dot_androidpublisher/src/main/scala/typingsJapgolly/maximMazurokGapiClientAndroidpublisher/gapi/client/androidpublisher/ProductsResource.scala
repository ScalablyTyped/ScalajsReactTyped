package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.QuotaUserToken
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.ResourceToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsResource extends StObject {
  
  def acknowledge(request: QuotaUserToken, body: ProductPurchasesAcknowledgeRequest): Request[Unit] = js.native
  /** Acknowledges a purchase of an inapp item. */
  def acknowledge(request: ResourceToken): Request[Unit] = js.native
  
  /** Checks the purchase and consumption status of an inapp item. */
  def get(): Request[ProductPurchase] = js.native
  def get(request: QuotaUserToken): Request[ProductPurchase] = js.native
}
