package typingsJapgolly.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudfunctions/v1beta2", "cloudfunctions_v1beta2.Resource$Projects$Locations")
@js.native
class ResourceProjectsLocations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var functions: ResourceProjectsLocationsFunctions = js.native
  /**
    * cloudfunctions.projects.locations.list
    * @desc Lists information about the supported locations for this service.
    * @alias cloudfunctions.projects.locations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The standard list filter.
    * @param {string} params.name The resource that owns the locations collection, if applicable.
    * @param {integer=} params.pageSize The standard list page size.
    * @param {string=} params.pageToken The standard list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLocationsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsList): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    options: BodyResponseCallback[SchemaListLocationsResponse],
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsList, options: MethodOptions): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
}

