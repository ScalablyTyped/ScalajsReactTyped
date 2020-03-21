package typingsJapgolly.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vision/v1p2beta1", "vision_v1p2beta1.Resource$Images")
@js.native
class ResourceImages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * vision.images.annotate
    * @desc Run image detection and annotation for a batch of images.
    * @alias vision.images.annotate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GoogleCloudVisionV1p2beta1BatchAnnotateImagesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def annotate(): GaxiosPromise[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse] = js.native
  def annotate(callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse]): Unit = js.native
  def annotate(params: ParamsResourceImagesAnnotate): GaxiosPromise[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse] = js.native
  def annotate(
    params: ParamsResourceImagesAnnotate,
    callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse]
  ): Unit = js.native
  def annotate(
    params: ParamsResourceImagesAnnotate,
    options: BodyResponseCallback[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse]
  ): Unit = js.native
  def annotate(params: ParamsResourceImagesAnnotate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse] = js.native
  def annotate(
    params: ParamsResourceImagesAnnotate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse]
  ): Unit = js.native
}

