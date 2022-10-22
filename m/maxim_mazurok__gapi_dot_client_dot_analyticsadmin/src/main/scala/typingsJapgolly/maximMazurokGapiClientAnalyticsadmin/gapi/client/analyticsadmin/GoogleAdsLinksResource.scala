package typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.FieldsKeyName
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.FieldsKeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAdsLinksResource extends StObject {
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaGoogleAdsLink): Request[GoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  /** Creates a GoogleAdsLink. */
  def create(request: FieldsKeyOauthtoken): Request[GoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  
  /** Deletes a GoogleAdsLink on a property */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lists GoogleAdsLinks on a property. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse] = js.native
  
  /** Updates a GoogleAdsLink on a property */
  def patch(request: FieldsKeyName): Request[GoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaGoogleAdsLink): Request[GoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
}
