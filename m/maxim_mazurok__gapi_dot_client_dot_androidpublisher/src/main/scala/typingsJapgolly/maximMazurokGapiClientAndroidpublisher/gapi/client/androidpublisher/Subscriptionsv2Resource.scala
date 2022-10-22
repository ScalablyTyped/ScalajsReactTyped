package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.TokenUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscriptionsv2Resource extends StObject {
  
  /** Get metadata about a subscription */
  def get(): Request[SubscriptionPurchaseV2] = js.native
  def get(request: TokenUploadType): Request[SubscriptionPurchaseV2] = js.native
}
