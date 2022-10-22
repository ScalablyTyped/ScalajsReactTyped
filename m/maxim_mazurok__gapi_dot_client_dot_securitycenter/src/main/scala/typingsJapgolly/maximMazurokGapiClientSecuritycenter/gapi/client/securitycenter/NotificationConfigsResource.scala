package typingsJapgolly.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.CallbackConfigId
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.ConfigId
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.Name
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.NameOauthtoken
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationConfigsResource extends StObject {
  
  def create(request: CallbackConfigId, body: NotificationConfig): Request[NotificationConfig] = js.native
  /** Creates a notification config. */
  def create(request: ConfigId): Request[NotificationConfig] = js.native
  
  /** Deletes a notification config. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Gets a notification config. */
  def get(): Request[NotificationConfig] = js.native
  def get(request: Name): Request[NotificationConfig] = js.native
  
  /** Lists notification configs. */
  def list(): Request[ListNotificationConfigsResponse] = js.native
  def list(request: PageSize): Request[ListNotificationConfigsResponse] = js.native
  
  /** Updates a notification config. The following update fields are allowed: description, pubsub_topic, streaming_config.filter */
  def patch(request: NameOauthtoken): Request[NotificationConfig] = js.native
  def patch(request: QuotaUser, body: NotificationConfig): Request[NotificationConfig] = js.native
}
