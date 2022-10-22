package typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.CallbackFieldsKey
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseLinksResource extends StObject {
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaFirebaseLink): Request[GoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
  /** Creates a FirebaseLink. Properties can have at most one FirebaseLink. */
  def create(request: CallbackFieldsKey): Request[GoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
  
  /** Deletes a FirebaseLink on a property */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lists FirebaseLinks on a property. Properties can have at most one FirebaseLink. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse] = js.native
}
