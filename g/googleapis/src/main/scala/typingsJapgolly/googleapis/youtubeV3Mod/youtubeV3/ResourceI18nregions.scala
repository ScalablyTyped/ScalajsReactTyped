package typingsJapgolly.googleapis.youtubeV3Mod.youtubeV3

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$I18nregions")
@js.native
class ResourceI18nregions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.i18nRegions.list
    * @desc Returns a list of content regions that the YouTube website
    * supports.
    * @alias youtube.i18nRegions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.hl The hl parameter specifies the language that should be used for text values in the API response.
    * @param {string} params.part The part parameter specifies the i18nRegion resource properties that the API response will include. Set the parameter value to snippet.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaI18nRegionListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaI18nRegionListResponse]): Unit = js.native
  def list(params: ParamsResourceI18nregionsList): GaxiosPromise[SchemaI18nRegionListResponse] = js.native
  def list(
    params: ParamsResourceI18nregionsList,
    callback: BodyResponseCallback[SchemaI18nRegionListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceI18nregionsList,
    options: BodyResponseCallback[SchemaI18nRegionListResponse],
    callback: BodyResponseCallback[SchemaI18nRegionListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceI18nregionsList, options: MethodOptions): GaxiosPromise[SchemaI18nRegionListResponse] = js.native
  def list(
    params: ParamsResourceI18nregionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaI18nRegionListResponse]
  ): Unit = js.native
}

