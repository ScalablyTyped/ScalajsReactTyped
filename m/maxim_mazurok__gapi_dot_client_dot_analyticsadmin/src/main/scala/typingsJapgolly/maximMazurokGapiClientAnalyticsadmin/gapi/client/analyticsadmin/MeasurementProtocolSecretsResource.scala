package typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.ParentPrettyPrint
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.QuotaUserResource
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeasurementProtocolSecretsResource extends StObject {
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret): Request[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  /** Creates a measurement protocol secret. */
  def create(request: ParentPrettyPrint): Request[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  
  /** Deletes target MeasurementProtocolSecret. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lookup for a single "GA4" MeasurementProtocolSecret. */
  def get(): Request[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  
  /** Returns child MeasurementProtocolSecrets under the specified parent Property. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse] = js.native
  
  /** Updates a measurement protocol secret. */
  def patch(request: QuotaUserResource): Request[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret): Request[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
}
