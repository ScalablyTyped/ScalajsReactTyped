package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Fields
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Force
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Key
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.LanguageCode
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.LanguageCodeOauthtoken
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.NameOauthtoken
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionRouteGroupsResource extends StObject {
  
  def create(request: Fields, body: GoogleCloudDialogflowCxV3TransitionRouteGroup): Request[GoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  /**
    * Creates an TransitionRouteGroup in the specified flow. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def create(request: LanguageCodeOauthtoken): Request[GoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  
  /**
    * Deletes the specified TransitionRouteGroup. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  /** Retrieves the specified TransitionRouteGroup. */
  def get(): Request[GoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def get(request: Key): Request[GoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  
  /** Returns the list of all transition route groups in the specified flow. */
  def list(): Request[GoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse] = js.native
  def list(request: LanguageCode): Request[GoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse] = js.native
  
  /**
    * Updates the specified TransitionRouteGroup. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def patch(request: NameOauthtoken): Request[GoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def patch(request: Oauthtoken, body: GoogleCloudDialogflowCxV3TransitionRouteGroup): Request[GoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
}
