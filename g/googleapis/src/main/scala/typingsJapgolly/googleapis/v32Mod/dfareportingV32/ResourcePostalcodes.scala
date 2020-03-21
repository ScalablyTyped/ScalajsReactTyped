package typingsJapgolly.googleapis.v32Mod.dfareportingV32

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Postalcodes")
@js.native
class ResourcePostalcodes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.postalCodes.get
    * @desc Gets one postal code by ID.
    * @alias dfareporting.postalCodes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.code Postal code ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPostalCode] = js.native
  def get(callback: BodyResponseCallback[SchemaPostalCode]): Unit = js.native
  def get(params: ParamsResourcePostalcodesGet): GaxiosPromise[SchemaPostalCode] = js.native
  def get(params: ParamsResourcePostalcodesGet, callback: BodyResponseCallback[SchemaPostalCode]): Unit = js.native
  def get(
    params: ParamsResourcePostalcodesGet,
    options: BodyResponseCallback[SchemaPostalCode],
    callback: BodyResponseCallback[SchemaPostalCode]
  ): Unit = js.native
  def get(params: ParamsResourcePostalcodesGet, options: MethodOptions): GaxiosPromise[SchemaPostalCode] = js.native
  def get(
    params: ParamsResourcePostalcodesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostalCode]
  ): Unit = js.native
  /**
    * dfareporting.postalCodes.list
    * @desc Retrieves a list of postal codes.
    * @alias dfareporting.postalCodes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPostalCodesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPostalCodesListResponse]): Unit = js.native
  def list(params: ParamsResourcePostalcodesList): GaxiosPromise[SchemaPostalCodesListResponse] = js.native
  def list(
    params: ParamsResourcePostalcodesList,
    callback: BodyResponseCallback[SchemaPostalCodesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePostalcodesList,
    options: BodyResponseCallback[SchemaPostalCodesListResponse],
    callback: BodyResponseCallback[SchemaPostalCodesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePostalcodesList, options: MethodOptions): GaxiosPromise[SchemaPostalCodesListResponse] = js.native
  def list(
    params: ParamsResourcePostalcodesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostalCodesListResponse]
  ): Unit = js.native
}

