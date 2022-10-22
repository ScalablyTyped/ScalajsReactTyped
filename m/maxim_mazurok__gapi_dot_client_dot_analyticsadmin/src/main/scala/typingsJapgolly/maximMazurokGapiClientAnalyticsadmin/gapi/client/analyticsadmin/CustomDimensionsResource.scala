package typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.KeyName
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.NameOauthtoken
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDimensionsResource extends StObject {
  
  /** Archives a CustomDimension on a property. */
  def archive(request: KeyName): Request[js.Object] = js.native
  def archive(request: Name, body: GoogleAnalyticsAdminV1alphaArchiveCustomDimensionRequest): Request[js.Object] = js.native
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaCustomDimension): Request[GoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  /** Creates a CustomDimension. */
  def create(request: KeyOauthtoken): Request[GoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  
  /** Lookup for a single CustomDimension. */
  def get(): Request[GoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  
  /** Lists CustomDimensions on a property. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListCustomDimensionsResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListCustomDimensionsResponse] = js.native
  
  /** Updates a CustomDimension on a property. */
  def patch(request: NameOauthtoken): Request[GoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaCustomDimension): Request[GoogleAnalyticsAdminV1alphaCustomDimension] = js.native
}
