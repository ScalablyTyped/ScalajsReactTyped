package typingsJapgolly.googleapis.iamV1Mod.iamV1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Permissions")
@js.native
class ResourcePermissions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * iam.permissions.queryTestablePermissions
    * @desc Lists the permissions testable on a resource. A permission is
    * testable if it can be tested for an identity on a resource.
    * @alias iam.permissions.queryTestablePermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().QueryTestablePermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def queryTestablePermissions(): GaxiosPromise[SchemaQueryTestablePermissionsResponse] = js.native
  def queryTestablePermissions(callback: BodyResponseCallback[SchemaQueryTestablePermissionsResponse]): Unit = js.native
  def queryTestablePermissions(params: ParamsResourcePermissionsQuerytestablepermissions): GaxiosPromise[SchemaQueryTestablePermissionsResponse] = js.native
  def queryTestablePermissions(
    params: ParamsResourcePermissionsQuerytestablepermissions,
    callback: BodyResponseCallback[SchemaQueryTestablePermissionsResponse]
  ): Unit = js.native
  def queryTestablePermissions(
    params: ParamsResourcePermissionsQuerytestablepermissions,
    options: BodyResponseCallback[SchemaQueryTestablePermissionsResponse],
    callback: BodyResponseCallback[SchemaQueryTestablePermissionsResponse]
  ): Unit = js.native
  def queryTestablePermissions(params: ParamsResourcePermissionsQuerytestablepermissions, options: MethodOptions): GaxiosPromise[SchemaQueryTestablePermissionsResponse] = js.native
  def queryTestablePermissions(
    params: ParamsResourcePermissionsQuerytestablepermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueryTestablePermissionsResponse]
  ): Unit = js.native
}

