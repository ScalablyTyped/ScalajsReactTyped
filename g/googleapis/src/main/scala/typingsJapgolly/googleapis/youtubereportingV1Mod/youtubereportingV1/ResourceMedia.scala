package typingsJapgolly.googleapis.youtubereportingV1Mod.youtubereportingV1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtubereporting/v1", "youtubereporting_v1.Resource$Media")
@js.native
class ResourceMedia protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtubereporting.media.download
    * @desc Method for media download. Download is supported on the URI
    * `/v1/media/{+name}?alt=media`.
    * @alias youtubereporting.media.download
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName Name of the media that is being downloaded.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def download(): GaxiosPromise[SchemaGdataMedia] = js.native
  def download(callback: BodyResponseCallback[SchemaGdataMedia]): Unit = js.native
  def download(params: ParamsResourceMediaDownload): GaxiosPromise[SchemaGdataMedia] = js.native
  def download(params: ParamsResourceMediaDownload, callback: BodyResponseCallback[SchemaGdataMedia]): Unit = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: BodyResponseCallback[SchemaGdataMedia],
    callback: BodyResponseCallback[SchemaGdataMedia]
  ): Unit = js.native
  def download(params: ParamsResourceMediaDownload, options: MethodOptions): GaxiosPromise[SchemaGdataMedia] = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGdataMedia]
  ): Unit = js.native
}

