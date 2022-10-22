package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Fields
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Force
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Key
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.LanguageCode
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Name
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Parent
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityTypesResource extends StObject {
  
  /**
    * Creates an entity type in the specified agent. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def create(request: Callback): Request[GoogleCloudDialogflowCxV3EntityType] = js.native
  def create(request: Fields, body: GoogleCloudDialogflowCxV3EntityType): Request[GoogleCloudDialogflowCxV3EntityType] = js.native
  /** Creates a session entity type. */
  def create(request: Parent): Request[GoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def create(request: PrettyPrint, body: GoogleCloudDialogflowCxV3SessionEntityType): Request[GoogleCloudDialogflowCxV3SessionEntityType] = js.native
  
  /**
    * Deletes the specified entity type. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  /** Retrieves the specified entity type. */
  /** Retrieves the specified session entity type. */
  def get(): Request[GoogleCloudDialogflowCxV3EntityType] = js.native
  def get(request: Accesstoken): Request[GoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def get(request: Key): Request[GoogleCloudDialogflowCxV3EntityType] = js.native
  
  /** Returns the list of all entity types in the specified agent. */
  /** Returns the list of all session entity types in the specified session. */
  def list(): Request[GoogleCloudDialogflowCxV3ListEntityTypesResponse] = js.native
  def list(request: LanguageCode): Request[GoogleCloudDialogflowCxV3ListEntityTypesResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudDialogflowCxV3ListSessionEntityTypesResponse] = js.native
  
  /**
    * Updates the specified entity type. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def patch(request: Name): Request[GoogleCloudDialogflowCxV3EntityType] = js.native
  def patch(request: Oauthtoken, body: GoogleCloudDialogflowCxV3EntityType): Request[GoogleCloudDialogflowCxV3EntityType] = js.native
  /** Updates the specified session entity type. */
  def patch(request: QuotaUser): Request[GoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDialogflowCxV3SessionEntityType): Request[GoogleCloudDialogflowCxV3SessionEntityType] = js.native
}
