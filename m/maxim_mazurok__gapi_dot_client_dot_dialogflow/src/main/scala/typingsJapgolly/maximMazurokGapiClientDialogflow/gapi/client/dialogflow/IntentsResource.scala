package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Fields
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.IntentView
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Key
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.UpdateMaskUploadType
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.UploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentsResource extends StObject {
  
  def create(request: Fields, body: GoogleCloudDialogflowCxV3Intent): Request[GoogleCloudDialogflowCxV3Intent] = js.native
  /**
    * Creates an intent in the specified agent. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def create(request: UploadprotocolXgafv): Request[GoogleCloudDialogflowCxV3Intent] = js.native
  
  /**
    * Deletes the specified intent. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Retrieves the specified intent. */
  def get(): Request[GoogleCloudDialogflowCxV3Intent] = js.native
  def get(request: Key): Request[GoogleCloudDialogflowCxV3Intent] = js.native
  
  /** Returns the list of all intents in the specified agent. */
  def list(): Request[GoogleCloudDialogflowCxV3ListIntentsResponse] = js.native
  def list(request: IntentView): Request[GoogleCloudDialogflowCxV3ListIntentsResponse] = js.native
  
  def patch(request: Oauthtoken, body: GoogleCloudDialogflowCxV3Intent): Request[GoogleCloudDialogflowCxV3Intent] = js.native
  /**
    * Updates the specified intent. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def patch(request: UpdateMaskUploadType): Request[GoogleCloudDialogflowCxV3Intent] = js.native
}
