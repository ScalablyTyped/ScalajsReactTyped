package typingsJapgolly.googleapis.v1Mod.abusiveexperiencereportV1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/abusiveexperiencereport/v1", "abusiveexperiencereport_v1.Resource$Violatingsites")
@js.native
class ResourceViolatingsites protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * abusiveexperiencereport.violatingSites.list
    * @desc Lists sites with Abusive Experience Report statuses of "Failing".
    * @alias abusiveexperiencereport.violatingSites.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaViolatingSitesResponse]): Unit = js.native
  def list(params: ParamsResourceViolatingsitesList): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
  def list(
    params: ParamsResourceViolatingsitesList,
    callback: BodyResponseCallback[SchemaViolatingSitesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceViolatingsitesList,
    options: BodyResponseCallback[SchemaViolatingSitesResponse],
    callback: BodyResponseCallback[SchemaViolatingSitesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceViolatingsitesList, options: MethodOptions): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
  def list(
    params: ParamsResourceViolatingsitesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaViolatingSitesResponse]
  ): Unit = js.native
}

