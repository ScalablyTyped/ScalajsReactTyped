package typingsJapgolly.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.AltCallback
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.CallbackFields
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.MuteConfigId
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.Name
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MuteConfigsResource extends StObject {
  
  def create(request: AltCallback, body: GoogleCloudSecuritycenterV1MuteConfig): Request[GoogleCloudSecuritycenterV1MuteConfig] = js.native
  /** Creates a mute config. */
  def create(request: MuteConfigId): Request[GoogleCloudSecuritycenterV1MuteConfig] = js.native
  
  /** Deletes an existing mute config. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Gets a mute config. */
  def get(): Request[GoogleCloudSecuritycenterV1MuteConfig] = js.native
  def get(request: Name): Request[GoogleCloudSecuritycenterV1MuteConfig] = js.native
  
  /** Lists mute configs. */
  def list(): Request[ListMuteConfigsResponse] = js.native
  def list(request: PageSize): Request[ListMuteConfigsResponse] = js.native
  
  /** Updates a mute config. */
  def patch(request: CallbackFields): Request[GoogleCloudSecuritycenterV1MuteConfig] = js.native
  def patch(request: QuotaUser, body: GoogleCloudSecuritycenterV1MuteConfig): Request[GoogleCloudSecuritycenterV1MuteConfig] = js.native
}
