package typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.ResourceUpdateMask
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.ResourceUploadType
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataStreamsResource extends StObject {
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaDataStream): Request[GoogleAnalyticsAdminV1alphaDataStream] = js.native
  /** Creates a DataStream. */
  def create(request: ResourceUploadType): Request[GoogleAnalyticsAdminV1alphaDataStream] = js.native
  
  /** Deletes a DataStream on a property. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lookup for a single DataStream. */
  def get(): Request[GoogleAnalyticsAdminV1alphaDataStream] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaDataStream] = js.native
  
  /** Returns the Site Tag for the specified web stream. Site Tags are immutable singletons. */
  def getGlobalSiteTag(): Request[GoogleAnalyticsAdminV1alphaGlobalSiteTag] = js.native
  def getGlobalSiteTag(request: Name): Request[GoogleAnalyticsAdminV1alphaGlobalSiteTag] = js.native
  
  /** Lists DataStreams on a property. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListDataStreamsResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListDataStreamsResponse] = js.native
  
  var measurementProtocolSecrets: MeasurementProtocolSecretsResource = js.native
  
  /** Updates a DataStream on a property. */
  def patch(request: ResourceUpdateMask): Request[GoogleAnalyticsAdminV1alphaDataStream] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaDataStream): Request[GoogleAnalyticsAdminV1alphaDataStream] = js.native
}
