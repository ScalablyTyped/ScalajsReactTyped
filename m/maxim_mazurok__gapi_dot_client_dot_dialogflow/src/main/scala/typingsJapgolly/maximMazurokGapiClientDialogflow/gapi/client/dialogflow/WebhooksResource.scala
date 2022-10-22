package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Force
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.NameOauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.OauthtokenParentPrettyPrint
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhooksResource extends StObject {
  
  /** Creates a webhook in the specified agent. */
  def create(request: OauthtokenParentPrettyPrint): Request[GoogleCloudDialogflowCxV3Webhook] = js.native
  def create(request: PrettyPrint, body: GoogleCloudDialogflowCxV3Webhook): Request[GoogleCloudDialogflowCxV3Webhook] = js.native
  
  /** Deletes the specified webhook. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  /** Retrieves the specified webhook. */
  def get(): Request[GoogleCloudDialogflowCxV3Webhook] = js.native
  def get(request: Accesstoken): Request[GoogleCloudDialogflowCxV3Webhook] = js.native
  
  /** Returns the list of all webhooks in the specified agent. */
  def list(): Request[GoogleCloudDialogflowCxV3ListWebhooksResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudDialogflowCxV3ListWebhooksResponse] = js.native
  
  /** Updates the specified webhook. */
  def patch(request: NameOauthtokenPrettyPrint): Request[GoogleCloudDialogflowCxV3Webhook] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDialogflowCxV3Webhook): Request[GoogleCloudDialogflowCxV3Webhook] = js.native
}
