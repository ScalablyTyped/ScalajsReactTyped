package typingsJapgolly.googleapis.speechV1Mod.speechV1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/speech/v1", "speech_v1.Resource$Projects$Operations$Manualrecognitiontasks")
@js.native
class ResourceProjectsOperationsManualrecognitiontasks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * speech.projects.operations.manualRecognitionTasks.get
    * @desc Gets the latest state of a long-running operation.  Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias speech.projects.operations.manualRecognitionTasks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOperation] = js.native
  def get(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(params: ParamsResourceProjectsOperationsManualrecognitiontasksGet): GaxiosPromise[SchemaOperation] = js.native
  def get(
    params: ParamsResourceProjectsOperationsManualrecognitiontasksGet,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsOperationsManualrecognitiontasksGet,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsOperationsManualrecognitiontasksGet, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(
    params: ParamsResourceProjectsOperationsManualrecognitiontasksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

