package typingsJapgolly.googleapis.v1beta4Mod.sqladminV1beta4

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Tiers")
@js.native
class ResourceTiers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sql.tiers.list
    * @desc Lists all available machine types (tiers) for Cloud SQL, for
    * example, db-n1-standard-1. For related information, see Pricing.
    * @alias sql.tiers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID of the project for which to list tiers.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTiersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaTiersListResponse]): Unit = js.native
  def list(params: ParamsResourceTiersList): GaxiosPromise[SchemaTiersListResponse] = js.native
  def list(params: ParamsResourceTiersList, callback: BodyResponseCallback[SchemaTiersListResponse]): Unit = js.native
  def list(
    params: ParamsResourceTiersList,
    options: BodyResponseCallback[SchemaTiersListResponse],
    callback: BodyResponseCallback[SchemaTiersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTiersList, options: MethodOptions): GaxiosPromise[SchemaTiersListResponse] = js.native
  def list(
    params: ParamsResourceTiersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTiersListResponse]
  ): Unit = js.native
}

