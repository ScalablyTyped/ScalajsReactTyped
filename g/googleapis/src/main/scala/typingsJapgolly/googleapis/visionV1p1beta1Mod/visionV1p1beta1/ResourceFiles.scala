package typingsJapgolly.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vision/v1p1beta1", "vision_v1p1beta1.Resource$Files")
@js.native
class ResourceFiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * vision.files.asyncBatchAnnotate
    * @desc Run asynchronous image detection and annotation for a list of
    * generic files, such as PDF files, which may contain multiple pages and
    * multiple images per page. Progress and results can be retrieved through
    * the `google.longrunning.Operations` interface. `Operation.metadata`
    * contains `OperationMetadata` (metadata). `Operation.response` contains
    * `AsyncBatchAnnotateFilesResponse` (results).
    * @alias vision.files.asyncBatchAnnotate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def asyncBatchAnnotate(): GaxiosPromise[SchemaOperation] = js.native
  def asyncBatchAnnotate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def asyncBatchAnnotate(params: ParamsResourceFilesAsyncbatchannotate): GaxiosPromise[SchemaOperation] = js.native
  def asyncBatchAnnotate(params: ParamsResourceFilesAsyncbatchannotate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def asyncBatchAnnotate(
    params: ParamsResourceFilesAsyncbatchannotate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def asyncBatchAnnotate(params: ParamsResourceFilesAsyncbatchannotate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def asyncBatchAnnotate(
    params: ParamsResourceFilesAsyncbatchannotate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

