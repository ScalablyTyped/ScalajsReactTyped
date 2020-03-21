package typingsJapgolly.googleapis.v32Mod.dfareportingV32

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Browsers")
@js.native
class ResourceBrowsers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.browsers.list
    * @desc Retrieves a list of browsers.
    * @alias dfareporting.browsers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaBrowsersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaBrowsersListResponse]): Unit = js.native
  def list(params: ParamsResourceBrowsersList): GaxiosPromise[SchemaBrowsersListResponse] = js.native
  def list(params: ParamsResourceBrowsersList, callback: BodyResponseCallback[SchemaBrowsersListResponse]): Unit = js.native
  def list(
    params: ParamsResourceBrowsersList,
    options: BodyResponseCallback[SchemaBrowsersListResponse],
    callback: BodyResponseCallback[SchemaBrowsersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBrowsersList, options: MethodOptions): GaxiosPromise[SchemaBrowsersListResponse] = js.native
  def list(
    params: ParamsResourceBrowsersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBrowsersListResponse]
  ): Unit = js.native
}

