package typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSummariesResource extends StObject {
  
  /** Returns summaries of all accounts accessible by the caller. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListAccountSummariesResponse] = js.native
  def list(request: Xgafv): Request[GoogleAnalyticsAdminV1alphaListAccountSummariesResponse] = js.native
}
