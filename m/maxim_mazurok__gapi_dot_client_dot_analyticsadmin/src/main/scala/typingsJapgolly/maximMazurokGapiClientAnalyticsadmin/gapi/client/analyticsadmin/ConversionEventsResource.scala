package typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversionEventsResource extends StObject {
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaConversionEvent): Request[GoogleAnalyticsAdminV1alphaConversionEvent] = js.native
  /** Creates a conversion event with the specified attributes. */
  def create(request: FieldsKey): Request[GoogleAnalyticsAdminV1alphaConversionEvent] = js.native
  
  /** Deletes a conversion event in a property. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Retrieve a single conversion event. */
  def get(): Request[GoogleAnalyticsAdminV1alphaConversionEvent] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaConversionEvent] = js.native
  
  /** Returns a list of conversion events in the specified parent property. Returns an empty list if no conversion events are found. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListConversionEventsResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListConversionEventsResponse] = js.native
}
