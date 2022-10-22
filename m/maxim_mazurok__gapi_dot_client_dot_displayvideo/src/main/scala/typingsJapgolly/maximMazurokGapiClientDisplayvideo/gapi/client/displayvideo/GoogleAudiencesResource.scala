package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsFilter
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.GoogleAudienceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAudiencesResource extends StObject {
  
  /** Gets a Google audience. */
  def get(): Request[GoogleAudience] = js.native
  def get(request: GoogleAudienceId): Request[GoogleAudience] = js.native
  
  /** Lists Google audiences. The order is defined by the order_by parameter. */
  def list(): Request[ListGoogleAudiencesResponse] = js.native
  def list(request: CallbackFieldsFilter): Request[ListGoogleAudiencesResponse] = js.native
}
