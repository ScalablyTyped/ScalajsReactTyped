package typingsJapgolly.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects")
@js.native
class ResourceProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var agent: ResourceProjectsAgent = js.native
  var context: APIRequestContext = js.native
  var knowledgeBases: ResourceProjectsKnowledgebases = js.native
  var operations: ResourceProjectsOperations = js.native
  /**
    * dialogflow.projects.getAgent
    * @desc Retrieves the specified agent.
    * @alias dialogflow.projects.getAgent
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project that the agent to fetch is associated with. Format: `projects/<Project ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAgent(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Agent] = js.native
  def getAgent(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Agent]): Unit = js.native
  def getAgent(params: ParamsResourceProjectsGetagent): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Agent] = js.native
  def getAgent(
    params: ParamsResourceProjectsGetagent,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Agent]
  ): Unit = js.native
  def getAgent(
    params: ParamsResourceProjectsGetagent,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Agent],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Agent]
  ): Unit = js.native
  def getAgent(params: ParamsResourceProjectsGetagent, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Agent] = js.native
  def getAgent(
    params: ParamsResourceProjectsGetagent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Agent]
  ): Unit = js.native
}

