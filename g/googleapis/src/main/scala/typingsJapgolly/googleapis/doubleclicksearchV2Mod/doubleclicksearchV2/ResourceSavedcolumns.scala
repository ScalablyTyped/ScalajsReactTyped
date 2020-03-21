package typingsJapgolly.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/doubleclicksearch/v2", "doubleclicksearch_v2.Resource$Savedcolumns")
@js.native
class ResourceSavedcolumns protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * doubleclicksearch.savedColumns.list
    * @desc Retrieve the list of saved columns for a specified advertiser.
    * @alias doubleclicksearch.savedColumns.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.advertiserId DS ID of the advertiser.
    * @param {string} params.agencyId DS ID of the agency.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSavedColumnList] = js.native
  def list(callback: BodyResponseCallback[SchemaSavedColumnList]): Unit = js.native
  def list(params: ParamsResourceSavedcolumnsList): GaxiosPromise[SchemaSavedColumnList] = js.native
  def list(params: ParamsResourceSavedcolumnsList, callback: BodyResponseCallback[SchemaSavedColumnList]): Unit = js.native
  def list(
    params: ParamsResourceSavedcolumnsList,
    options: BodyResponseCallback[SchemaSavedColumnList],
    callback: BodyResponseCallback[SchemaSavedColumnList]
  ): Unit = js.native
  def list(params: ParamsResourceSavedcolumnsList, options: MethodOptions): GaxiosPromise[SchemaSavedColumnList] = js.native
  def list(
    params: ParamsResourceSavedcolumnsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedColumnList]
  ): Unit = js.native
}

