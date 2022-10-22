package typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.OauthtokenParent
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.PrettyPrintQuotaUser
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomMetricsResource extends StObject {
  
  def archive(request: Name, body: GoogleAnalyticsAdminV1alphaArchiveCustomMetricRequest): Request[js.Object] = js.native
  /** Archives a CustomMetric on a property. */
  def archive(request: OauthtokenPrettyPrint): Request[js.Object] = js.native
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaCustomMetric): Request[GoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  /** Creates a CustomMetric. */
  def create(request: OauthtokenParent): Request[GoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  
  /** Lookup for a single CustomMetric. */
  def get(): Request[GoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  
  /** Lists CustomMetrics on a property. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListCustomMetricsResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListCustomMetricsResponse] = js.native
  
  /** Updates a CustomMetric on a property. */
  def patch(request: PrettyPrintQuotaUser): Request[GoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaCustomMetric): Request[GoogleAnalyticsAdminV1alphaCustomMetric] = js.native
}
