package typingsJapgolly.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/videointelligence/v1p2beta1", "videointelligence_v1p2beta1.Resource$Videos")
@js.native
class ResourceVideos protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * videointelligence.videos.annotate
    * @desc Performs asynchronous video annotation. Progress and results can be
    * retrieved through the `google.longrunning.Operations` interface.
    * `Operation.metadata` contains `AnnotateVideoProgress` (progress).
    * `Operation.response` contains `AnnotateVideoResponse` (results).
    * @alias videointelligence.videos.annotate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GoogleCloudVideointelligenceV1p2beta1_AnnotateVideoRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def annotate(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def annotate(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def annotate(params: ParamsResourceVideosAnnotate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def annotate(
    params: ParamsResourceVideosAnnotate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def annotate(
    params: ParamsResourceVideosAnnotate,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def annotate(params: ParamsResourceVideosAnnotate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def annotate(
    params: ParamsResourceVideosAnnotate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
}

