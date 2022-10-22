package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.Key
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.OauthtokenPrettyPrintQuotaUser
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.ParentPrettyPrintQuotaUser
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.PrettyPrintQuotaUserResource
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.QuotaUserResourceUploadType
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.ResourceUploadTypeUploadprotocol
import typingsJapgolly.maximMazurokGapiClientDialogflow.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentsResource extends StObject {
  
  var changelogs: ChangelogsResource = js.native
  
  /**
    * Creates an agent in the specified location. Note: You should always train flows prior to sending them queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def create(request: ParentPrettyPrintQuotaUser): Request[GoogleCloudDialogflowCxV3Agent] = js.native
  def create(request: PrettyPrint, body: GoogleCloudDialogflowCxV3Agent): Request[GoogleCloudDialogflowCxV3Agent] = js.native
  
  /** Deletes the specified agent. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  var entityTypes: EntityTypesResource = js.native
  
  var environments: EnvironmentsResource = js.native
  
  def `export`(request: Accesstoken, body: GoogleCloudDialogflowCxV3ExportAgentRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Exports the specified agent to a binary file. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned
    * `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct
    * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: ExportAgentResponse
    */
  def `export`(request: OauthtokenPrettyPrintQuotaUser): Request[GoogleLongrunningOperation] = js.native
  
  var flows: FlowsResource = js.native
  
  /** Retrieves the specified agent. */
  def get(): Request[GoogleCloudDialogflowCxV3Agent] = js.native
  def get(request: Accesstoken): Request[GoogleCloudDialogflowCxV3Agent] = js.native
  
  /** Gets the latest agent validation result. Agent validation is performed when ValidateAgent is called. */
  def getValidationResult(): Request[GoogleCloudDialogflowCxV3AgentValidationResult] = js.native
  def getValidationResult(request: Key): Request[GoogleCloudDialogflowCxV3AgentValidationResult] = js.native
  
  var intents: IntentsResource = js.native
  
  /** Returns the list of all agents in the specified location. */
  def list(): Request[GoogleCloudDialogflowCxV3ListAgentsResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudDialogflowCxV3ListAgentsResponse] = js.native
  
  /**
    * Updates the specified agent. Note: You should always train flows prior to sending them queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def patch(request: PrettyPrintQuotaUserResource): Request[GoogleCloudDialogflowCxV3Agent] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDialogflowCxV3Agent): Request[GoogleCloudDialogflowCxV3Agent] = js.native
  
  def restore(request: Accesstoken, body: GoogleCloudDialogflowCxV3RestoreAgentRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Restores the specified agent from a binary file. Replaces the current agent with a new one. Note that all existing resources in agent (e.g. intents, entity types, flows) will be
    * removed. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following
    * method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: An [Empty
    * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty) Note: You should always train flows prior to sending them queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def restore(request: QuotaUserResourceUploadType): Request[GoogleLongrunningOperation] = js.native
  
  var sessions: SessionsResource = js.native
  
  var testCases: TestCasesResource = js.native
  
  def validate(request: Accesstoken, body: GoogleCloudDialogflowCxV3ValidateAgentRequest): Request[GoogleCloudDialogflowCxV3AgentValidationResult] = js.native
  /**
    * Validates the specified agent and creates or updates validation results. The agent in draft version is validated. Please call this API after the training is completed to get the
    * complete validation results.
    */
  def validate(request: ResourceUploadTypeUploadprotocol): Request[GoogleCloudDialogflowCxV3AgentValidationResult] = js.native
  
  var webhooks: WebhooksResource = js.native
}
