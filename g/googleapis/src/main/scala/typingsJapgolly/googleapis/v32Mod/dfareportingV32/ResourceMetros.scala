package typingsJapgolly.googleapis.v32Mod.dfareportingV32

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Metros")
@js.native
class ResourceMetros protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.metros.list
    * @desc Retrieves a list of metros.
    * @alias dfareporting.metros.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaMetrosListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaMetrosListResponse]): Unit = js.native
  def list(params: ParamsResourceMetrosList): GaxiosPromise[SchemaMetrosListResponse] = js.native
  def list(params: ParamsResourceMetrosList, callback: BodyResponseCallback[SchemaMetrosListResponse]): Unit = js.native
  def list(
    params: ParamsResourceMetrosList,
    options: BodyResponseCallback[SchemaMetrosListResponse],
    callback: BodyResponseCallback[SchemaMetrosListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMetrosList, options: MethodOptions): GaxiosPromise[SchemaMetrosListResponse] = js.native
  def list(
    params: ParamsResourceMetrosList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetrosListResponse]
  ): Unit = js.native
}

