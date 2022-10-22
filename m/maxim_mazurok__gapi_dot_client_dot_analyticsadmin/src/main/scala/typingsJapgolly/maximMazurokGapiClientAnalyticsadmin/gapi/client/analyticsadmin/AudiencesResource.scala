package typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.AltCallback
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.CallbackFields
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudiencesResource extends StObject {
  
  /** Archives an Audience on a property. */
  def archive(request: AccesstokenAlt): Request[js.Object] = js.native
  def archive(request: Name, body: GoogleAnalyticsAdminV1alphaArchiveAudienceRequest): Request[js.Object] = js.native
  
  /** Creates an Audience. */
  def create(request: AltCallback): Request[GoogleAnalyticsAdminV1alphaAudience] = js.native
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaAudience): Request[GoogleAnalyticsAdminV1alphaAudience] = js.native
  
  /** Lookup for a single Audience. Audiences created before 2020 may not be supported. */
  def get(): Request[GoogleAnalyticsAdminV1alphaAudience] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaAudience] = js.native
  
  /** Lists Audiences on a property. Audiences created before 2020 may not be supported. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListAudiencesResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListAudiencesResponse] = js.native
  
  /** Updates an Audience on a property. */
  def patch(request: CallbackFields): Request[GoogleAnalyticsAdminV1alphaAudience] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaAudience): Request[GoogleAnalyticsAdminV1alphaAudience] = js.native
}
