package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.FieldsIds
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.ProfileIdQuotaUserResource
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.QuotaUserResourceUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightConfigurationsResource extends StObject {
  
  /** Gets one floodlight configuration by ID. */
  def get(): Request[FloodlightConfiguration] = js.native
  def get(request: Alt): Request[FloodlightConfiguration] = js.native
  
  /** Retrieves a list of floodlight configurations, possibly filtered. */
  def list(): Request[FloodlightConfigurationsListResponse] = js.native
  def list(request: FieldsIds): Request[FloodlightConfigurationsListResponse] = js.native
  
  def patch(request: Alt, body: FloodlightConfiguration): Request[FloodlightConfiguration] = js.native
  /** Updates an existing floodlight configuration. This method supports patch semantics. */
  def patch(request: ProfileIdQuotaUserResource): Request[FloodlightConfiguration] = js.native
  
  def update(request: Callback, body: FloodlightConfiguration): Request[FloodlightConfiguration] = js.native
  /** Updates an existing floodlight configuration. */
  def update(request: QuotaUserResourceUploadType): Request[FloodlightConfiguration] = js.native
}
