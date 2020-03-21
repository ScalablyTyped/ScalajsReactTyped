package typingsJapgolly.googleapis.v3Mod.analyticsV3

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Clientid")
@js.native
class ResourceManagementClientid protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.clientId.hashClientId
    * @desc Hashes the given Client ID.
    * @alias analytics.management.clientId.hashClientId
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().HashClientIdRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def hashClientId(): GaxiosPromise[SchemaHashClientIdResponse] = js.native
  def hashClientId(callback: BodyResponseCallback[SchemaHashClientIdResponse]): Unit = js.native
  def hashClientId(params: ParamsResourceManagementClientidHashclientid): GaxiosPromise[SchemaHashClientIdResponse] = js.native
  def hashClientId(
    params: ParamsResourceManagementClientidHashclientid,
    callback: BodyResponseCallback[SchemaHashClientIdResponse]
  ): Unit = js.native
  def hashClientId(
    params: ParamsResourceManagementClientidHashclientid,
    options: BodyResponseCallback[SchemaHashClientIdResponse],
    callback: BodyResponseCallback[SchemaHashClientIdResponse]
  ): Unit = js.native
  def hashClientId(params: ParamsResourceManagementClientidHashclientid, options: MethodOptions): GaxiosPromise[SchemaHashClientIdResponse] = js.native
  def hashClientId(
    params: ParamsResourceManagementClientidHashclientid,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHashClientIdResponse]
  ): Unit = js.native
}

