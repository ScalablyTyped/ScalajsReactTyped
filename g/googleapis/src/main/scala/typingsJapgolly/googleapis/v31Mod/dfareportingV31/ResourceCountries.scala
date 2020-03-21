package typingsJapgolly.googleapis.v31Mod.dfareportingV31

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Countries")
@js.native
class ResourceCountries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.countries.get
    * @desc Gets one country by ID.
    * @alias dfareporting.countries.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dartId Country DART ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCountry] = js.native
  def get(callback: BodyResponseCallback[SchemaCountry]): Unit = js.native
  def get(params: ParamsResourceCountriesGet): GaxiosPromise[SchemaCountry] = js.native
  def get(params: ParamsResourceCountriesGet, callback: BodyResponseCallback[SchemaCountry]): Unit = js.native
  def get(
    params: ParamsResourceCountriesGet,
    options: BodyResponseCallback[SchemaCountry],
    callback: BodyResponseCallback[SchemaCountry]
  ): Unit = js.native
  def get(params: ParamsResourceCountriesGet, options: MethodOptions): GaxiosPromise[SchemaCountry] = js.native
  def get(
    params: ParamsResourceCountriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCountry]
  ): Unit = js.native
  /**
    * dfareporting.countries.list
    * @desc Retrieves a list of countries.
    * @alias dfareporting.countries.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCountriesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCountriesListResponse]): Unit = js.native
  def list(params: ParamsResourceCountriesList): GaxiosPromise[SchemaCountriesListResponse] = js.native
  def list(params: ParamsResourceCountriesList, callback: BodyResponseCallback[SchemaCountriesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceCountriesList,
    options: BodyResponseCallback[SchemaCountriesListResponse],
    callback: BodyResponseCallback[SchemaCountriesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCountriesList, options: MethodOptions): GaxiosPromise[SchemaCountriesListResponse] = js.native
  def list(
    params: ParamsResourceCountriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCountriesListResponse]
  ): Unit = js.native
}

