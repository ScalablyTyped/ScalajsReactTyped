package typingsJapgolly.googleapis.v3Mod.analyticsV3

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Userdeletion$Userdeletionrequest")
@js.native
class ResourceUserdeletionUserdeletionrequest protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.userDeletion.userDeletionRequest.upsert
    * @desc Insert or update a user deletion requests.
    * @alias analytics.userDeletion.userDeletionRequest.upsert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().UserDeletionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upsert(): GaxiosPromise[SchemaUserDeletionRequest] = js.native
  def upsert(callback: BodyResponseCallback[SchemaUserDeletionRequest]): Unit = js.native
  def upsert(params: ParamsResourceUserdeletionUserdeletionrequestUpsert): GaxiosPromise[SchemaUserDeletionRequest] = js.native
  def upsert(
    params: ParamsResourceUserdeletionUserdeletionrequestUpsert,
    callback: BodyResponseCallback[SchemaUserDeletionRequest]
  ): Unit = js.native
  def upsert(
    params: ParamsResourceUserdeletionUserdeletionrequestUpsert,
    options: BodyResponseCallback[SchemaUserDeletionRequest],
    callback: BodyResponseCallback[SchemaUserDeletionRequest]
  ): Unit = js.native
  def upsert(params: ParamsResourceUserdeletionUserdeletionrequestUpsert, options: MethodOptions): GaxiosPromise[SchemaUserDeletionRequest] = js.native
  def upsert(
    params: ParamsResourceUserdeletionUserdeletionrequestUpsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserDeletionRequest]
  ): Unit = js.native
}

